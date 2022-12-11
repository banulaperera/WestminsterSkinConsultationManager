import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UI extends JFrame{
    public UI(){
        //Adding background image to the frame
        JLabel background = new JLabel(new ImageIcon("UOW.jpg"));
        background.setLayout(new FlowLayout());

        //adding welcome letter to the JFrame
        JLabel welcomeLetter = new JLabel("Welcome to the Westminster Skin Consultation Manager");
        welcomeLetter.setForeground(Color.YELLOW);
        welcomeLetter.setFont(new Font("Calibri", Font.BOLD,40));
        welcomeLetter.setBackground(Color.BLACK);
        welcomeLetter.setOpaque(true);
        background.add(welcomeLetter);

        //Creating border with color yellow
        Border border = BorderFactory.createLineBorder(Color.WHITE,5);
        background.setBorder(border);

        //Adding buttons to the login page
        JButton button1 = new JButton();


        setTitle("Westminster Skin Consultation Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 800);
        setLayout(new BorderLayout());
        setVisible(true);
        add(background);
    }
}
