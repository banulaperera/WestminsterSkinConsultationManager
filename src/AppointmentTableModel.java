import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Date;

public class AppointmentTableModel extends AbstractTableModel {
    private String[] columnName = {"ID", "Name", "Gender", "Date Of Birth", "Mobile Number"};
    private final ArrayList<Patient> patientList;

    AppointmentTableModel(ArrayList<Patient> listOfPatients){
        patientList = listOfPatients;
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
        } else {
            return null;
        }
    }
}
