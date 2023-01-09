import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Consultation implements Serializable {
    private final String timeSlot, cost;
    private final Date date;
    private final String doctorName;
    private final byte[] bytes;
    private final File fileDestination;
    private final char[] chars;
    private final ArrayList<Character> key;
    private final String specializationOfTheDoctor;

    public Consultation(String name, String specialization, Date date, String time, String costOfTheConsultation, byte[] b, File fileDestination, char[] aChar, ArrayList<Character> key){
        this.doctorName = name;
        this.specializationOfTheDoctor = specialization;
        this.date = date;
        this.timeSlot = time;
        this.cost = costOfTheConsultation;
        this.bytes = b;
        this.fileDestination = fileDestination;
        this.chars = aChar;
        this.key = key;
    }
    public String getTimeSlot() {
        return timeSlot;
    }

    public String getCost() {
        return cost;
    }

    public String getDoctorName(){
        return doctorName;
    }
    public Date getDate(){
        return date;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public File getFileDestination() {
        return fileDestination;
    }

    public char[] getChars() {
        return chars;
    }

    public ArrayList<Character> getKey() {
        return key;
    }

    public String getSpecializationOfTheDoctor() {
        return specializationOfTheDoctor;
    }
}
