package practiceSule08.nighttime08.hastane;

import java.util.*;

public class HastaIslemleri {
    static Scanner scan = new Scanner(System.in);
    static Map<Integer, String> hastaListesiMap = new HashMap<>();

    static int hastaIDNo = 666;

    public static void hastaListesi() {
        hastaListesiMap.put(111, "warren, traven, allerji");
        hastaListesiMap.put(222, "petanow, william, bas agrisi");
        hastaListesiMap.put(333, "sophia, george, diabet");
        hastaListesiMap.put(444, "emma, tristan, soguk alginligi");
        hastaListesiMap.put(555, "darian, luis, migren");
        hastaListesiMap.put(666, "peter, cole, kalp hastaliklari");
    }

    public static void hastaMenusu() throws InterruptedException {

        Scanner scan = new Scanner(System.in);
        System.out.println("\t=====HASTA MENUSU=====\n" +
                "\t  1- Hasta Ekleme\t\n" +
                "\t  2- Hasta Listesi Yazdir\n" +
                "\t  3- Hasta Durumu Listele\n" +
                "\t  4- Hasta Silme\n" +
                "\t  5- Hasta Bulma\n" +
                "\t  6- ANA MENU\n" +
                "\t  7-CIKIS");

        int secim = scan.nextInt();
        switch (secim) {
            case 1:// hasta ekleyecegiz
                hastaEkle();
                System.out.println();
                hastaMenusu();
                break;
            case 2:
                hastaListesiYazdir();
                System.out.println();
                hastaMenusu();
                break;
            case 3:
                hastaDurumu();
                hastaMenusu();
                break;
            case 4:
                hastaSilme();
                System.out.println();
                hastaMenusu();
                break;
            case 5:
                hastaBulma();
                hastaMenusu();
                break;
            case 6:
                anaMenu();
                hastaMenusu();
                break;
            case 7:
                hastaMenusuCikis();
                break;
            default:
                System.out.println("Gecerli bir numara giriniz");
        }
    }

    public static void hastaEkle() {  // YAPILACAK

        System.out.println("=========HASTA EKLEME========");
        System.out.println("Hasta ismini giriniz: ");
        String hastaAdi = scan.nextLine();
        System.out.println("Hasta soyismini giriniz: ");
        String hastaSoyIsim = scan.nextLine();
        System.out.println("Hastaliginizi giriniz: ");
        String hastaAktuel = scan.nextLine();
        String hastaTamAd = hastaAdi + ", " + hastaSoyIsim + ", " + hastaAktuel;
        hastaIDNo += 111;
        hastaListesiMap.put(hastaIDNo, hastaTamAd);
        System.out.println(hastaListesiMap);
    }

    public static void hastaListesiYazdir () {
        System.out.println("======HASTA LISTELEME======");
        System.out.println(" IdNo     Isim    Soyisim     AktuelDurum \n" +
                "---------------------------------------------------");
        Set<Map.Entry<Integer, String>> hastaListSet = hastaListesiMap.entrySet();
        for (Map.Entry<Integer, String> each : hastaListSet) {
            Integer eachKey = each.getKey();
            String eachValue = each.getValue();
            //System.out.println(eachKey+", "+eachValue);
            String valueArr[] = eachValue.split(", ");
            System.out.printf("%-8s %-8s %-12s %-4s\n", eachKey, valueArr[0], valueArr[1], valueArr[2]);
        }
    }

    public static void hastaDurumu () {

        Durum hastaDurumu = new Durum();

        System.out.println("**********Hasta durumunu giriniz: **********");
        System.out.println("Allerji--Bas Agrisi--Diabet--Soguk alginligi--Migren--Kalp hastaliklari");
        hastaDurumu.setAktuelDurum(scan.nextLine().toLowerCase());

        switch (hastaDurumu.getAktuelDurum()) {
            case "allerji":
                hastaDurumu.setAciliyet(false);
                System.out.println("Durumunuz acil degil");
                break;
            case "bas agrisi":
                hastaDurumu.setAciliyet(false);
                System.out.println("Durumunuz acil degil");
                break;
            case "diabet":
                hastaDurumu.setAciliyet(false);
                System.out.println("Durumunuz acil degil");
                break;
            case "soguk alginligi":
                hastaDurumu.setAciliyet(false);
                System.out.println("Durumunuz acil degil");
                break;
            case "migren":
                hastaDurumu.setAciliyet(true);
                System.out.println("Durumunuz ACIL");
                break;
            case "kalp hastaliklari":
                hastaDurumu.setAciliyet(true);
                System.out.println("Durumunuz ACIL");
                break;
            default:
                System.out.println("Gecerli bir durum degil");
        }

    }

    public static void hastaSilme () {
        System.out.println("Silmek istediginiz hastanin ID numarasini giriniz");
        System.out.println(hastaListesiMap);
        Integer silinecekId = scan.nextInt();

        boolean flag = false;
        if (hastaListesiMap.containsKey(silinecekId)) {
            hastaListesiMap.remove(silinecekId);
            System.out.println("Istenen hasta silindi");
            System.out.println("========Guncel hasta listesi=======");
            hastaListesiYazdir();
            flag = true;

        }
        if (flag == false) {
            System.out.println("Gecerli ID giriniz");
            hastaSilme();
        }
    }

    public static void hastaBulma () {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** ID NUMARASI ILE HASTA BULMA*****");
        System.out.println(hastaListesiMap);
        System.out.println("Aradiginiz hastanin ID Numarasini giriniz");
        Integer arananId = scan.nextInt();
        Set<Map.Entry<Integer, String>> hastaEntrySet = hastaListesiMap.entrySet();
        System.out.println("*****HASTA LISTESI*****");
        System.out.println(" IdNo     Isim    Soyisim     AktuelDurum \n" +
                "---------------------------------------------------");
        boolean flag = false;
        for (Map.Entry<Integer, String> w : hastaEntrySet) {
            Integer eachKey = w.getKey();
            String eachValue = w.getValue();
            String[] valueArr = eachValue.split(", ");
            if (eachKey.equals(arananId)) {
                System.out.printf("%1s %-8s %-8s\n", eachKey, valueArr[0], valueArr[1], valueArr[2]);
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Gecerli ID giriniz");
            hastaBulma();
        }
    }

    public static void anaMenu () throws InterruptedException {
        QA9_Hastanesiislemler.hastaneMenusu();
    }

    public static void hastaMenusuCikis () throws InterruptedException {
        System.out.println("==>Ana Menuye donmek icin '1' e\n" +
                "==>Cikis icin '0' a basin");
        int secim = scan.nextInt();
        if (secim == 1) {
            QA9_Hastanesiislemler.hastaneMenusu();
        } else if (secim == 0) {
            System.out.println("Sistemden cikisiniz gerceklesti");
        }
    }
}//class



