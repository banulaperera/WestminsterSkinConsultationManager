import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorListGUI extends JFrame implements ActionListener {
    private JButton backToHomeBtn;
    DoctorListGUI(){
        final JPanel rightSidePanel, bottomPanel, leftSidePanel;
        final JLabel rightLabel, leftLabel, bottomLabel;

        //Right Panel
        rightLabel = new JLabel(new ImageIcon("r.jpg"));
        rightLabel.setBounds(0,0, 150, 580);
        rightSidePanel = new JPanel();
        rightSidePanel.setBounds(0,120, 150, 580);
        rightSidePanel.add(rightLabel);

        //Bottom panel
        bottomLabel = new JLabel(new ImageIcon("b.jpg"));
        bottomLabel.setBounds(0, 0,1440, 75);
        bottomPanel = new JPanel();
        bottomPanel.setBounds(0, 700, 1440,75);
        bottomPanel.add(bottomLabel);

        //Left panel
        leftLabel = new JLabel(new ImageIcon("l.jpg"));
        leftLabel.setBounds(0, 0, 150, 580);
        leftSidePanel = new JPanel();
        leftSidePanel.setBounds(1290,120, 150, 580);
        leftSidePanel.add(leftLabel);

        //Code for the Frame
        this.setTitle("Westminster Skin Consultation Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1440, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(rightSidePanel);
        this.add(UpperPanel());
        this.add(bottomPanel);
        this.add(leftSidePanel);
        this.add(ScrollPane());
    }

    private JPanel UpperPanel(){
        final JPanel upperPanel;
        final JLabel upperLabel;

        backToHomeBtn = new JButton();
        backToHomeBtn.setBounds(1190, 35, 100, 50);
        backToHomeBtn.setIcon(new ImageIcon("HomeIcon.png"));
        backToHomeBtn.addActionListener(this);

        JLabel label = new JLabel("Doctor Information");
        label.setBounds(150, 35, 350, 50);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MV Boli", Font.BOLD,30));

        upperLabel = new JLabel(new ImageIcon("u.jpg"));
        upperLabel.setBounds(0, 0, 1440, 120);

        upperPanel = new JPanel();
        upperPanel.setBounds(0, 0, 1440, 120);
        upperPanel.add(upperLabel);
        upperLabel.add(label);
        upperLabel.add(backToHomeBtn);

        return upperPanel;
    }

    private JScrollPane ScrollPane(){
        final JScrollPane scrollPane;

        JTable table = new JTable();
        Object[] columns = {"Medical License Number", "First Name", "Last Name", "Date Of Birth", "Gender", "Mobile Number", "Specialization"};
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setSelectionBackground(new Color(224, 213, 247));
        table.setSelectionForeground(Color.BLACK);
        table.setGridColor(Color.BLACK);
        table.setFont(new Font("Calibri", Font.PLAIN,12));
        table.setRowHeight(50);
        table.getTableHeader().setFont(new Font("Calibri", Font.BOLD,13));
        table.getTableHeader().setPreferredSize(new Dimension(90,60));

        Object[] row = new Object[7];

        for (Doctor doc:
                WestminsterSkinConsultationManager.list){
            row[0] = doc.getMedicalLicenseNumber();
            row[1] = doc.getName();
            row[2] = doc.getSurname();
            row[3] = doc.getdOB();
            row[4] = doc.getGender();
            row[5] = doc.getMobileNumber();
            row[6] = doc.getSpecialization();

            model.addRow(row);
        }

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(150, 120, 1140,583);
        return scrollPane;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backToHomeBtn){
            this.dispose();
            new HomePageGUI();
        }
    }
}
