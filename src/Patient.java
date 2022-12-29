import java.util.Date;

public class Patient extends Person{

    private int _id;

    public Patient(String name, String surname, Date birthDate, String mobileNumber, String gender, int id) {
        super(name, surname, birthDate, mobileNumber, gender);
        this._id = id + 1;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_id() {
        return this._id;
    }
}
