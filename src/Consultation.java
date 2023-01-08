import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Consultation extends Doctor{
    private final String _timeSlot, _cost;
    private final Date _date;
    private final String doctorName;
    private final byte[] bytes;
    private final File fileDestination;
    private final char[] chars;
    private final ArrayList<Character> key;

    public Consultation(String name, String specialization, Date date, String time, String costOfTheConsultation, byte[] b, File fileDestination, char[] aChar, ArrayList<Character> key){
        this.doctorName = name;
        super.set_specialization(specialization);
        this._date = date;
        this._timeSlot = time;
        this._cost = costOfTheConsultation;
        this.bytes = b;
        this.fileDestination = fileDestination;
        this.chars = aChar;
        this.key = key;
    }
    public String get_timeSlot() {
        return _timeSlot;
    }

    public String get_cost() {
        return _cost;
    }

    public String getDoctorName(){
        return doctorName;
    }
    public Date get_date(){
        return _date;
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
}
