import javax.swing.*;
import java.awt.*;

public class ConsultationGUI extends JFrame {
    private JButton backToHomeBtn;
    ConsultationGUI(){
        this.setTitle("Westminster Skin Consultation Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1440, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(LeftPanel());
        this.add(RightUpperPanel());
    }

    private JPanel LeftPanel(){
        final JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon("Consultation.jpeg"));
        jLabel.setBounds(0,0,600,800);

        final JPanel jPanel = new JPanel();
        jPanel.setBounds(0,0,600,800);
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
