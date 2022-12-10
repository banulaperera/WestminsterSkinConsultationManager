import java.util.Date;

public class Consultation {
    private Date timeSlot;
    private String cost;
    private String notes;

    public Date getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(Date timeSlot) {
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
}
