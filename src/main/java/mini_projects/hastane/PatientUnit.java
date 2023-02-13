package mini_projects.hastane;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientUnit {
static Scanner scanner= new Scanner(System.in);
    List<Patient> patientList = new ArrayList<>();
    Hospital hospital = new Hospital();

    public void addPatient() {
        Patient patient = new Patient();
        System.out.println("Hasta Adı: ");
        patient.setName(HospitalRunner.scanner.nextLine());
        System.out.println("Hasta Soyad: ");
        patient.setSurname(HospitalRunner.scanner.next());
        patient.setPatientID(idCreate());

        this.patientList.add(patient);
        System.out.println(this.patientList);

    }

    public Patient deletePatient() {
        System.out.println("Silmek istediğiniz hasta Id: ");
        int id = HospitalRunner.scanner.nextInt();

        for (Patient w : this.patientList) {
            if (w.getPatientID() == id) {
                this.patientList.remove(w);
                System.out.println(w + " silindi.");
                return w;
            }
        }
        System.out.println("Hatalı giriş yaptınız.");
        return deletePatient();
    }

    public int idCreate() {
        int lastIdx = hospital.patientsID.length - 1;
        return hospital.patientsID[lastIdx - 1] + 111;
    }

    public void fillPatientList() {
        for (int i = 0; i < hospital.patientNames.length; i++) {
            Patient patient = new Patient(hospital.patientNames[i], hospital.patientSurnames[i], hospital.patientsID[i]);
            this.patientList.add(patient);
        }
    }

    public void showPatientList() {
        System.out.println("            PATIENTS         ");
        System.out.printf("-%3s   %-10s   %-10s \n", "ID ", "Name", "Surname");
        System.out.printf("-%3s   %-10s   %-10s \n", "---", "----", "------");
        for (Patient patient : patientList) {
            System.out.printf("-%3s   %-10s   %-10s \n", patient.getPatientID(), patient.getName(), patient.getSurname());
        }

    }

    public Patient findPatientById(int id) {
        if (id == 0) {
            System.out.println("Ana Menüye yönlendiriliyorsunuz");
        } else {
            for (Patient patient : patientList) {
                if (patient.getPatientID() == id) {
                    System.out.println(patient);
                    return patient;
                }
            }
            System.out.println("Not found patient!");
        }
        return new Patient("", "", 0);

    }

    public Case findPatientsCase(String actualCase) {
        Case patientCase = new Case();

        switch (actualCase.toLowerCase()) {
            case "allerji":
                patientCase.setUrgency(false);
                patientCase.setActualCase(actualCase);
                break;
            case "bas agrisi":
                patientCase.setUrgency(false);
                patientCase.setActualCase(actualCase);
                break;
            case "diabet":
                patientCase.setUrgency(false);
                patientCase.setActualCase(actualCase);
                break;
            case "soguk alginligi":
                patientCase.setUrgency(false);
                patientCase.setActualCase(actualCase);
                break;
            case "migren":
                patientCase.setUrgency(true);
                patientCase.setActualCase(actualCase);
                break;
            case "kalp hastaliklari":
                patientCase.setUrgency(true);
                patientCase.setActualCase(actualCase);
                break;
            default:
                System.out.println("Gecerli bir durum degil");
                patientCase();
        }

        return patientCase;

    }

    public static Patient findPatient(String actualCase) {
        Patient patient = new Patient();

        return patient;

    }

    public void patientCase() {
        System.out.println("Hasta Durumları: ");
        for (int i = 0; i < hospital.cases.length; i++) {
            System.out.printf("-%-7s ", hospital.cases[i] + " ");
        }
        System.out.println("\n**************************************************************************");
        System.out.println("Hasta Durumunu Giriniz");
        HospitalRunner.scanner.nextLine(); // dummy
        Case patientCase = findPatientsCase(HospitalRunner.scanner.nextLine());

        if (patientCase.isUrgency()) {
            System.out.println("Hastanın Durumu Acil!");
            if (patientCase.getActualCase().equalsIgnoreCase("Migren")) {
                System.out.println("Hastanın atandığı doktor: ");
                System.out.println(DoctorUnit.findDoctorByTitle("Norolog"));
            } else if (patientCase.getActualCase().equalsIgnoreCase("Kalphastaliklari")) {
                System.out.println("Hastanın atandığı doktor: ");
                System.out.println(DoctorUnit.findDoctorByTitle("Kardiolog"));
            }
        } else {
            System.out.println("Hastanın durumu acil değil.");

        }


    }

    public void assignmentDoctor(String actualCase) {

        Doctor doctor = new Doctor();

        if (actualCase.equalsIgnoreCase("Migren")) {

        }

    }

}


