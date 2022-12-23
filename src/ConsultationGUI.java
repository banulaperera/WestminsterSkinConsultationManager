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
        this.add(RightMiddlePanel());
        this.add(RightMiddleUpperPanel());
    }

    private JPanel LeftPanel(){
        final JLabel jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon("Consultation.jpeg"));
        jLabel.setBounds(0,0,600,800);

        final JLabel createdWord = new JLabel("Created by Banula Perera");
        createdWord.setBounds(300,720, 200,50);
        createdWord.setFont(new Font("MV Boli", Font.ITALIC,15));

        final JPanel jPanel = new JPanel();
        jPanel.setBounds(0,0,600,800);
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

    private JPanel RightMiddleUpperPanel(){
        final JPanel jPanel  = new JPanel();
        jPanel.setBounds(600,70,840,80);

        JLabel label = new JLabel("Book a Consultation");
        label.setIcon(new ImageIcon("ConsultationIcon.png"));
        label.setBounds(0, 0, 840, 80);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MV Boli", Font.BOLD,30));
        jPanel.add(label);
        return jPanel;
    }
    private ScrollPane RightMiddlePanel(){
        final JTextField textField = new JTextField();

        final ScrollPane scrollPane = new ScrollPane();
        scrollPane.setBounds(650,150,740,550);
        scrollPane.setBackground(Color.CYAN);
        return scrollPane;
    }
}
