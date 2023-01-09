import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean ans = true;
        boolean ans1 = true;
        Scanner scanner = new Scanner(System.in);
        WestminsterSkinConsultationManager west = new WestminsterSkinConsultationManager();

        //Initially load all the data from the file
        west.loadFromFile();
        ConsultationGUI.loadFromFile(ConsultationGUI.patientList, ConsultationGUI.consultationList);

        System.out.println("\n                                      Welcome to Westminster Skin Consultation Manager :)");

        do {
            System.out.println("\n======================================================================================================================");
            System.out.println("|" + "                                                        Menu                                                        " + "|");
            System.out.println("======================================================================================================================");
            System.out.println("| " + "       U        |                                      User                                                       " + " |");
            System.out.println("| " + "       M        |                                      Manager                                                    " + " |");
            System.out.println("| " + "       Q        |                                      Quit                                                       " + " |");
            System.out.println("======================================================================================================================");
            System.out.println("Enter your selection:");
            String userType = scanner.next().toUpperCase();

            switch (userType){
                case "M" -> {
                    do {
                        System.out.println("\n                                              Welcome to Console application :)");
                        System.out.println("\n======================================================================================================================");
                        System.out.println("|" + "                                                        Menu                                                        " + "|");
                        System.out.println("======================================================================================================================");
                        System.out.println("| " + "       A        |                        Add new Doctor                                                           " + " |");
                        System.out.println("| " + "       D        |                        Delete a Doctor                                                          " + " |");
                        System.out.println("| " + "       P        |                        Print the list of the Doctor                                             " + " |");
                        System.out.println("| " + "       S        |                        Save in file                                                             " + " |");
                        System.out.println("| " + "       G        |                        Open in User Interface                                                   " + " |");
                        System.out.println("| " + "       Q        |                        Back to the User Menu                                                    " + " |");
                        System.out.println("======================================================================================================================");

                        System.out.println("Enter your selection:");
                        String choice = scanner.next().toUpperCase();

                        switch (choice) {
                            case "A" -> west.addNewDoc(scanner);
                            case "D" -> west.deleteDoc(scanner);
                            case "P" -> west.printListOfDoc();
                            case "S" -> west.saveInFile();
                            case "G" -> EventQueue.invokeLater(() -> {
                                try {
                                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                                         UnsupportedLookAndFeelException e) {
                                    throw new RuntimeException(e);
                                }
                                new homePageGUI();
                            });
                            case "Q" -> {
                                System.out.println("Returning to the User Menu........");
                                ans = false;
                            }
                            default -> System.out.println("Enter a valid option!");
                        }

                    } while (ans);
                }
                case "U" -> {
                    System.out.println("\n                                                Welcome to User Interface :)");
                    System.out.println("\n======================================================================================================================");
                    System.out.println("|" + "                                                        Menu                                                        " + "|");
                    System.out.println("======================================================================================================================");
                    System.out.println("| " + "       G        |                        Open in User Interface                                                   " + " |");
                    System.out.println("| " + "       Q        |                        Back to the User Menu                                                    " + " |");
                    System.out.println("======================================================================================================================");
                    System.out.println("Enter your selection:");
                    String choice = scanner.next().toUpperCase();
                    switch (choice) {
                        case "G" -> EventQueue.invokeLater(() -> {
                            try {
                                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                                     UnsupportedLookAndFeelException e) {
                                throw new RuntimeException(e);
                            }
                            new homePageGUI();
                        });
                        case "Q" -> System.out.println("Returning to the User Menu........");
                        default -> {
                            System.out.println("Enter a valid option!");
                            System.out.println("Returning to the User Menu........");
                        }
                    }
                }
                case "Q" -> ans1 = false;
                default -> System.out.println("Enter a valid option!");

            }

        } while (ans1);
        System.out.println("\n                                              Thank you for your time, Bye! :)");
    }
}