import java.util.Date;

public class Doctor extends Person implements Comparable<Doctor>{
    private String _medicalLicenseNumber;
    private String _specialization;

    public Doctor(String name, String surname, Date birthDate, String mobileNumber, String gender, String medicalLicenseNumber, String specialization) {
        super(name, surname, birthDate, mobileNumber, gender);
        this._medicalLicenseNumber = medicalLicenseNumber;
        this._specialization = specialization;
    }

    public Doctor(){}

    public String get_medicalLicenseNumber() {
        return _medicalLicenseNumber;
    }

    public String get_specialization() {
        return _specialization;
    }

    public void set_specialization(String _specialization) {
        this._specialization = _specialization;
    }

    @Override
    public int compareTo(Doctor o) {
        return this.get_surname().compareToIgnoreCase(o.get_surname());
    }
}
