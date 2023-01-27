package advancepractice.javapractice.nighttime07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisveris {/*
 * Basit bir online alisveris programi yaziniz.
 *
 * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
 * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
 *           istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
 *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
 * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
 * 4. Adim : Alisveris bitince online sitenin kurulusGunu ise ucret alma;
 *   degilse toplam odemesi gereken tutari goster.

 * */
    static List<String> urunListesi = new ArrayList<>();
    static List<Double> urunFiyatlari = new ArrayList<>();
    static double toplamOdeme;
    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        urunListesi.add("ayakkabi : urun kodu :1 ");
        urunListesi.add("canta : urun kodu :2 ");
        urunListesi.add("saat : urun kodu :3");
        urunListesi.add("bilezik : urun kodu :4 ");
        urunListesi.add("toka : urun kodu :5 ");


        urunFiyatlari.add(10.0);
        urunFiyatlari.add(20.0);
        urunFiyatlari.add(30.0);
        urunFiyatlari.add(15.0);
        urunFiyatlari.add(60.0);
        System.out.println("urunListesi = " + urunListesi);

        musteriSecim();
    }

    private static void musteriSecim() {
        System.out.println("Lütfen seçtiğiniz ürünün kodunu giriniz");
        int secim = input.nextByte();
        System.out.println("Seçtiğiniz üründen kaç adet alacaksınız?");
        int adet = input.nextInt();

        double urunTutari = adet * urunFiyatlari.get(secim - 1);//get methodu indexle çalışır
        toplamOdeme += urunTutari;
        System.out.println("Alışverişe devam ise 1 e basınız\nÖdeme için 2 ya basınız.");
        int devamMi = input.nextInt();
        if (devamMi == 1) {
            //method içinden methoda göndermeye "recursive method" denir!!!!
            musteriSecim();
        } else
            odemeMethodu();
    }

    private static void odemeMethodu() {
        LocalDate kurulusGunu = LocalDate.of(2023, 01, 11);
        LocalDate date = LocalDate.now();
        if(date.equals(kurulusGunu)){
            System.out.println("Bugün bizim açılış yıl dönümümüz. borcunuz yoktur");
        } else{
            System.out.println("Yine bekleriz System.out.println(\"Yine bekleriz Odemeniz gereken tutar : \"+toplamOdeme+\"$\"");
        }

    }


}
