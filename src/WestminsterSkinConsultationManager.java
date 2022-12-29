import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

public class WestminsterSkinConsultationManager implements  SkinConsultationManager {
    public static ArrayList<Doctor> list = new ArrayList<>(10);
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static final Scanner scanner = new Scanner(System.in);

    @Override
    public void AddNewDoc() {
        String choice = "";
        do {
            try{
                int count = list.size();

                //Check whether the list contains total of 10 doctors
                if (!(count == 10)){
                    System.out.println("======================================================================================================================");
                    System.out.println("|" + "                                             Add new doctor                                                        " + "|");
                    System.out.println("======================================================================================================================");
                    System.out.println("Enter the name of the doctor:");
                    String docName = "Dr. " + scanner.next();

                    System.out.println("Enter the surname of the doctor:");
                    String surname = scanner.next();

                    System.out.println("Enter the mobile number of the doctor:");
                    String mob = scanner.next();

                    System.out.println("Select the gender:");
                    System.out.println("1. Male\n2. Female");
                    int select = scanner.nextInt();
                    String gen;
                    if (select == 1) {
                        gen = "Male";
                    } else if (select == 2) {
                        gen = "Female";
                    }else {
                        System.out.println("You entered the wrong selection");
                        break;
                    }

                    System.out.println("Enter the doctor's Date of Birth(dd/MM/yyyy):");
                    String doctorDob = scanner.next();
                    Date dob = dateFormat.parse(doctorDob);

                    System.out.println("Enter the Medical License Number of the doctor:");
                    String medNumber = scanner.next();

                    System.out.println("Select the specialization from the below:");
                    System.out.println("1. Cosmetic dermatology\n2. Medical dermatology,\n3. Paediatric dermatology\n4. Other");
                    int num = scanner.nextInt();
                    String specialization = "";
                    if (num == 1){
                        specialization = "Cosmetic dermatology";
                    } else if (num == 2) {
                        specialization = "Medical dermatology";
                    } else if (num == 3) {
                        specialization = "Paediatric dermatology";
                    } else if (num == 4) {
                        System.out.println("Enter the specialization:");
                        specialization = scanner.next();
                    }else {
                        System.out.println("You entered the wrong selection");
                    }

                    Doctor doc = new Doctor(docName, surname, dob, mob, gen, medNumber, specialization);
                    list.add(doc);
                    System.out.println("Doctor added successfully!");
                    System.out.println("\nYou can add " + (10 - (++count)) + " more doctors to the center");

                    System.out.println("Do you want add another doctor?(Y/N):");
                    choice = scanner.next();
                }
                else {
                    System.out.println("Can't add doctors, Your center is full!");
                    break;
                }

            }catch (ParseException e){
                System.out.println("Format of your entered value is invalid!");
            }
            catch (Exception a){
                System.out.println("Doctor can't add to the center, something went wrong!");
            }

        }while (choice.equalsIgnoreCase("Y"));
        System.out.println("Returning to the main menu.......");

    }

    @Override
    public void DeleteDoc() {
        try{
            System.out.println("======================================================================================================================");
            System.out.println("|" + "                                                  Delete a doctor                                                   " + "|");
            System.out.println("======================================================================================================================");

            System.out.println("Enter the medical license number:");
            String medicalLicence = scanner.next();

            if (!(list.isEmpty())){
                for (Doctor doctor:list) {
                    if (medicalLicence.equals(doctor.get_medicalLicenseNumber())) {
                        System.out.println("Do you want to delete doctor " + doctor.get_name() + " from the center?(Y/N)");
                        String ans = scanner.next();

                        if (ans.equalsIgnoreCase("y")) {
                            list.remove(doctor);
                            System.out.println("Doctor deleted successfully!");
                        } else {
                            System.out.println("Returning to the main menu.......");
                        }
                        break;
                    }
                }
            }else {
                System.out.println("Doctor not found!");
            }
        }catch (Exception e){
            System.out.println("Doctor can't delete from the center, Something went wrong!");
        }

    }

    @Override
    public void PrintListOfDoc() {
        try{
            System.out.println("======================================================================================================================");
            System.out.println("|" + "                                                   List of Doctors                                                  " + "|");
            System.out.println("======================================================================================================================\n");
            System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %s\n", "Name", "Surname", "Gender", "Date of birth", "Mobile number", "Medical License Number", "Specialization\n");

            if (list.isEmpty()){
                System.out.println("\n");
                System.out.println("                                                  Data not found");
                System.out.println("\n");
            }
            else {
                //creating new arraylist to sort
                ArrayList<Doctor> sortedArrayList = new ArrayList<>(list.size());
                //add main array list object to new arraylist
                sortedArrayList.addAll(list);
                //sort new array list using comparable class
                Collections.sort(sortedArrayList);
                for (Doctor doc:
                        sortedArrayList) {
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %s\n", doc.get_name(), doc.get_surname(), doc.get_gender(), dateFormat.format(doc.get_dOB()), doc.get_mobileNumber(), doc.get_medicalLicenseNumber(), doc.get_specialization());
                }
            }
            System.out.println("\n                                                      ***");
        }
        catch (Exception e){
            System.out.println("Can't print the list of the doctors, Something went wrong!");
        }
    }

    @Override
    public void SaveInFile() {
        try {
            FileOutputStream fo = new FileOutputStream("filename.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);

            for (Doctor doctor:
                    list) {
                oos.writeObject(doctor);
            }
            fo.close();
            oos.close();
            System.out.println("Saved to file!");

        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }

    @Override
    public void LoadFromFile(ArrayList<Doctor> list){
        try{
            FileInputStream fis = new FileInputStream("filename.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while (true) {
                try{
                    Doctor doctor = (Doctor) ois.readObject();
                    list.add(doctor);
                }
                catch (Exception e){
                    break;
                }
            }
        }
        catch (IOException e){
            System.out.println("File not found!");
        }
    }
}