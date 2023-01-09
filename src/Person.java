import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private String name;
    private String surname;
    private Date dOB;
    private String mobileNumber;
    private String gender;

    Person(String name,String surname, Date birthDate, String mobileNumber, String gender){
        this.name = name;
        this.surname = surname;
        this.dOB = birthDate;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDOB(Date dOB) {
        this.dOB = dOB;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDOB() {
        return dOB;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return  "Name                   = " + name + '\n' +
                "Surname                = " + surname + '\n' +
                "Date of Birth          = " + WestminsterSkinConsultationManager.dateFormat.format(dOB) + '\n' +
                "Mobile Number          = " + mobileNumber + '\n' +
                "Gender                 = " + gender + '\n';
    }
}
