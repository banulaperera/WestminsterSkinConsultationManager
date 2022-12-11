import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        boolean ans = true;
        Scanner scanner = new Scanner(System.in);
        WestminsterSkinConsultationManager west = new WestminsterSkinConsultationManager();

        //Initially load all the data from the file
        west.LoadFromFile(WestminsterSkinConsultationManager.list);

        System.out.println("\n                                      Welcome to Westminster Skin Consultation Manager :)");
        new UI();

//        do{
//            System.out.println("======================================================================================================================");
//            System.out.println("|" + "                                                        Menu                                                        " + "|");
//            System.out.println("======================================================================================================================");
//            System.out.println("| " + "       A        |                        Add new Doctor                                                           " + " |");
//            System.out.println("| " + "       D        |                        Delete a Doctor                                                          " + " |");
//            System.out.println("| " + "       P        |                        Print the list of the Doctor                                             " + " |");
//            System.out.println("| " + "       S        |                        Save in file                                                             " + " |");
//            System.out.println("| " + "       G        |                        Open in User Interface                                                   " + " |");
//            System.out.println("| " + "       Q        |                        Quit                                                                     " + " |");
//            System.out.println("======================================================================================================================");
//
//            System.out.println("Enter your selection:");
//            String choice = scanner.next().toUpperCase();
//
//            switch (choice) {
//                case "A" -> west.AddNewDoc();
//                case "D" -> west.DeleteDoc();
//                case "P" -> west.PrintListOfDoc();
//                case "S" -> west.SaveInFile();
//                case "G" -> UI.Show();
//                case "Q" -> ans = false;
//            }
//
//        }while (ans);
//        System.out.println("\n                                              Thank you for your time, Bye! :)");
    }
}