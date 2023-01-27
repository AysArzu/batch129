package ssg01.telefon;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeLokal {
    public static void main(String[] args) {
        /*soru 1)
-bugunun tarihini obje olusturarak yazdirin
-bugun yilin kacinci gunu oldugunu yazdirin
-hangi gunde oldugumuzu yazdirin
-bugunden itibaren 3yil 5 ay 7gun sonraki tarihi yazdirin
sout(tarih.plusYears(3).plus.Months(5).plusDays(7))
-bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin ayin kacinci gunu oldugunu yazdirin
-bugunden itibaren 3yil 5 ay 7 gun sonraki tarihin haftanin hangi gunu oldugunu yazdirin
-ikinci bir tarih objesi olusturun ve iki tarihi karsilastirin ve bize eski olan tarihi dondurun
 */
        LocalDate bugun= LocalDate.now();
        System.out.println(bugun);
        System.out.println(bugun.getDayOfYear());
        System.out.println(bugun.getDayOfWeek());
        System.out.println(bugun.plusYears(3).plusMonths(5).plusDays(7));
/*
        soru 2)
-suanin saatini dakikasini ve saniyesini bize dondurun
-suanin saniyesini bize dondurun
-10000 saniye sonrasini bize dondurun
-200 dakika onceki saati bize dondurun
-bize saati 3 yapip yazdirin(dakika ve saniye degismeden)

         */
        LocalTime saat=LocalTime.now();
        System.out.println(saat);//19:26:27.165827200
        System.out.println(saat.getSecond());
        System.out.println(saat.plusSeconds(10000));
        System.out.println(saat.minusMinutes(200));
        System.out.println(saat.minusHours(4));
        System.out.println(saat.withMinute(3));
// iki tarih arasindaki farki bulma methodu dogum tarihi ve suan ki zaman gibi
        Scanner scan=new Scanner(System.in);
        System.out.println("dogum tarihini giriniz");
        int yil=scan.nextInt();

        int ay=scan.nextInt();

        int gun=scan.nextInt();
        LocalDate bugun1=LocalDate.now();
        LocalDate tarih=LocalDate.of(yil,ay,gun);
        Period period=Period.between(tarih,bugun1);
        System.out.println(period);

         /*
        soru 3)
bize bugunun tarihini ve su anki saati dondurun
bize 3 ay 100 saat sonraki tarih ve saati dondurun
bize 100 gun once 100 saat sonraki tarihi dondurun
bize 3 yil 5 ay 10 gün 1000 saat sonraki tarihin haftanin hangi günü oldugunu dondurun
bize sadece bugunun tarihi dondurun
         */
        LocalDateTime bugun2=LocalDateTime.now();
        System.out.println(bugun2);
        System.out.println(bugun2.plusMonths(3).plusHours(100));
        System.out.println(bugun2.minusDays(100).plusHours(100));
        System.out.println(bugun2.plusYears(3).plusMonths(5).plusDays(10).plusHours(1000).getDayOfWeek());
        System.out.println(bugun2.toLocalDate());
// tarih formatini degistirme
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("M/yy/d mm:hh a");
        LocalDateTime bugun3=LocalDateTime.now();
        System.out.println(dtf.format(bugun3));

    }
}
