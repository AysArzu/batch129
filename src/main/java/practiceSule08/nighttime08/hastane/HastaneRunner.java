package practiceSule08.nighttime08.hastane;

public class HastaneRunner {

    private static Hastane hastane = new Hastane();

    public static void main(String[] args) {

        HastaIslemleri.hastaEkle();

//        QA9_Hastanesiislemler.start();

        String hastaDurumu = "Bas agrisi";
        String unvan = doktorUnvan(hastaDurumu);

        hastane.setDoktor(doktorBul(unvan));

        System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());

        System.out.println(hastaBul(hastaDurumu));

    }//main


    public static String doktorUnvan(String actuelDurum) {

        switch (actuelDurum) {
            case "Allerji":
                return hastane.unvanlar[0];

            case "Bas agrisi":
                return hastane.unvanlar[1];

            case "Diabet":
                return hastane.unvanlar[2];

            case "Soguk alginligi":
                return hastane.unvanlar[3];

            case "Migren":
                return hastane.unvanlar[4];

            case "Kalp hastaliklari":
                return hastane.unvanlar[5];
            default:
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
}

    public static Durum hastaDurumuBul(String aktuelDurum) {

        boolean aciliyet = false;

        switch (aktuelDurum) {
            case " Allerji":
            case " Bas agrisi":
            case " Diabet":
            case " Soguk alginligi":
                aciliyet = false;
                break;
            case "Migren":
            case "Kalp hastaliklari":
                aciliyet = true;
                break;
            default:
                System.out.println("Gecerli bir durum degil");
        }

        Durum hastaDurumu = new Durum(aktuelDurum, aciliyet);

        return hastaDurumu;

    }//method


    public static Hasta hastaBul(String aktuelDurum) {

        Hasta hasta = new Hasta();

        for (int i = 0; i < hastane.hastaIsimleri.length; i++) {
            if (aktuelDurum.equalsIgnoreCase(hastane.durumlar[i])) {
                hasta.setIsim(hastane.hastaIsimleri[i]);
                hasta.setSoyIsim(hastane.hastaSoyIsimleri[i]);
                hasta.setHastaID(hastane.hastaIDleri[i]);
                hasta.setHastaDurumu(hastaDurumuBul(aktuelDurum));
            }
        }
        return hasta;
    }//method hastaBul

    }





