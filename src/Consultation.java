import java.io.File;
import java.util.Date;

public class Consultation extends Doctor{
    private final String _timeSlot, _cost;
    private String _notes;
    private final Date _date;
    private final String doctorName;
    private final byte[] bytes;
    private final File fileDestination;

    public Consultation(String name, String specialization, Date date, String time, String notes, String costOfTheConsultation, byte[] b, File fileDestination){
        this.doctorName = name;
        super.set_specialization(specialization);
        this._date = date;
        this._timeSlot = time;
        this._notes = notes;
        this._cost = costOfTheConsultation;
        this.bytes = b;
        this.fileDestination = fileDestination;
    }
    public String get_timeSlot() {
        return _timeSlot;
    }

    public String get_cost() {
        return _cost;
    }

    public String get_notes() {
        return _notes;
    }

    public void set_notes(String _notes) {
        this._notes = _notes;
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
}
