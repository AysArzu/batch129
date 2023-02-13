package mini_projects.hastane;
public class Patient {
    private String name;
    private String surname;
    private int patientID;
    private Case patientCase;

    public Patient() {
    }

    public Patient(String name, String surname, int patientID) {
        this.name = name;
        this.surname = surname;
        this.patientID = patientID;
    }

    public Patient(int patientID, Case patientCase) {
        this.patientID = patientID;
        this.patientCase = patientCase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public Case getPatientCase() {
        return patientCase;
    }

    public void setPatientCase(Case patientCase) {
        this.patientCase = patientCase;
    }

    @Override
    public String toString() {
        return "Patient "  + name +
                surname + '\\' +
                ", patientID=" + patientID +
                ", patientCase=" + patientCase;
    }
}
