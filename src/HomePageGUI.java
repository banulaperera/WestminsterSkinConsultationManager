import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class HomePageGUI extends JFrame {
    private final JButton button1;

    public HomePageGUI(){
        //Adding background image to the frame
        JLabel background = new JLabel(new ImageIcon("BackGroundIMG.jpg"));
        background.setBounds(0,0,1440,772);

        //Adding welcome letter to the JFrame
        JLabel welcomeLetter = new JLabel("Welcome to the Westminster Skin Consultation Manager");
        welcomeLetter.setBounds(80, 115, 1300,50);
        welcomeLetter.setForeground(Color.BLACK);
        welcomeLetter.setFont(new Font("Calibri", Font.BOLD,45));
        background.add(welcomeLetter);

        JLabel icon = new JLabel();
        icon.setIcon(new ImageIcon("Health.png"));
        icon.setBounds(650, 20, 100,100);
        background.add(icon);

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
        JButton button2 = new JButton("Consultation");
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
        createdWord.setBounds(620,720, 200,50);
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
