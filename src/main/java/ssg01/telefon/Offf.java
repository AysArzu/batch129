package ssg01.telefon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Offf {

    //İki tarih arasındaki farkı bulan metod
    static void tarihFarki(String start_date, String end_date)
    {
        // SimpleDateFormat
        SimpleDateFormat simpleDateFormat
                = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");


        // Try Block
        try {

            Date d1 = simpleDateFormat.parse(start_date);
            Date d2 = simpleDateFormat.parse(end_date);

            // milisaniye cinsinden farkı hesaplama
            long zaman_farki  = d2.getTime() - d1.getTime();

            // Saniye dakika saat ve gün olarak hesaplama
            long saniye_farki = (zaman_farki / 1000)  % 60;

            long dakika_farki = (zaman_farki  / (1000 * 60)) % 60;

            long saat_farki   = (zaman_farki / (1000 * 60 * 60))  % 24;

            long yil_farki    = (zaman_farki  / (1000l * 60 * 60 * 24 * 365));

            long gun_farki    = (zaman_farki  / (1000 * 60 * 60 * 24))  % 365;

            // Tarihleri yazdırma

            System.out.print("Tarihler arasındaki farkı yazdırma ");

            System.out.println(
                    yil_farki
                            + " yıl, "
                            + gun_farki
                            + " gün, "
                            + saat_farki
                            + " saat, "
                            + dakika_farki
                            + " dakika, ");

        }
        // Catch Exception
        catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        // Başlangıç
        String t1
                = "10-06-2020 01:10:20";

        // Bitiş
        String t2
                = "11-06-2021 07:30:50";

        tarihFarki(t1, t2);
    }
    }
