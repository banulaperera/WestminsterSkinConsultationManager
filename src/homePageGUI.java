import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class homePageGUI extends JFrame {
    private final JButton button1;

    public homePageGUI(){
        //Adding background image to the frame
        JLabel background = new JLabel(new ImageIcon("background.jpeg"));
        background.setBounds(0,0,1440,772);

        //Adding welcome letter to the JFrame
        JLabel welcomeLetter = new JLabel("Skin Consultation Manager");
        welcomeLetter.setBounds(370, 25, 1100,50);
        welcomeLetter.setForeground(Color.BLACK);
        welcomeLetter.setFont(new Font("Calibri", Font.BOLD,45));
        background.add(welcomeLetter);

        JLabel icon1 = new JLabel();
        icon1.setIcon(new ImageIcon("uniLogo.png"));
        icon1.setBounds(140, 15, 80,80);
        background.add(icon1);

        JLabel icon2 = new JLabel();
        icon2.setIcon(new ImageIcon("iitLogo.png"));
        icon2.setBounds(230, 15, 80,80);
        background.add(icon2);

        //Creating border with color yellow
        Border border = BorderFactory.createLineBorder(Color.WHITE,5);
        background.setBorder(border);

        //Adding buttons to the login page
        button1 = new JButton("Doctor Information");
        button1.setBounds(300,270,800,130);
        button1.setIcon(new ImageIcon("icon1.png"));
        button1.setFont(new Font("Comic Sans", Font.ITALIC,25));
        button1.addActionListener(e -> {
            if (e.getSource() == button1){
                dispose();
                new DoctorListGUI();
            }
        });
                background.add(button1);

        //Adding second button to the frame
        JButton button2 = new JButton("Book a Consultation");
        button2.setBounds(300,450,800,130);
        button2.setIcon(new ImageIcon("icon2.png"));
        button2.setFont(new Font("Comic Sans", Font.ITALIC,25));
        button2.addActionListener(e -> {
            dispose();
            new ConsultationGUI();
        });
                background.add(button2);

        //Label
        JLabel createdWord = new JLabel("Created by Banula Perera");
        createdWord.setBounds(580,720, 200,50);
        createdWord.setFont(new Font("MV Boli", Font.ITALIC,15));
        background.add(createdWord);

        this.setTitle("Westminster Skin Consultation Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1440, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(background);
    }
}
