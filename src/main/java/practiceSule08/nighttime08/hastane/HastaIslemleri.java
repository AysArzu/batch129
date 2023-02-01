package practiceSule08.nighttime08.hastane;

import java.util.*;

public class HastaIslemleri {
    static Scanner scan = new Scanner(System.in);
    static Map<Integer, String> hastaListesiMap = new HashMap<>();
    static int hastaIDNo = 777;

    public static void hastaListesi() {
        hastaListesiMap.put(111, "Warren,Traven,Allerji");
        hastaListesiMap.put(222, "Petanow,William,Bas agrisi");
        hastaListesiMap.put(333, "Sophia,George,Diabet");
        hastaListesiMap.put(444, "Emma,Tristan,Soguk alginligi");
        hastaListesiMap.put(555, "Darian,Luis,Migren");
        hastaListesiMap.put(666, "Peter,Cole,Kalp hastaliklari");
    }

    public static void hastaMenusu() throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hasta Menusu\n" +
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
                //hastaEkle();
                // hastaMenusu();
                break;
            case 2:
                //hastaListesiYazdir();
                // hastaMenusu();
                break;
            case 3:
                //hastaDurumu();
                // hastaMenusu();
                break;
            case 4:
                //hastaSilme();
                // hastaMenusu();
                break;
            case 5:
                //hastaBulma();
                // hastaMenusu();
                break;
            case 6:
                //anaMenu():
                // hastaMenusu();
                break;
            case 7:
                //hastaMenusuCikis();
                break;
            default:
                System.out.println("Gecerli bir numara giriniz");
        }

    }//method hastaMenusu

    public static void hastaEkle() {
        Hastane hstIsim = new Hastane();

        System.out.println(Arrays.toString(hstIsim.hastaIsimleri));

        List<String> hastaIsimleri = new ArrayList<>(Arrays.asList(hstIsim.hastaIsimleri));

        System.out.println("Yeni hasta ismini giriniz");
        hastaIsimleri.add(scan.next());

        System.out.println(Arrays.toString(hstIsim.hastaIsimleri));

    }
}//class



