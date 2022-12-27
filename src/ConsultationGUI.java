import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ConsultationGUI extends JFrame {
    public static final ArrayList<Patient> patientList = new ArrayList<>();
    private JButton backToHomeBtn;
    private final JTextField textFieldForFName, textFieldForSurname,textFieldForMobile;
    private final JLabel labelFieldForDOB,specialization,labelForDate;
    private final JTextArea textAreaForNotes;
    private final JRadioButton male;
    private String gender;
    private String dob;
    Date date;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    ConsultationGUI(){
        JLabel patientDetails = new JLabel("Patient Details");
        patientDetails.setFont(new Font("Arial", Font.BOLD,25));
        patientDetails.setBounds(930,55, 300, 100);

        textFieldForFName = new JTextField();
        textFieldForFName.setBounds(790,150,200,40);
        textFieldForFName.setFont(new Font("Arial", Font.PLAIN,18));
        textFieldForFName.setBackground(new Color(207, 205, 202));

        JLabel forFirstName = new JLabel("First Name");
        forFirstName.setBounds(640,150,100,35);
        forFirstName.setFont(new Font("MV Boli", Font.PLAIN,18));

        textFieldForSurname = new JTextField();
        textFieldForSurname.setBounds(1190,150,200,40);
        textFieldForSurname.setFont(new Font("Arial", Font.PLAIN,18));
        textFieldForSurname.setBackground(new Color(207, 205, 202));

        JLabel forSurName = new JLabel("Surname");
        forSurName.setBounds(1040,150,100,35);
        forSurName.setFont(new Font("MV Boli", Font.PLAIN,18));

        labelFieldForDOB = new JLabel();
        labelFieldForDOB.setBounds(790, 230, 150,35);
        labelFieldForDOB.setFont(new Font("Arial", Font.PLAIN,18));
        labelFieldForDOB.setBackground(new Color(207, 205, 202));
        labelFieldForDOB.setOpaque(true);

        JButton calenderBtn = new JButton();
        calenderBtn.setBounds(945, 230, 50,40);
        calenderBtn.setIcon(new ImageIcon("calendar.png"));
        calenderBtn.addActionListener(ae -> labelFieldForDOB.setText(new DatePicker(this).setPickedDate()));

        JLabel forDOB = new JLabel("Date Of Birth");
        forDOB.setBounds(640,230,150,35);
        forDOB.setFont(new Font("MV Boli", Font.PLAIN,18));

        textFieldForMobile = new JTextField();
        textFieldForMobile.setBounds(1190,230,200,40);
        textFieldForMobile.setFont(new Font("Arial", Font.PLAIN,18));
        textFieldForMobile.setBackground(new Color(207, 205, 202));

        JLabel forMobile = new JLabel("Mobile Number");
        forMobile.setBounds(1040,230,150,35);
        forMobile.setFont(new Font("MV Boli", Font.PLAIN,18));

        JLabel  gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 18));
        gender.setSize(100, 20);
        gender.setLocation(640, 310);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(790, 310);

        JRadioButton female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(900, 310);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        JSeparator jSeparator = new JSeparator();
        jSeparator.setOrientation(SwingConstants.HORIZONTAL);
        jSeparator.setBounds(640,340, 750, 10);
        jSeparator.setBackground(new Color(123,173,244));

        JLabel addConsultation = new JLabel("Add Consultation");
        addConsultation.setFont(new Font("Arial", Font.BOLD,25));
        addConsultation.setBounds(930,360, 300, 50);

        JLabel selectDocLabel = new JLabel("Select a Doctor");
        selectDocLabel.setBounds(640, 430, 150,35);
        selectDocLabel.setFont(new Font("MV Boli", Font.PLAIN,18));

        JLabel labelForSpec = new JLabel("Specialization");
        labelForSpec.setBounds(1040, 430, 150,35);
        labelForSpec.setFont(new Font("MV Boli", Font.PLAIN,18));

        specialization = new JLabel();
        specialization.setBounds(1190, 430, 200, 30);
        specialization.setFont(new Font("Arial", Font.PLAIN,18));
        specialization.setBackground(new Color(207, 205, 202));
        specialization.setOpaque(true);

        JLabel forDate = new JLabel("Pick a Date");
        forDate.setBounds(640, 510, 120, 35);
        forDate.setFont(new Font("MV Boli", Font.PLAIN,18));

        labelForDate = new JLabel();
        labelForDate.setBounds(790, 510, 150,35);
        labelForDate.setFont(new Font("Arial", Font.PLAIN,18));
        labelForDate.setBackground(new Color(207, 205, 202));
        labelForDate.setOpaque(true);

        JButton calenderBtn2 = new JButton();
        calenderBtn2.setBounds(945, 510, 50,40);
        calenderBtn2.setIcon(new ImageIcon("calendar.png"));
        calenderBtn2.addActionListener(ae -> labelForDate.setText(new DatePicker(this).setPickedDate()));

        JLabel labelForDuration = new JLabel("Duration(Hours)");
        labelForDuration.setBounds(1040, 510, 150,35);
        labelForDuration.setFont(new Font("MV Boli", Font.PLAIN,18));

//        int[] hours = new int[6];
//        JComboBox timeDuration = new JComboBox(hours);

        JLabel labelForNote = new JLabel("Add Notes");
        labelForNote.setBounds(640, 590, 100, 35);
        labelForNote.setFont(new Font("MV Boli", Font.PLAIN,18));

        textAreaForNotes = new JTextArea();
        textAreaForNotes.setLineWrap(true);
        textAreaForNotes.setFont(new Font("Arial", Font.ITALIC,15));
        textAreaForNotes.setBackground(new Color(207, 205, 202));
        textAreaForNotes.setOpaque(true);

        JScrollPane textAreaScroll = new JScrollPane(textAreaForNotes);
        textAreaScroll.setBounds(790, 590, 200, 75);

        JLabel labelForImg = new JLabel("Upload an Image");
        labelForImg.setBounds(1040, 590, 170, 35);
        labelForImg.setFont(new Font("MV Boli", Font.PLAIN,18));

        JButton fileChooser = new JButton("Browse");
        fileChooser.setIcon(new ImageIcon("folder.png"));
        fileChooser.setBounds(1210,590, 150,35);
        fileChooser.addActionListener(ae -> {
            if (ae.getSource() == fileChooser){
                JFileChooser jFileChooser = new JFileChooser();
                jFileChooser.showSaveDialog(null);
            }
        });

        this.setTitle("Westminster Skin Consultation Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1440, 800);
        this.setResizable(false);
        this.setLayout(null);
        this.setVisible(true);
        this.add(LeftPanel());
        this.add(RightUpperPanel());
        this.add(textFieldForFName);
        this.add(patientDetails);
        this.add(forFirstName);
        this.add(textFieldForSurname);
        this.add(forSurName);
        this.add(forDOB);
        this.add(forMobile);
        this.add(textFieldForMobile);
        this.add(labelFieldForDOB);
        this.add(calenderBtn);
        this.add(jSeparator);
        this.add(addConsultation);
        this.add(selectDocLabel);
        this.add(ComboBox());
        this.add(labelForSpec);
        this.add(specialization);
        this.add(forDate);
        this.add(labelForDate);
        this.add(calenderBtn2);
        this.add(labelForDuration);
        this.add(labelForNote);
        this.add(textAreaScroll);
        this.add(labelForImg);
        this.add(fileChooser);
        this.add(Book());
        this.add(ResetButton());
        this.add(ListOfAppointments());
        this.add(RightDownPanel());
        this.add(gender);
        this.add(male);
        this.add(female);
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
        JLabel label = new JLabel("Book a Consultation");
//        label.setIcon(new ImageIcon("ConsultationIcon.png"));
        label.setBounds(0, 5, 840, 50);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("MV Boli", Font.BOLD,30));

        final JLabel jLabel = new JLabel();
        jLabel.setBounds(0,0,840,70);
        jLabel.setIcon(new ImageIcon("RightUpperImage.jpeg"));
        jLabel.add(backToHomeBtn);

        final JPanel jPanel = new JPanel();
        jPanel.setBounds(600,0,840,70);
        jPanel.add(jLabel);
        jLabel.add(label);
        return jPanel;
    }

    private JComboBox ComboBox(){
        int count = WestminsterSkinConsultationManager.list.size();
        String[] docNames = new String[count];
        int iteration = 0;
        for (Doctor doc:
                WestminsterSkinConsultationManager.list) {
            docNames[iteration] = doc.getName() + " " + doc.getSurname();
            iteration++;
        }

        JComboBox doctorList = new JComboBox(docNames);
        doctorList.setBounds(790, 423, 200,50);
        doctorList.setFont(new Font("Arial", Font.PLAIN,15));
        return  doctorList;
    }

    private JPanel RightDownPanel(){
        final JPanel jPanel = new JPanel();
        jPanel.setBounds(600, 760,840,20);
        jPanel.setBackground(new Color(123,173,244));
        return  jPanel;
    }

    private JButton ListOfAppointments(){
        JButton listOfAppointment = new JButton("List of Appointments");
        listOfAppointment.setBounds(640, 705, 200,35);
        listOfAppointment.setFont(new Font("MV Boli", Font.BOLD,12));
        listOfAppointment.addActionListener(ae -> {
            if (ae.getSource() == listOfAppointment){
                new AppointmentsGUI();
            }
        });
        return listOfAppointment;
    }

    private JButton Book(){
        JButton book = new JButton("Book Now");
        book.setBounds(1250, 705, 150,35);
        book.setFont(new Font("MV Boli", Font.BOLD,12));
        book.setForeground(Color.BLUE);
        book.addActionListener(ae -> {
            if (ae.getSource() == book){
                String fName = textFieldForFName.getText();
                String lName = textFieldForSurname.getText();
//                System.out.println(labelFieldForDOB.getText());
                try {
                    dob =  labelFieldForDOB.getText();
                    date = dateFormat.parse(dob);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                String mobile = textFieldForMobile.getText();

                if (male.isSelected()){
                    gender = "Male";
                }
                else {
                    gender = "Female";
                }
                Patient patient = new Patient(fName, lName, date, mobile, gender);
                patient.setUniqueId();
                patientList.add(patient);
            }
        });
        return book;
    }

    private JButton ResetButton(){
        JButton reset = new JButton("Reset");
        reset.setBounds(1090, 705, 150,35);
        reset.setFont(new Font("MV Boli", Font.BOLD,12));
        reset.setForeground(Color.RED);
        reset.addActionListener(ae -> {
            if (ae.getSource() == reset){
                String def = "";
                textFieldForFName.setText(def);
                textFieldForSurname.setText(def);
                textFieldForMobile.setText(def);
                labelFieldForDOB.setText(def);
                specialization.setText(def);
                labelForDate.setText(def);
                textAreaForNotes.setText(def);
            }
        });
        return reset;
    }
}
