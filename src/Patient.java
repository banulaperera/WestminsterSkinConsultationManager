import java.util.Date;

public class Patient extends Person{

    private static int uniqueId = 0;

    public Patient(String fName, String lName, Date dob, String mobileNumber, String gender){
        super.setName(fName);
        super.setSurname(lName);
        super.setdOB(dob);
        super.setMobileNumber(mobileNumber);
        super.setGender(gender);
    }
    public int getUniqueId() {
        return uniqueId;
    }
    public void setUniqueId(){
        uniqueId = uniqueId + 1;
    }
}
