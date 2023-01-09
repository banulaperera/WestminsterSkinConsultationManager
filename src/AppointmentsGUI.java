import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileOutputStream;
import java.io.IOException;

public class AppointmentsGUI extends JFrame {
    AppointmentsGUI() {
        this.setTitle("Westminster Skin Consultation Manager");
        this.setSize(1300, 683);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(table());
        this.add(upperPanel());
        this.add(leftPanel());
        this.add(downPanel());
        this.add(rightPanel());
    }

    private JPanel upperPanel() {
        JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon("AppointmentU.jpeg"));
        jLabel.setBounds(0, 0, 1300, 85);

        JLabel jLabel1 = new JLabel();
        jLabel1.setIcon(new ImageIcon("ConsultationIcon.png"));
        jLabel1.setBounds(60, 5, 70, 70);

        JPanel jPanel = new JPanel();
        jPanel.setBounds(0, 0, 1300, 85);
        jLabel.add(jLabel1);
        jPanel.add(jLabel);
        return jPanel;
    }

    private JPanel leftPanel() {
        JLabel jLabel = new JLabel();
        jLabel.setBounds(0, 0, 60, 683);
        jLabel.setIcon(new ImageIcon("AppointmentL.jpeg"));

        JPanel jPanel = new JPanel();
        jPanel.setBounds(0, 80, 60, 683);
        jPanel.add(jLabel);
        return jPanel;
    }

    private JPanel rightPanel() {
        JLabel jLabel = new JLabel();
        jLabel.setBounds(0, 0, 70, 500);
        jLabel.setIcon(new ImageIcon("AppointmentR.jpeg"));

        JPanel jPanel = new JPanel();
        jPanel.setBounds(1230, 80, 70, 500);
        jPanel.add(jLabel);
        return jPanel;
    }

    private JPanel downPanel() {
        JLabel jLabel = new JLabel();
        jLabel.setBounds(0, 0, 1300, 85);
        jLabel.setIcon(new ImageIcon("AppointmentB.jpeg"));

        JPanel jPanel = new JPanel();
        jPanel.setBounds(60, 580, 1300, 98);
        jPanel.add(jLabel);
        return jPanel;
    }

    private JScrollPane table() {
        AppointmentTableModel appointmentTableModel = new AppointmentTableModel(ConsultationGUI.patientList, ConsultationGUI.consultationList);

        JTable table = new JTable(appointmentTableModel);
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setSelectionBackground(new Color(236, 150, 129));
        table.setSelectionForeground(Color.BLACK);
        table.setGridColor(Color.BLACK);
        table.setFont(new Font("Calibri", Font.PLAIN, 13));
        table.setRowHeight(40);
        table.getTableHeader().setFont(new Font("Calibri", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(150, 50));
        table.getTableHeader().setForeground(new Color(1, 6, 65));
        table.setAutoCreateRowSorter(false);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(200);
        table.getColumnModel().getColumn(2).setPreferredWidth(200);
        table.getColumnModel().getColumn(3).setPreferredWidth(120);
        table.getColumnModel().getColumn(4).setPreferredWidth(90);
        table.getColumnModel().getColumn(5).setPreferredWidth(150);
        table.getColumnModel().getColumn(6).setPreferredWidth(200);
        table.getColumnModel().getColumn(7).setPreferredWidth(200);
        table.getColumnModel().getColumn(8).setPreferredWidth(200);
        table.getColumnModel().getColumn(9).setPreferredWidth(170);
        table.getColumnModel().getColumn(10).setPreferredWidth(60);

        JMenuItem delete = new JMenuItem("Delete selected Consultation");
        delete.setIcon(new ImageIcon("delete.png"));
        delete.setIconTextGap(20);
        delete.addActionListener(ae -> {
            if (table.getSelectedRow() != -1) {
                int yesOrNo = JOptionPane.showConfirmDialog(null, "Do you want to delete the Consultation?", "CONFIRM", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, new ImageIcon("Question.png"));
                if (yesOrNo == 0) {
                    appointmentTableModel.deleteRow(table.getSelectedRow());
                    ConsultationGUI.saveInFile();
                    JOptionPane.showMessageDialog(null, "Deleted Successfully!", "ALERT!", JOptionPane.INFORMATION_MESSAGE, new ImageIcon("confirm.png"));
                }

            } else {
                JOptionPane.showMessageDialog(null, "Please select a row to be deleted!", "ALERT!", JOptionPane.WARNING_MESSAGE, new ImageIcon("AlertIcon.png"));
            }
        });

        JMenuItem image = new JMenuItem("Additional Details");
        image.setIcon(new ImageIcon("list.png"));
        image.setIconTextGap(20);
        image.addActionListener(ae -> {
            if (table.getSelectedRow() != -1) {
                Consultation consultation = ConsultationGUI.consultationList.get(table.getSelectedRow());
                Patient patient = ConsultationGUI.patientList.get(table.getSelectedRow());
                byte[] bytes;
                try {
                    if (consultation.getFileDestination() != null) {
                        bytes = consultation.getBytes();
                        byte[] temp = new byte[bytes.length];

                        for (int i = 0; i < bytes.length; i++) {
                            temp[i] = (byte) (bytes[i] ^ 50);
                        }
                        FileOutputStream fileOutputStream = new FileOutputStream(consultation.getFileDestination());
                        fileOutputStream.write(temp);
                        fileOutputStream.close();
                        String path = consultation.getFileDestination().getPath();
                        Encryption encryption = new Encryption();
                        String name = encryption.decrypt(consultation.getChars(), consultation.getKey());
                        new PatientDetailsGUI(path, patient.getId(), name);

                    } else {
                        JOptionPane.showMessageDialog(null, "No special Details to show on this patient!", "ALERT!", JOptionPane.WARNING_MESSAGE, new ImageIcon("AlertIcon.png"));
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please select a row!", "ALERT!", JOptionPane.WARNING_MESSAGE, new ImageIcon("AlertIcon.png"));
            }
        });

        JPopupMenu jPopupMenu = new JPopupMenu();
        jPopupMenu.add(delete);
        JSeparator jSeparator = new JSeparator(SwingConstants.HORIZONTAL);
        jPopupMenu.add(jSeparator);
        jPopupMenu.add(image);
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    jPopupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        JScrollPane jScrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane.setBounds(60, 85, 1170, 500);
        jScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        return jScrollPane;
    }
}
