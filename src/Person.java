import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private String _name;
    private String _surname;
    private Date _dOB;
    private String _mobileNumber;
    private String _gender;

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    public void set_dOB(Date _dOB) {
        this._dOB = _dOB;
    }

    public void set_mobileNumber(String _mobileNumber) {
        this._mobileNumber = _mobileNumber;
    }

    public void set_gender(String _gender) {
        this._gender = _gender;
    }

    Person(){ }

    Person(String name,String surname, Date birthDate, String mobileNumber, String gender){
        this._name = name;
        this._surname = surname;
        this._dOB = birthDate;
        this._mobileNumber = mobileNumber;
        this._gender = gender;
    }

    public String get_name() {
        return _name;
    }

    public String get_surname() {
        return _surname;
    }

    public Date get_dOB() {
        return _dOB;
    }

    public String get_mobileNumber() {
        return _mobileNumber;
    }

    public String get_gender(){
        return _gender;
    }
}
