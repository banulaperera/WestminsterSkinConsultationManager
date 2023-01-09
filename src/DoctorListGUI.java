import javax.swing.*;
import java.awt.*;

public class DoctorListGUI extends JFrame {
    private JButton backToHomeBtn;

    DoctorListGUI(){
        //Code for the Frame
        ImageIcon imageR = new ImageIcon("RightImage.png");
        ImageIcon imageL = new ImageIcon("LeftImage.png");
        ImageIcon imageB = new ImageIcon("BottomImage.png");
        this.setTitle("Westminster Skin Consultation Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1440, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(leftPanel(imageL));
        this.add(upperPanel());
        this.add(bottomPanel(imageB));
        this.add(rightPanel(imageR));
        this.add(scrollPane());
    }

    /**
     * Codes that contains the upper panel
     * @return JPanel
     */
    private JPanel upperPanel(){
        final JPanel upperPanel;
        final JLabel upperLabel;

        backToHomeBtn = new JButton();
        backToHomeBtn.setBounds(1270, 35, 100, 50);
        backToHomeBtn.setIcon(new ImageIcon("HomeIcon.png"));
        backToHomeBtn.addActionListener(e -> {
            if (e.getSource() == backToHomeBtn){
                backToHomeBtn.setBackground(new Color(224, 213, 247));
                this.dispose();
                new homePageGUI();
            }
        });

        JLabel label = new JLabel("Doctor Information");
        label.setIcon(new ImageIcon("DoctorIcon.png"));
        label.setBounds(68, 35, 450, 70);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MV Boli", Font.BOLD,30));

        upperLabel = new JLabel(new ImageIcon("UpperImage.png"));
        upperLabel.setBounds(0, 0, 1440, 120);

        upperPanel = new JPanel();
        upperPanel.setBounds(0, 0, 1440, 120);
        upperPanel.add(upperLabel);
        upperLabel.add(label);
        upperLabel.add(backToHomeBtn);
        return upperPanel;
    }

    /**
     * Codes that contains the right panel
     * @return JPanel
     */
    private JPanel rightPanel(ImageIcon image){
        JPanel rightSidePanel;
        JLabel rightLabel;

        rightLabel = new JLabel(image);
        rightLabel.setBounds(0, 0, 70, 580);
        rightSidePanel = new JPanel();
        rightSidePanel.setBounds(1370,120, 70, 580);
        rightSidePanel.add(rightLabel);

        return rightSidePanel;
    }

    /**
     * Codes that contain the Left panel
     * @return JPanel
     */
    private JPanel leftPanel(ImageIcon image){
        JPanel leftSidePanel;
        JLabel leftLabel;

        leftLabel = new JLabel(image);
        leftLabel.setBounds(0,0, 70, 580);
        leftSidePanel = new JPanel();
        leftSidePanel.setBounds(0,120, 70, 580);
        leftSidePanel.add(leftLabel);

        return leftSidePanel;
    }

    /**
     * Codes that contain bottom panel
     * @return JPanel
     */
    private JPanel bottomPanel(ImageIcon image){
        JPanel bottomPanel;
        JLabel bottomLabel;

        JLabel createdWord = new JLabel("Created by Banula Perera");
        createdWord.setBounds(650,30, 200,20);
        createdWord.setFont(new Font("MV Boli", Font.ITALIC,15));

        bottomLabel = new JLabel(image);
        bottomLabel.setBounds(0, 0,1440, 75);
        bottomPanel = new JPanel();
        bottomPanel.setBounds(0, 700, 1440,75);
        bottomLabel.add(createdWord);
        bottomPanel.add(bottomLabel);

        return bottomPanel;
    }

    /**
     * Codes that contain
     * @return JScrollPane
     */
    private JScrollPane scrollPane(){
        final JScrollPane scrollPane;
        //Creating an object of custom table model class
        ListTableModel model = new ListTableModel(WestminsterSkinConsultationManager.list);

        //Defining the table
        JTable table = new JTable(model);
        table.setBackground(Color.WHITE);
        table.setForeground(Color.BLACK);
        table.setSelectionBackground(new Color(85,181,183));
        table.setSelectionForeground(Color.BLACK);
        table.setGridColor(Color.BLACK);
        table.setFont(new Font("Calibri", Font.PLAIN,13));
        table.setRowHeight(40);
        table.getTableHeader().setFont(new Font("Calibri", Font.BOLD,14));
        table.getTableHeader().setPreferredSize(new Dimension(90,50));
        table.getTableHeader().setForeground(new Color(218,93,66));
        table.setAutoCreateRowSorter(true);

        scrollPane = new JScrollPane(table);
        scrollPane.setBounds(70, 120, 1300,583);
        return scrollPane;
    }
}
