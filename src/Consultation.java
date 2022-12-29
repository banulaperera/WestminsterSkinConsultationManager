import java.util.Date;

public class Consultation extends Doctor{
    private String _timeSlot;
    private String _cost;
    private String _notes;
    private Date _date;

    public void set_date(Date _date) {
        this._date = _date;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    private String doctorName;

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

    public void set_timeSlot(String _timeSlot) {
        this._timeSlot = _timeSlot;
    }

    public String get_cost() {
        return _cost;
    }

    public void set_cost(String _cost) {
        this._cost = _cost;
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
