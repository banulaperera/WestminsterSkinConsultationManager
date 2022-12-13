import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DoctorListGUI extends JFrame implements ActionListener {
    private JButton backToHomeBtn;
    DoctorListGUI(){
        final JPanel rightSidePanel, bottomPanel, leftSidePanel, middlePanel;
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
        this.add(MiddlePanel());
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

    private JPanel MiddlePanel(){
        final JPanel middlePanel;

        middlePanel = new JPanel();
        middlePanel.setBounds(150, 120, 1160,670);
        return middlePanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == backToHomeBtn){
            this.dispose();
            new HomePageGUI();
        }
    }
}
