import java.util.Date;

public class Patient extends Person{

    private int id;
    private static int idCount = 1001;

    public Patient(String fName, String lName, Date dob, String mobileNumber, String gender){
        super.setName(fName);
        super.setSurname(lName);
        super.setdOB(dob);
        super.setMobileNumber(mobileNumber);
        super.setGender(gender);
        this.id = idCount++;
    }
    public int getUniqueId() {
        return this.id;
    }
}
