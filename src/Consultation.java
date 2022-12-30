import java.util.Date;

public class Consultation extends Doctor{
    private final String _timeSlot;
    private final String _cost;
    private String _notes;
    private final Date _date;
    private final String doctorName;

    public Consultation(String name, String specialization, Date date, String time, String notes, String costOfTheConsultation){
        this.doctorName = name;
        super.set_specialization(specialization);
        this._date = date;
        this._timeSlot = time;
        this._notes = notes;
        this._cost = costOfTheConsultation;
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
}
