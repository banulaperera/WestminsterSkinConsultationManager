import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePageGUI extends JFrame implements ActionListener {
    private final JButton button1, button2;
    public HomePageGUI(){
        //Adding background image to the frame
        JLabel background = new JLabel(new ImageIcon("BackGroundIMG.jpg"));
        background.setBounds(0,0,1440,772);

        //Adding welcome letter to the JFrame
        JLabel welcomeLetter = new JLabel("Welcome to the Westminster Skin Consultation Manager");
        welcomeLetter.setBounds(80, 85, 1300,50);
        welcomeLetter.setForeground(Color.BLACK);
        welcomeLetter.setFont(new Font("Calibri", Font.BOLD,45));
        background.add(welcomeLetter);

        //Creating border with color yellow
        Border border = BorderFactory.createLineBorder(Color.WHITE,5);
        background.setBorder(border);

        //Adding buttons to the login page
        button1 = new JButton("Show List Of Doctors");
        button1.setBounds(300,270,800,130);
        button1.setIcon(new ImageIcon("icon1.png"));
        button1.setFont(new Font("Comic Sans", Font.ITALIC,25));
        button1.addActionListener(this); //Call action listener to the button
        background.add(button1);

        //Adding second button to the frame
        button2 = new JButton("Consultation");
        button2.setBounds(300,450,800,130);
        button2.setIcon(new ImageIcon("icon2.png"));
        button2.setFont(new Font("Comic Sans", Font.ITALIC,25));
        button2.addActionListener(this); //Call action listener to the button
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1){
            this.dispose();
            new DoctorListGUI();
        } else if (e.getSource() == button2) {
            this.dispose();
            new ConsultationGUI();
        }
    }
}
