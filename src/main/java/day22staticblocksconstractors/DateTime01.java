package day22staticblocksconstractors;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;

public class DateTime01 {
    public static void main(String[] args) {
        //date Class
        Date myDate= new Date();
        System.out.println(myDate);//Sat Jan 07 23:26:57 EET 2023
        System.out.println(myDate.getTime());//1673123350377 ==> 1Ocak 1970 den şu ana kadarki mili saniyeyi verir
        //İçinde bulunduğumuz an nasıl alınır?(current time)

        System.out.println(LocalDate.now());//2023-01-07
        System.out.println(LocalTime.now());//23:37:27.808563700
        System.out.println(LocalDateTime.now());//2023-01-07T23:37:27.809065400

//Dunyanın herhangi bir saat dilimindeki saati nasıl alırız?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna"))); //2023-01-07T21:44:33.798092400
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:45:57.903512900
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));//2023-01-07T23:48:45.343139600

// ileriki bir tarihe nasıl gidilir?
        System.out.println(LocalDate.now().plusYears(7));//2030-01-07
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5));//2030-06-07
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12
 // geriki bir tarihe nasıl gidilir?

        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-5

// ileriki bir zamana nasıl gidilir?
        System.out.println(LocalTime.now().plusHours(3));//02:56:17.429925100

        // geriki bir zamana nasıl gidilir?
        System.out.println(LocalTime.now().minusMinutes(45));//23:13:36.149734400

        //Zamanda belli bir bölümü(compenent) nasıl alırız?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//0:1

// Tarihte belli bir bolumu nasıl alırız?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());//JANUARY:8
        System.out.println(LocalDate.now().getMonthValue() + ":" + LocalDate.now().getDayOfMonth());//1:7

        // iki tarih nasıl karşılaştırılır?
        //08/13/1981 - 11/05/1979
       boolean result= LocalDate.of(1981,8,13).isBefore( LocalDate.of(1979,05,11));
        System.out.println(result);//false
        boolean result1= LocalDate.of(1981,8,13).isAfter( LocalDate.of(1979,05,11));
        System.out.println(result1);//true

        // Tarihlerin formatları nasıl değiştirilir?
        // M-->Tek rakamla ay no sunu yazar- MM __>iki rakamla ay no sunu girer
        //MMM__> ay isminin ilk uc harfini yazar MMMM--> Ay isminin tamamını yazar
        //d--> tek rakamla gün nosunu yazar - dd --> iki rakamla gün nosunu yazar
        //yy --> yılın son iki rakamını yazar- yyyy --> yılın tamamını yazar.
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println(dtf.format(LocalDate.now()));// şimdiki tarihe uyguladık08/01/2023
        DateTimeFormatter dtf2 =DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");


    }
}
