package practiceSule08.nighttime08.hastane;

public class Runner {
    private static Hastane hastane = new Hastane();// static yaptik main uzerinde

    public static void main(String[] args) {

        String hastaDurumu = "Bas agrisi";
        String unvan = doktorUnvan(hastaDurumu);

        hastane.setDoktor(doktorBul(unvan));

        System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());

    }//main


    public static String doktorUnvan(String actuelDurum) {

        if (actuelDurum.equals("Allerji")) {
            return hastane.unvanlar[0];

        } else if (actuelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];

        } else if (actuelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];

        } else if (actuelDurum.equals("Soguk alginligi")) {
            return hastane.unvanlar[3];

        } else if (actuelDurum.equals("Migren")) {
            return hastane.unvanlar[4];

        } else if (actuelDurum.equals("Kalp hastaliklari")) {
            return hastane.unvanlar[5];
        }else{
            return "Yanlis Durum";
        }


    }//method

    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane.unvanlar.length; i++) {

            if (unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }//if
        }//for i
        return doktor;
    }//
    }
