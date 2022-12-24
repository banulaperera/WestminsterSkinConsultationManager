import javax.swing.*;
import java.awt.*;

public class ConsultationGUI extends JFrame {
    private JButton backToHomeBtn;
    JFrame jFrame;
    ConsultationGUI(){
        JLabel patientDetails = new JLabel("Patient Details");
        patientDetails.setFont(new Font("MV Boli", Font.BOLD,25));
        patientDetails.setBounds(950,55, 300, 100);

        JTextField textFieldForFName = new JTextField();
        textFieldForFName.setBounds(790,150,200,40);
        textFieldForFName.setFont(new Font("MV Boli", Font.PLAIN,18));
        textFieldForFName.setBackground(new Color(207, 205, 202));

        JLabel forFirstName = new JLabel("First Name");
        forFirstName.setBounds(640,150,100,35);
        forFirstName.setFont(new Font("MV Boli", Font.BOLD,18));

        JTextField textFieldForSurname = new JTextField();
        textFieldForSurname.setBounds(1190,150,200,40);
        textFieldForSurname.setFont(new Font("MV Boli", Font.PLAIN,18));
        textFieldForSurname.setBackground(new Color(207, 205, 202));

        JLabel forSurName = new JLabel("Surname");
        forSurName.setBounds(1040,150,100,35);
        forSurName.setFont(new Font("MV Boli", Font.BOLD,18));

        JLabel labelFieldForDOB = new JLabel();
        labelFieldForDOB.setBounds(790, 230, 150,40);
        labelFieldForDOB.setFont(new Font("MV Boli", Font.PLAIN,18));
        labelFieldForDOB.setBackground(new Color(207, 205, 202));
        labelFieldForDOB.setOpaque(true);

        JButton calenderBtn = new JButton();
        calenderBtn.setBounds(945, 230, 50,40);
        calenderBtn.setIcon(new ImageIcon("calendar.png"));
        calenderBtn.addActionListener(ae -> labelFieldForDOB.setText(new DatePicker(jFrame).setPickedDate()));

        JLabel forDOB = new JLabel("Date Of Birth");
        forDOB.setBounds(640,230,150,35);
        forDOB.setFont(new Font("MV Boli", Font.BOLD,18));

        JTextField textFieldForMobile = new JTextField();
        textFieldForMobile.setBounds(1190,230,200,40);
        textFieldForMobile.setFont(new Font("MV Boli", Font.PLAIN,18));
        textFieldForMobile.setBackground(new Color(207, 205, 202));

        JLabel forMobile = new JLabel("Mobile Number");
        forMobile.setBounds(1040,230,150,35);
        forMobile.setFont(new Font("MV Boli", Font.BOLD,18));

        JSeparator jSeparator = new JSeparator();
        jSeparator.setOrientation(SwingConstants.HORIZONTAL);
        jSeparator.setBounds(640,290, 750, 10);
        jSeparator.setBackground(new Color(110, 108, 105));

        this.setTitle("Westminster Skin Consultation Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1440, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(LeftPanel());
        this.add(RightUpperPanel());
        this.add(textFieldForFName);
        this.add(patientDetails);
        this.add(forFirstName);
        this.add(textFieldForSurname);
        this.add(forSurName);
        this.add(forDOB);
        this.add(forMobile);
        this.add(textFieldForMobile);
        this.add(labelFieldForDOB);
        this.add(calenderBtn);
        this.add(jSeparator);
    }

    private JPanel LeftPanel(){
        final JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon("Consultation.jpeg"));
        jLabel.setBounds(0,0,600,800);

        JLabel label = new JLabel("Book a Consultation");
        label.setIcon(new ImageIcon("ConsultationIcon.png"));
        label.setBounds(180, 0, 840, 80);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MV Boli", Font.BOLD,30));

        final JLabel createdWord = new JLabel("Created by Banula Perera");
        createdWord.setBounds(300,720, 200,50);
        createdWord.setFont(new Font("MV Boli", Font.ITALIC,15));

        final JPanel jPanel = new JPanel();
        jPanel.setBounds(0,0,600,800);
        jLabel.add(label);
        jLabel.add(createdWord);
        jPanel.add(jLabel);
        return jPanel;
    }

    private JPanel RightUpperPanel(){
        backToHomeBtn = new JButton();
        backToHomeBtn.setBounds(700, 5, 100, 50);
        backToHomeBtn.setIcon(new ImageIcon("HomeIcon.png"));
        backToHomeBtn.addActionListener(e -> {
            if (e.getSource() == backToHomeBtn){
                backToHomeBtn.setBackground(new Color(224, 213, 247));
                this.dispose();
                new HomePageGUI();
            }
        });

        final JLabel jLabel = new JLabel();
        jLabel.setBounds(0,0,840,70);
        jLabel.setIcon(new ImageIcon("RightUpperImage.jpeg"));
        jLabel.add(backToHomeBtn);

        final JPanel jPanel = new JPanel();
        jPanel.setBounds(600,0,840,70);
        jPanel.add(jLabel);
        return jPanel;
    }
}
