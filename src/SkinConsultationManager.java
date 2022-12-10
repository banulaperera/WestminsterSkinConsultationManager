import java.util.ArrayList;

public interface SkinConsultationManager {
    void AddNewDoc();
    void DeleteDoc();
    void PrintListOfDoc();
    void SaveInFile();
    void LoadFromFile(ArrayList<Doctor> list);

}
