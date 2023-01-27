package practiceSule08.nighttime08.hastane;

public class Runner {
    private static Hastane hastane = new Hastane();// static yaptik main uzerinde

    public static void main(String[] args) {
        String hastaDurumu = "Bas agrisi";
        String unvan = doktorUnvan(hastaDurumu);

      hastane.setDoktor(doktorBul(unvan));
        System.out.println("Doktor ismi : "+hastane.getDoktor().getIsim());
        System.out.println("Doktor ismi : "+hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor ismi : "+hastane.getDoktor().getUnvan());


    }

    private static Doktor doktorBul(String unvan) {
        Doktor doktor = new Doktor();
        for (int i = 0; i < hastane.unvanlar.length; i++) {
            doktor.setIsim(hastane.doctorIsimleri[i]);
            doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
            doktor.setUnvan(unvan);
        }return doktor;
    }

    private static String doktorUnvan(String hastaDurumu) {
        if (hastaDurumu.equals("Alerji")) {
            return hastane.unvanlar[0];
        } else if (hastaDurumu.equals("Bas agrisi")) {
            return hastane.unvanlar[1];

        } else if (hastaDurumu.equals("Diabet")) {
            return hastane.unvanlar[2];
        } else if (hastaDurumu.equals("Kalp Spazmi")) {
            return hastane.unvanlar[3];
        } else {
            return "yanlis durum";
        }


    }

}
