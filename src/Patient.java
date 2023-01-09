import java.util.Date;
import java.util.UUID;

public class Patient extends Person{

    private final int id;

    public Patient(String name, String surname, Date birthDate, String mobileNumber, String gender) {
        super(name, surname, birthDate, mobileNumber, gender);
        this.id = generateUniqueId();
    }

    public int getId() {
        return this.id;
    }

    public static int generateUniqueId() {
        UUID randomNumber = UUID.randomUUID();
        String value =""+randomNumber;
        int uid=value.hashCode();
        String filterStr=""+uid;
        value = filterStr.replaceAll("-", "");
        return Integer.parseInt(value);
    }
}
