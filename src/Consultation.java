import java.util.Date;

public class Consultation extends Doctor{
    private String  timeSlot;
    private String cost;
    private String notes;
    private Date date;
    private String doctorName;

    public Consultation(String name, String specialization, Date date, String time, String notes){
        this.doctorName = name;
        super.setSpecialization(specialization);
        this.date = date;
        this.timeSlot = time;
        this.notes = notes;
    }
    public String  getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String  timeSlot) {
        this.timeSlot = timeSlot;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDoctorName(){
        return doctorName;
    }
    public Date getDate(){
        return date;
    }
}
