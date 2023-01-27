package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        // Time'ı formatlayınız
        LocalTime myTime=LocalTime.now();
        System.out.println(myTime);//21:39:03.332809
        //hh==>12lik saaat sistemini kullanır  -- HH==> 24lük saat sistemini kullanır.
        //hh kullandığınızda AM veya PM demelisiniz bunu demek için "a" yazmanız yeterlidir. yani; "hh:mm a"

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("hh-mm a");//09-42 ös şimdiki saatin formatını değiştirdim
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");//09:49:30 ÖS

        System.out.println(dtf.format(myTime));
    }
}
