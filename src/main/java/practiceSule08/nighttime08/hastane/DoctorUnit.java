package practiceSule08.nighttime08.hastane;
import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DoctorUnit {

    static List<Doctor> doctorList = new ArrayList<>();
    Hospital hospital = new Hospital();


    public void fillDoctorList() {

        for (int i = 0; i < hospital.titles.length; i++) {
            Doctor doctor = new Doctor(hospital.doctorNames[i], hospital.doctorSurnames[i], hospital.titles[i]);
            doctorList.add(doctor);
        }
    }


    public void showDoctorList() {
        System.out.println("            DOCTORS          ");
        System.out.printf("%-15s   %-10s   %-10s \n", "Title", "Name", "Surname");
        System.out.printf("%-15s   %-10s   %-10s \n", "-----", "----", "------");
        for (Doctor doctor : doctorList) {
            System.out.printf("%-15s   %-10s   %-10s \n", doctor.getTitle(), doctor.getName(), doctor.getSurname());
        }

    }


    public static Doctor findDoctorByTitle(String title) {
        for (Doctor doctor : doctorList) {
            if (doctor.getTitle().equalsIgnoreCase(title)) {
                System.out.println(doctor);
                return doctor;
            }

            System.out.println("Not found doctor!");

        }
        return new Doctor("", "", "");
    }

    public void addDoctor() {
        Doctor doctor = new Doctor();
        System.out.println("Doktor ismi :");
        HospitalRunner.scanner.nextLine(); // dummy
        doctor.setName(HospitalRunner.scanner.nextLine());
        System.out.println("Soyisim:");
        doctor.setSurname(HospitalRunner.scanner.nextLine());
        System.out.println("Unvan");
        doctor.setTitle(HospitalRunner.scanner.nextLine());

        doctorList.add(doctor);
        System.out.println(doctorList);

    }

    public Doctor deleteDoctor() {
        HospitalRunner.scanner.nextLine(); // dummy
        System.out.println("Silmek istediğiniz doktorun unvanını giriniz:");

        String title = HospitalRunner.scanner.nextLine();

        for (Doctor w : this.doctorList) {
            if (w.getTitle().equalsIgnoreCase(title)) {
                this.doctorList.remove(w);
                System.out.println(w + " silindi.");
                return w;
            }
        }
        System.out.println("Hatalı giriş yaptınız.");
        return deleteDoctor();
    }


    public static Doctor findDoctor(String unvan) {

        Doctor doctor = new Doctor();

        return doctor;

    }
}