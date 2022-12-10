import java.util.Date;

public class Doctor extends Person implements Comparable<Doctor>{
    private String medicalLicenseNumber;
    private String specialization;

    public Doctor(String  med, String specialization, String surName, String name, Date date, String mob, String gender){
        this.medicalLicenseNumber = med;
        this.specialization = specialization;
        super.setSurname(surName);
        super.setName(name);
        super.setdOB(date);
        super.setMobileNumber(mob);
        super.setGender(gender);
    }

    public String getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public void setMedicalLicenseNumber(String  medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public int compareTo(Doctor o) {
        return this.getSurname().compareToIgnoreCase(o.getSurname());
    }
}
