import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UI extends JFrame{
    public UI(){
        //Adding background image to the frame
        JLabel background = new JLabel(new ImageIcon("UOW.jpg"));
        background.setBounds(0,0,1440,775);

        //adding welcome letter to the JFrame
        JLabel welcomeLetter = new JLabel("Welcome to the Westminster Skin Consultation Manager");
        welcomeLetter.setBounds(170, 75, 1150,50);
        welcomeLetter.setForeground(Color.YELLOW);
        welcomeLetter.setFont(new Font("Calibri", Font.BOLD,40));
        welcomeLetter.setBackground(Color.BLACK);
        welcomeLetter.setOpaque(true);
        background.add(welcomeLetter);

        //Creating border with color yellow
        Border border = BorderFactory.createLineBorder(Color.WHITE,5);
        background.setBorder(border);

        //Adding buttons to the login page
        JButton button1 = new JButton("Show List Of Doctors");
        button1.setBounds(300,250,800,100);
        background.add(button1);

        JButton button2 = new JButton("Consultation");
        button2.setBounds(300,450,800,100);
        background.add(button2);

        this.setTitle("Westminster Skin Consultation Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(background);
    }
}
