package practiceSule08.nighttime08.hastane;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DoktorIslemleri {

    static Scanner scan = new Scanner(System.in);
    static Map<String, String> doktorListesiMap = new HashMap<>();

    public static void doktorListesi() {
        doktorListesiMap.put("allergist", "Nilson, Avery");
        doktorListesiMap.put("norolog", "John, Abel");
        doktorListesiMap.put("genel cerrah", "Robert, Erik");
        doktorListesiMap.put("cocuk doktoru", "Marry, Jacob");
        doktorListesiMap.put("dahiliye", "Alan, Pedro");
        doktorListesiMap.put("kardiolog", "Mahesh, Tristen");
    }

    public static void doktorMenu() throws InterruptedException {

        int tercih = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("============DOKTOR MENUSU===========\n" +

                "\n" +
                "\t  1-Doktor Ekle\t\n" +
                "\t  2-Doktor Listesi Yazdir\n" +
                "\t  3-Unvandan Doktor Bulma\n" +
                "\t  4-Doktor Silme\n" +
                "\t  5-ANA MENU\n" +
                "\t  6-CIKIS");

        tercih = scan.nextInt();
        switch (tercih) {
            case 1:
                doktorEkleMethodu();
                doktorMenu();
                break;

            case 2:
                doktorListesiYazdirma();
                doktorMenu();
                break;
            case 3:
                unvandanDoktorBulma();
                doktorMenu();
                break;
            case 4:
                doktorSilme();
                doktorMenu();
                break;
            case 5:
                QA9_Hastanesiislemler.hastaneMenusu();
                break;
            case 6:
                doktorMenusuCikis();
                break;

            default:
                System.out.println("Lutfen gecerli tercih yapiniz");

        }
    }

    private static void doktorMenusuCikis() throws InterruptedException {
        System.out.println("==>Ana Menuye donmek icin '1' e\n" +
                "==>Cikis icin '0' a basin");
        int secim = scan.nextInt();
        if (secim == 1) {
            QA9_Hastanesiislemler.hastaneMenusu();
        } else if (secim == 0) {
            System.out.println("Sistemden cikisiniz gerceklesti");

        }

    }

    public static void doktorEkleMethodu() {
        System.out.println("=========DOKTOR EKLEME========");
        System.out.println("Doktor ismi giriniz: ");
        String doktorAdi = scan.nextLine();
        System.out.println("Doktor soyismini giriniz: ");
        String doktorSoyIsim = scan.nextLine();
        System.out.println("Doktor unvanini giriniz: ");
        String doktorUnvan = scan.nextLine();
        String doktorTamAd = doktorAdi + " , " + doktorSoyIsim;
        doktorListesiMap.put(doktorUnvan, doktorTamAd);
    }

    public static void doktorListesiYazdirma() {
        System.out.println("========DOKTOR LISTELEME=========");
        System.out.println(" Unvan          Isim     Soyisim \n" +
                "---------------------------------------------------");
        Set<Map.Entry<String, String>> doktorListSet = doktorListesiMap.entrySet();
        for (Map.Entry<String, String> each : doktorListSet) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            //System.out.println(eachKey+", "+eachValue);
            String valueArr[] = eachValue.split(", ");
            System.out.printf("%-15s %-7s %-3s \n", eachKey, valueArr[0], valueArr[1]);
        }

    }

    public static void unvandanDoktorBulma() {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** UNVANDAN DOKTOR BULMA*****");
        System.out.println("========Aradiginiz doktorun unvanini giriniz=========");
        System.out.println("Allergist//Norolog//Genel cerrah//Cocuk doktoru//Dahiliye//Kardiolog");
        String arananUnvan = scan.nextLine().toLowerCase();
        Set<Map.Entry<String, String>> doktorEntrySet = doktorListesiMap.entrySet();
        System.out.println(doktorEntrySet);
        System.out.println("*****DOKTOR LISTESI*****");
        System.out.println("Unvan ismi soyadi\n" +
                "-------------------------------------");
        boolean flag = false;
        for (Map.Entry<String, String> w : doktorEntrySet) {
            String eachKey = w.getKey();
            //    System.out.println("====>>" + eachKey);
            String eachValue = w.getValue();
            String[] valueArr = eachValue.split(", ");
            if (eachKey.contains(arananUnvan)) {
                System.out.printf("%1s %-8s %-8s\n", eachKey, valueArr[0], valueArr[1]);
                flag = true;
                break;
            }


        }
        if (!flag ) {

            System.out.println("Gecerli unvan giriniz");
            unvandanDoktorBulma();
        }


    }

    public static void doktorSilme() {
        System.out.println("Silmek istediginiz doktorun unvanin giriniz");
        String arananUnvan = scan.nextLine().toLowerCase();

        boolean flag = false;
        if (doktorListesiMap.containsKey(arananUnvan)) {
            doktorListesiMap.remove(arananUnvan);
            System.out.println("Istenen doktor silindi");
            System.out.println("========Guncel doktor listesi=======");
            doktorListesiYazdirma();
            flag = true;

        } else {
            System.out.println("Gecerli unvan giriniz");
            System.out.println("Allergist//Norolog//Genel cerrah//Cocuk doktoru//Dahiliye//Kardiolog");
            doktorSilme();
        }
    }
}
