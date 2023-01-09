import java.util.Scanner;

public interface SkinConsultationManager {
    void addNewDoc(Scanner scanner);
    void deleteDoc(Scanner scanner);
    void printListOfDoc();
    void saveInFile();
    void loadFromFile();

}
