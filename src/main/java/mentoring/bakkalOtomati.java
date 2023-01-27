package mentoring;

import java.util.Arrays;
import java.util.Scanner;

public class bakkalOtomati {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hesap=0;
        String bitir;
        int girenPara;
        int   alinan=0;
        do {

            String[] a = {"yogurt", "salca", "camasirSuyu", "margarin", "peynir", "zeytinyagi", "kefir",
                    "disfircasi", "dusjeli", "islakmendil", "havuc", "domates", "patates", "kabak"};
            System.out.println("satistaki urunlerimiz= " + Arrays.toString(a));
            System.out.println("Lutfen bir urun seciniz");
            String urun = scan.next().toLowerCase().trim();

            int paraUstu = 0;
            if (urun.equalsIgnoreCase("yogurt")) {
                int yogurt = 2;
               /* if (girenPara > yogurt) {
                    paraUstu = girenPara - yogurt;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + yogurt + " Tl dir");
                } */
                hesap+=yogurt;
            }
            if (urun.equalsIgnoreCase("salca")) {
                int salca = 3;
             /*   if (girenPara > salca) {
                    paraUstu = girenPara - salca;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + salca + " Tl dir");
                } */
                hesap+=salca;
            }
            if (urun.equalsIgnoreCase("camasirSuyu")) {
                int camasirSuyu = 1;
                /* if (girenPara > camasirSuyu) {
                    paraUstu = girenPara - camasirSuyu;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + camasirSuyu + " Tl dir");
                } */
                hesap+=camasirSuyu;
            }
            if (urun.equalsIgnoreCase("margarin")) {
                int margarin = 1;
              /*  if (girenPara > margarin) {
                    paraUstu = girenPara - margarin;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + margarin + " Tl dir");
                } */  hesap+=margarin;
            }
            if (urun.equalsIgnoreCase("peynir")) {
                int peynir = 5;
               /* if (girenPara > peynir) {
                    paraUstu = girenPara - peynir;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + peynir + " Tl dir");
                } */   hesap+=peynir;
            }
            if (urun.equalsIgnoreCase("zeytinyagi")) {
                int zeytinyagi = 10;
               /* if (girenPara > zeytinyagi) {
                    paraUstu = girenPara - zeytinyagi;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + zeytinyagi + " Tl dir");
                } */ hesap+=zeytinyagi;
            }
            if (urun.equalsIgnoreCase("kefir")) {
                int kefir = 1;
              /*  if (girenPara > kefir) {
                    paraUstu = girenPara - kefir;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + kefir + " Tl dir");
                } */   hesap+=kefir;
            }
            if (urun.equalsIgnoreCase("disfircasi")) {
                int disfircasi = 0;
              /*  if (girenPara > disfircasi) {
                    paraUstu = girenPara - disfircasi;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + disfircasi + " Tl dir");
                } */   hesap+=disfircasi;
            }
            if (urun.equalsIgnoreCase("dusjeli")) {
                int dusjeli = 3;
               /* if (girenPara > dusjeli) {
                    paraUstu = girenPara - dusjeli;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + dusjeli + " Tl dir");
                } */   hesap+=dusjeli;
            }
            if (urun.equalsIgnoreCase("islakmendil")) {
                int islakmendil = 4;
               /* if (girenPara > islakmendil) {
                    paraUstu = girenPara - islakmendil;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + islakmendil + " Tl dir");
                } */   hesap+=islakmendil;
            }
            if (urun.equalsIgnoreCase("havuc")) {
                int havuc = 1;
              /*  if (girenPara > havuc) {
                    paraUstu = girenPara - havuc;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + havuc + " Tl dir");
                } */   hesap+=havuc;
            }
            if (urun.equalsIgnoreCase("domates")) {
                int domates = 2;
             /*   if (girenPara > domates) {
                    paraUstu = girenPara - domates;
                    System.out.println("paranizin ustu= " + paraUstu + " Tl dir");
                } else {
                    System.out.println("verdiginiz para yetersizdir. urunun fiyatı= " + domates + " Tl dir");
                } */   hesap+=domates;
            }
            if (urun.equalsIgnoreCase("patates")) {
                int patates = 2;
                hesap+=patates;
            }
            if (urun.equalsIgnoreCase("kabak")) {
                int kabak = 1;
                hesap= hesap+kabak;
            }
            if (!Arrays.toString(a).contains(urun)) {
                System.out.println("gecerli bir urun ismi girin ");
            }else{
                System.out.println();}
            System.out.println("urun secmeyi bitirmek icin lutfen n tusuna basin.");
            bitir = scan.next();
        } while (!bitir.equalsIgnoreCase("n") );
        do {
            System.out.println("Lutfen vereceginiz para miktarini 1-5-10-20 Tl seklinde girin");
            girenPara = scan.nextShort();
            if (girenPara==1&&girenPara==5&&girenPara==10&&girenPara==20){
                hesap=hesap-girenPara-alinan;}else {
                System.out.println("lutfen "+(hesap-girenPara)+" Tl daha giris yapiniz");}
            alinan+=girenPara;
        }while (girenPara<hesap&&alinan<hesap);
        System.out.println((girenPara-hesap)+" Tl para ustu alacaksiniz");
    }
}
