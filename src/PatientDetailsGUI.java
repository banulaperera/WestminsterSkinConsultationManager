import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PatientDetailsGUI extends JFrame {
    PatientDetailsGUI(String imageSource){
        final JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon("patientDetails.jpeg"));
        jLabel.setBounds(0, 0, 700, 750);

        JLabel label = new JLabel("Patient Details");
        label.setBounds(220, 70, 300, 35);
        label.setForeground(Color.black);
        label.setFont(new Font("MV Boli", Font.BOLD, 35));
        jLabel.add(label);

        JLabel patientIDLabel = new JLabel("Patient ID");
        patientIDLabel.setBounds(280, 140, 200, 25);
        patientIDLabel.setForeground(Color.black);
        patientIDLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        jLabel.add(patientIDLabel);

        JLabel patientId = new JLabel();
        patientId.setBounds(250, 190, 200, 20);
        patientId.setBackground(new Color(255, 255, 255));
        patientId.setOpaque(true);
        patientId.setForeground(Color.BLACK);
        patientId.setFont(new Font("MV Boli", Font.PLAIN, 20));
        jLabel.add(patientId);

        JLabel specialNoteLabel = new JLabel("Special Notes");
        specialNoteLabel.setBounds(260, 240, 200, 25);
        specialNoteLabel.setForeground(Color.black);
        specialNoteLabel.setFont(new Font("MV Boli", Font.BOLD, 25));
        jLabel.add(specialNoteLabel);

        JTextArea textArea = new JTextArea(5, 1);
        textArea.setBounds(200,300,300,100);
        Border border = BorderFactory.createLineBorder(Color.black, 2);
        textArea.setFont(new Font("MV Boli", Font.PLAIN, 20));
        textArea.setBorder(border);
        textArea.setEditable(false);
        jLabel.add(textArea);

        JLabel patientsImage = new JLabel("Patient's Image");
        patientsImage.setBounds(255, 430, 200, 25);
        patientsImage.setForeground(Color.black);
        patientsImage.setFont(new Font("MV Boli", Font.BOLD, 25));
        jLabel.add(patientsImage);

        JLabel imageLabel = new JLabel();
        imageLabel.setBounds(230,470, 250, 200);
        imageLabel.setBackground(Color.WHITE);
        imageLabel.setOpaque(true);
        imageLabel.setBorder(border);
        ImageIcon imageIcon = new ImageIcon(imageSource);
        Image image1 = imageIcon.getImage().getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(),Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(image1));
        jLabel.add(imageLabel);

        this.setTitle("Westminster Skin Consultation Manager");
        this.setSize(700, 750);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(jLabel);
    }
}
