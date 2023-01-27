package practiceSule08.nighttime08.paractice07;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MiladiTakvim {
    /*
    yerel tarih ve zamana gore; gecerli tarih ve saat diliminde bir Miladi Takvim olustur
    mevcut yilin artik yil olup olmadigini yazdiriniz
     */
    public static void main(String[] args) {

        String aylar[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        GregorianCalendar miladiTakvim= new GregorianCalendar();
        System.out.print("Date = " );
        System.out.print( aylar[miladiTakvim.get(Calendar.MONTH)]);//enum sabit olan classlar
        System.out.print(" " +miladiTakvim.get(Calendar.DATE)+" ");
        int year;
        System.out.print(year=miladiTakvim.get(Calendar.YEAR) );


if(miladiTakvim.isLeapYear(year)){
    System.out.println("Bu yil artik yil");
}else System.out.println("Bu yil artik yil degil");

    }
}
