package practiceSule08.nighttime08.hastane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HastaIslemleri extends DataBank {
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

        String secim = scan.nextLine();
        if (secim.length() != 1) {
            System.out.println("Lutfen menudeki rakamlardan birini giriniz");
            hastaMenusu();
        }
        boolean a = secim.contains("1") || secim.contains("2") || secim.contains("3") || secim.contains("4") || secim.contains("5") || secim.contains("6") || secim.contains("7");

        if (!a) {
            System.out.println("Lutfen menudeki rakamlardan birisini giriniz");
            hastaMenusu();
        }

        switch (secim) {
            case "1":
                hastaEkle();
                System.out.println();
                hastaMenusu();
                break;
            case "2":
                hastaListesiYazdir();
                System.out.println();
                hastaMenusu();
                break;
            case "3":
                hastaDurumu();
                hastaMenusu();
                break;
            case "4":
                hastaSilme();
                System.out.println();
                hastaMenusu();
                break;
            case "5":
                hastaBulma();
                hastaMenusu();
                break;
            case "6":
                anaMenu();
                hastaMenusu();
                break;
            case "7":
                hastaMenusuCikis();
                break;
            default:
                System.out.println("Gecerli bir numara giriniz");
        }
    }

    public static void hastaEkle() throws InterruptedException {  // YAPILACAK

        System.out.println("=========HASTA EKLEME========");
        System.out.println("Hasta ismini giriniz: ");

        String c = scan.nextLine().trim().toLowerCase();
        c = c.replaceAll("[0-9]", "");
        if (c.length() == 0) {
            System.out.println("Lutfen isim giriniz");
            hastaEkle();
        }

        String[] girilenDeger = c.split("");
        String ilk = "";
        String iki = "";
        for (int i = 0; i < girilenDeger.length; i++) {
            if (i == 0) {
                ilk = girilenDeger[0];
            } else {
                iki += girilenDeger[i];
            }
        }
        String hastaAdi = ilk.toUpperCase() + iki;
        System.out.println("Hasta soyismini giriniz: ");

        String a = scan.nextLine().trim().toLowerCase();
        a = a.replaceAll("[0-9]", "");
        if (a.length() == 0) {
            System.out.println("Lutfen soyisim giriniz");
            hastaEkle();
        }

        String[] girilenDeger1 = a.split("");
        String ilk1 = "";
        String iki1 = "";
        for (int i = 0; i < girilenDeger1.length; i++) {
            if (i == 0) {
                ilk1 = girilenDeger1[0];
            } else {
                iki1 += girilenDeger1[i];
            }
        }

        String hastaSoyIsim = ilk1.toUpperCase() + iki1;
        System.out.println("Hastaliginizi giriniz: ");

        String b = scan.nextLine().trim().toLowerCase();
        b = b.replaceAll("[0-9]", "");
        if (b.length() == 0) {
            System.out.println("Lutfen hastaligi giriniz");
            hastaEkle();
        }
        String[] girilenDeger2 = b.split("");
        String ilk2 = "";
        String iki2 = "";
        for (int i = 0; i < girilenDeger2.length; i++) {
            if (i == 0) {
                ilk2 = girilenDeger2[0];
            } else {
                iki2 += girilenDeger2[i];
            }
        }
        String hastaAktuel = ilk2.toUpperCase() + iki2;

        String hastaTamAd = hastaAdi + ", " + hastaSoyIsim + ", " + hastaAktuel;
        hastaIDNo += 111;
        hastaListesiMap.put(hastaIDNo, hastaTamAd);
        System.out.println(hastaListesiMap);
        System.out.println("\n\n");

        Integer menuSec = 0;
        boolean d = false;
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("========HASTA EKLEME MENUSUNDESİNİZ=========\n" +
                    "\t1-Hasta Menusu\n" +
                    "\t2-Ana Menu\t\n" +
                    "\t3-Yeni Hasta Ekleme");
            try {
                menuSec = Integer.parseInt(brr.readLine());
                d = true;
            } catch (NumberFormatException e) {
                System.out.println("Yanlis karakter girdiniz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } while (!d);
        if (menuSec == 1) {
            hastaMenusu();
        }
        if (menuSec == 2) {
            anaMenu();
        } else {
            hastaEkle();
        }
    }

    public static void hastaListesiYazdir() throws InterruptedException {
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
        System.out.println("\n\n");
        Integer menuSec = 0;
        boolean c = false;
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("========HASTA LISTESI YAZDIRMA MENUSUNDESİNİZ=========\n" +
                    "\t1-Hasta Menusu\n" +
                    "\t2-Ana Menu\t\n" +
                    "\t3-Hasta Listesi Yazdirma");
            try {
                menuSec = Integer.parseInt(brr.readLine());
                c = true;
            } catch (NumberFormatException e) {
                System.out.println("Yanlis karakter girdiniz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } while (!c);
        if (menuSec == 1) {
            hastaMenusu();
        }
        if (menuSec == 2) {
            anaMenu();
        } else {
            hastaListesi();
        }
    }

    public static void hastaDurumu() throws InterruptedException {

        Case hastaDurumu = new Case();

        System.out.println("**********Hasta durumunu giriniz: **********");
        System.out.println("Allerji--Bas Agrisi--Diabet--Soguk alginligi--Migren--Kalp hastaliklari");

        String d = scan.nextLine().toLowerCase().trim();

        hastaDurumu.setAktuelDurum(d);

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
        System.out.println("\n\n");
        Integer menuSec = 0;
        boolean c = false;
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("========HASTA DURUMU MENUSUNDESİNİZ=========\n" +
                    "\t1-Hasta Menusu\n" +
                    "\t2-Ana Menu\t\n" +
                    "\t3-Hasta Durumu");
            try {
                menuSec = Integer.parseInt(brr.readLine());
                c = true;
            } catch (NumberFormatException e) {
                System.out.println("Yanlis karakter girdiniz");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } while (!c);
        if (menuSec == 1) {
            hastaMenusu();
        }
        if (menuSec == 2) {
            anaMenu();
        } else {
            hastaDurumu();
        }
    }

    public static void hastaSilme() throws InterruptedException {
        System.out.println("Silmek istediginiz hastanin ID numarasini giriniz");
        System.out.println(hastaListesiMap);
        Integer silinecekId = 0;
        boolean a = false;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println("Lütfen bir sayı giriniz: ");
            try {
                silinecekId = Integer.parseInt(br.readLine());
                a = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Yanlış karakter girdiniz. Lütfen bir sayı girin;");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } while (!a);

        boolean flag = false;
        System.out.println("silinecek id" + silinecekId);
        if (hastaListesiMap.containsKey(silinecekId)) {
            hastaListesiMap.remove(silinecekId);
            System.out.println("Istenen hasta silindi");
            System.out.println("========Guncel hasta listesi====...");
        }
    }
}




