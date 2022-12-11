import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class UI extends JFrame{
    public UI(){
        setTitle("Westminster Skin Consultation Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1500, 800);
        setVisible(true);

        //Adding background image to the frame
        setLayout(new BorderLayout());
        JLabel background = new JLabel(new ImageIcon("UOW.jpg"));
        add(background);
        background.setLayout(new FlowLayout());

        Border border = BorderFactory.createLineBorder(Color.WHITE,5); //Creating border with color yellow
        background.setBorder(border);
    }
}
