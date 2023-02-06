package ssg01.telefon;

import java.time.*;
import java.util.Scanner;

public class LocalDate02 {
    public static void main(String[] args) {
        //burayi olustur
        Scanner scan = new Scanner(System.in);

        System.out.println("Hangi tarihte arabayı teslim alacaginizi giriniz\n" +
                "tarihi gg/aa/yyyy seklinde giriniz");
        int alinacakYil = 0;
        int alinacakAy = 0;
        int alinacakGun = 0;

        alinacakGun = scan.nextInt();
        alinacakAy = scan.nextInt();
        alinacakYil = scan.nextInt();

//alinacak gun ve teslim edilecek gun ve teslim saati bilgilerini aliniz.  Odenecek toplam gun sayisini yazdırın.

        LocalDate bugun = LocalDate.now();
        LocalDate tarih1 = LocalDate.of(alinacakYil, alinacakAy, alinacakGun);

        if (tarih1.isAfter(bugun)) {
            Period period1 = Period.between(bugun, tarih1);
            System.out.println(period1.getDays() + " gun " + period1.getMonths() + " ay sonra arabanizi teslim alacaksiniz");
            System.out.println("Arabayi ne zaman teslim edeceksiniz?\n mm/hh formatinda yaziniz");
            String teslimDakikasi = scan.next();
            String teslimSaati = scan.next();
        }
        else {
            System.out.println("Yanlis tarih girdiniz.Araci alacaginiz gun bugunun tarihinden once olamaz. Kontrol edip bir daha deneyiniz");
        }

        System.out.println("Hangi tarihte arabayı teslim edeceginizi giriniz\n" +
                "tarihi gg/aa/yyyy seklinde giriniz");
        int teslimEdilecekGun = 0;
        int teslimEdilecekAy = 0;
        int teslimEdilecekYil = 0;

        teslimEdilecekGun = scan.nextInt();
        teslimEdilecekAy = scan.nextInt();
        teslimEdilecekYil = scan.nextInt();
        LocalDate tarih2 = LocalDate.of(teslimEdilecekYil, teslimEdilecekAy, teslimEdilecekGun);
        if (tarih2.isAfter(tarih1)) {
//            Period period2 = Period.between(tarih1, tarih2);
//            System.out.println("Arabayi " + period2.getDays() + period2.getMonths() + period2.getYears() +
//                    "kullanacaksiniz. Odemeniz gereken tutar " + period2 * secilenAraba.getGunlukUcret());

        }else{
            System.out.println("Yanlis tarih girdiniz. Araci teslim edeceginiz gun alacaginiz gunun tarihinden once olamaz. Kontrol edip bir daha deneyiniz");
        }
        System.out.print("Saat bilgisini giriniz (HH:mm): ");
        String saatStr = scan.nextLine();
        LocalTime saat = LocalTime.parse(saatStr);
        System.out.println("Arabayi sozlesme geregi "+tarih2+ " de ve saat "+saat+ "de teslim edeceksiniz.");

    }
}
