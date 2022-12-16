import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class DoctorListGUI extends JFrame {
    private JButton backToHomeBtn;

    DoctorListGUI(){
        final JPanel rightSidePanel, bottomPanel, leftSidePanel;
        final JLabel rightLabel, leftLabel, bottomLabel;

        //Left Panel
        leftLabel = new JLabel(new ImageIcon("r.jpg"));
        leftLabel.setBounds(0,0, 150, 580);
        leftSidePanel = new JPanel();
        leftSidePanel.setBounds(0,120, 70, 580);
        leftSidePanel.add(leftLabel);

        //Bottom panel
        JLabel createdWord = new JLabel("Created by Banula Perera");
        createdWord.setBounds(650,30, 200,20);
        createdWord.setFont(new Font("MV Boli", Font.ITALIC,15));

        bottomLabel = new JLabel(new ImageIcon("b.jpg"));
        bottomLabel.setBounds(0, 0,1440, 75);
        bottomPanel = new JPanel();
        bottomPanel.setBounds(0, 700, 1440,75);
        bottomLabel.add(createdWord);
        bottomPanel.add(bottomLabel);

        //Right panel
        rightLabel = new JLabel(new ImageIcon("l.jpg"));
        rightLabel.setBounds(0, 0, 150, 580);
        rightSidePanel = new JPanel();
        rightSidePanel.setBounds(1370,120, 70, 580);
        rightSidePanel.add(rightLabel);

        //Code for the Frame
        this.setTitle("Westminster Skin Consultation Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1440, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(leftSidePanel);
        this.add(UpperPanel());
        this.add(bottomPanel);
        this.add(rightSidePanel);
        this.add(ScrollPane());
    }

    private JPanel UpperPanel(){
        final JPanel upperPanel;
        final JLabel upperLabel;

        backToHomeBtn = new JButton();
        backToHomeBtn.setBounds(1270, 35, 100, 50);
        backToHomeBtn.setIcon(new ImageIcon("HomeIcon.png"));
        backToHomeBtn.addActionListener(e -> {
            if (e.getSource() == backToHomeBtn){
                backToHomeBtn.setBackground(new Color(224, 213, 247));
                this.dispose();
                new HomePageGUI();
            }
        });

        JButton sortBtn = new JButton();
        sortBtn.setBounds(1100, 35, 150, 50);
        sortBtn.setText("Sort by Surname");
        sortBtn.setFont(new Font("Comic Sans", Font.ITALIC,15));

        JLabel label = new JLabel("Doctor Information");
        label.setIcon(new ImageIcon("DoctorIcon.png"));
        label.setBounds(68, 35, 450, 70);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MV Boli", Font.BOLD,30));

        upperLabel = new JLabel(new ImageIcon("u.jpg"));
        upperLabel.setBounds(0, 0, 1440, 120);

        upperPanel = new JPanel();
        upperPanel.setBounds(0, 0, 1440, 120);
        upperPanel.add(upperLabel);
        upperLabel.add(label);
        upperLabel.add(backToHomeBtn);
        upperLabel.add(sortBtn);

        return upperPanel;
    }

    private JScrollPane ScrollPane(){
        final JScrollPane scrollPane;

        JTable table = new JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        Object[] columns = {"Medical License Number", "First Name", "Last Name", "Date Of Birth", "Gender", "Mobile Number", "Specialization"};
        DefaultTableModel model = new DefaultTableModel();

        model.setColumnIdentifiers(columns);
        table.setModel(model);

        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setSelectionBackground(new Color(224, 213, 247));
        table.setSelectionForeground(Color.BLACK);
        table.setGridColor(Color.BLACK);
        table.setFont(new Font("Calibri", Font.PLAIN,13));
        table.setRowHeight(60);
        table.getTableHeader().setFont(new Font("Calibri", Font.BOLD,14));
        table.getTableHeader().setPreferredSize(new Dimension(90,70));

        Object[] row = new Object[7];
        for (Doctor doc:
                WestminsterSkinConsultationManager.list){
            row[0] = doc.getMedicalLicenseNumber();
            row[1] = doc.getName();
            row[2] = doc.getSurname();
            row[3] = WestminsterSkinConsultationManager.dateFormat.format(doc.getdOB());
            row[4] = doc.getGender();
            row[5] = doc.getMobileNumber();
            row[6] = doc.getSpecialization();

            model.addRow(row);
        }

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 120, 1300,583);
        return scrollPane;
    }
}
