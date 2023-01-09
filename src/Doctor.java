import java.util.Date;

public class Doctor extends Person implements Comparable<Doctor>{
    private final String medicalLicenseNumber;
    private final String specialization;

    public Doctor(String name, String surname, Date birthDate, String mobileNumber, String gender, String medicalLicenseNumber, String specialization) {
        super(name, surname, birthDate, mobileNumber, gender);
        this.medicalLicenseNumber = medicalLicenseNumber;
        this.specialization = specialization;
    }

    public String getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public int compareTo(Doctor doctor) {
        return this.getSurname().compareToIgnoreCase(doctor.getSurname());
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Medical License Number = " + medicalLicenseNumber + '\n' +
                "Specialisation         = " + specialization + '\n';
    }
}
