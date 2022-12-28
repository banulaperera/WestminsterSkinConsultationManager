import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;

public class AppointmentTableModel extends AbstractTableModel {
    private String[] columnName = {"ID", "Name", "Date Of Birth", "Gender", "Mobile Number", "Name of the Doctor", "Specialization", "Reserved date", "Reserved Time Slot"};
    private final ArrayList<Patient> patientList;
    private final ArrayList<Consultation> consultationList;

    AppointmentTableModel(ArrayList<Patient> listOfPatients, ArrayList<Consultation> consultationList){
        this.patientList = listOfPatients;
        this.consultationList = consultationList;
    }
    @Override
    public int getRowCount() {
        return patientList.size();
    }

    @Override
    public int getColumnCount() {
        return columnName.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object temp = null;
        if(columnIndex == 0){
            temp = patientList.get(rowIndex).getUniqueId();
        }else if(columnIndex == 1){
            temp = patientList.get(rowIndex).getName() + " " + patientList.get(rowIndex).getSurname();
        }else if(columnIndex == 2){
            temp = patientList.get(rowIndex).getdOB();
        }else if(columnIndex == 3){
            temp = patientList.get(rowIndex).getGender();
        }else if(columnIndex == 4) {
            temp = patientList.get(rowIndex).getMobileNumber();
        } else if (columnIndex == 5) {
            temp = consultationList.get(rowIndex).getDoctorName();
        } else if (columnIndex == 6) {
            temp = consultationList.get(rowIndex).getSpecialization();
        } else if (columnIndex == 7) {
            temp = consultationList.get(rowIndex).getDate();
        } else if (columnIndex == 8) {
            temp = consultationList.get(rowIndex).getTimeSlot();
        }
        return temp;
    }

    public String getColumnName(int col){
        return columnName[col];
    }

    public Class getColumnClass(int col){
        if(col == 0){
            return String.class;
        }else if(col == 1){
            return String.class;
        }else if(col == 2){
            return Date.class;
        }else if(col == 3){
            return String.class;
        }else if(col == 4){
            return String.class;
        }else if(col == 5){
            return String.class;
        }else if(col == 6){
            return String.class;
        }else if(col == 7){
            return String.class;
        }else if(col == 8){
            return String.class;
        } else {
            return null;
        }
    }
}
