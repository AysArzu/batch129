package aracKiralama;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dummy {
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
        Period period1 = Period.between(bugun, tarih1);
        System.out.println(period1.getDays() + " gun " + period1.getMonths() + " ay sonra arabanizi teslim alacaksiniz");
        System.out.println("Arabayi ne zaman teslim edeceksiniz?\n mm/hh formatinda yaziniz");
        String teslimDakikasi = scan.next();
        String teslimSaati = scan.next();

        System.out.println("Hangi tarihte arabayı teslim edeceginizi giriniz\n" +
                "tarihi gg/aa/yyyy seklinde giriniz");
        int teslimEdilecekGun = 0;
        int teslimEdilecekAy = 0;
        int teslimEdilecekYil = 0;

        teslimEdilecekGun = scan.nextInt();
        teslimEdilecekAy = scan.nextInt();
        teslimEdilecekYil = scan.nextInt();
        LocalDate tarih2 = LocalDate.of(teslimEdilecekYil, teslimEdilecekAy,  teslimEdilecekGun);
        Period period2 = Period.between(tarih1, tarih2);
//        System.out.println("Arabayi "+period2.getDays()+period2.getMonths()+period2.getYears()+
//                        "kullanacaksiniz. Odemeniz gereken tutar "+ period2*secilenAraba.getGunlukUcret());

//        LocalTime iadeSaati = LocalTime.parse(teslimDakikasi, DateTimeFormatter.ofPattern(teslimSaati)); //(teslimDakikasi,teslimSaati)
//        System.out.println(iadeSaati);

    }
}
