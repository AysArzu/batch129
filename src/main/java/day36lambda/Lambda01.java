package day36lambda;

import java.util.*;
import java.util.stream.Stream;


public class Lambda01 {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>(Arrays.asList("suleyman", "Ebubekir", "Ayse", "Ada", "Okan", "Semih",
                "Gulsen", "Ali", "Zeynep", "Semih", "Bilal", "Abdullah", "Abdulkadir"));
/*
allMatch() Mukemmeliyetcidir. butun elemanlar true dondururse sonuc true doner.
Bir eleman false olsa sonuc false dondurur.
anyMatch() En az bir eleman true dondururse sonucu true dondurur.
noneMatch() hicbir eleman sarti saglamazsa true dondurur. bir tanesi saglasa false dondurur.
 */
        alfBykTkrsz(isimler);
        System.out.println();
        chrctrTrsTkrarsz(isimler);
        System.out.println();
        chrktrKckByk(isimler);
        System.out.println();
        krktrSysBykYedi(isimler);
        System.out.println();
        wIleBaslamasi(isimler);
        System.out.println();
        xIleBitmesi(isimler);
        System.out.println();
        krktrSysEnBykElmn(isimler);
        System.out.println();
        sonHrfnGrSrlIlkElmnHrcKlnElmnlr(isimler);
        System.out.println();
        krktrSysCftElmnSylrnnKrsi(isimler);
    }//main

    //Yazdir methodu
    public static void yazdir(String a) {

    }

    // Task -1 : List elemanlarini alfabetik buyuk harf ve  tekrarsiz print ediniz.
    public static void alfBykTkrsz(List<String> isimler) {
        isimler.stream().
                distinct().
                map(String::toUpperCase).
                sorted().forEach(t -> System.out.print(t + " "));
    }

    // Task -2 : list elemanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void chrctrTrsTkrarsz(List<String> isimler) {

        isimler.stream().//akisa alindi
                map(String::length).//karakterin uzunlugunu aldik
                distinct().//tekrarsiz yapildi
                sorted(Comparator.reverseOrder()).//ters sirali
                forEach(t -> System.out.print(t + " "));
    }

    // Task-3 : List elemanlarini, character sayisina gore kckten byk e gore print ediniz..
    public static void chrktrKckByk(List<String> isimler) {

        isimler.stream().
                sorted(Comparator.comparing(String::length)).
                forEach(t -> System.out.print(t + " "));
    }
    // Task-4 : List elemanlarinin hepsinin karakter sayisinin 7 ve 7 'den az olma durumunu kontrol ediniz.

    public static void krktrSysBykYedi(List<String> isimler) {
        System.out.println(isimler.stream().
                allMatch(t -> t.length() <= 7) ?"LIst elemanlari 7 ve 7 den daha az harften olusuyor":
                "List elemanlari 7 harften buyuk");

    }  // Task-5 : List elemanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
public static void wIleBaslamasi(List<String >isimler){

    System.out.println(isimler.stream().
            noneMatch(t->t.startsWith("w"))?"w ile baslayan isim bizde yok":"w ile baslayan isimler");
}
// Task-6 : List elemanlarinin "x" ile biten en az bir elemanı var mı kontrol ediniz.

    public static void xIleBitmesi(List<String >isimler) {

        System.out.println(isimler.stream().
                anyMatch(t -> t.endsWith("x")) ? "x ile biten isimler var " : "x ile biten isim yok ");

    }  // Task-7 : Karakter sayisi en buyuk elemani yazdiriniz.
public static void krktrSysEnBykElmn(List<String >isimler){

     Stream<String >sonIsim= isimler.
             stream().                     // listedeki sirayi alir index yok!!!
             sorted(Comparator.comparing(t->t.toString().length()).
                     reversed()).
             limit(2);//icine hangi rakami yazarsak o kadar data getirir Stream<String> classindan gelir.
    System.out.println(Arrays.toString(sonIsim.toArray()));//sonIsim.toArray() stream olan akisi array e cevirdim
    //Arrays.toString(sonIsim.toArray()) ==>Array i Stringe cevirdik
    //son isim Stream olduğu için önce arraye sonra yazdırabilmek için Stringe çevirdik
    // kac tane yazacaksak limite o rakami yaziyoruz. en uzun listeden ilk 2 yi yazdirdi
}

    // Task-8 : list elemanlarini son harfine göre siralayıp ilk
    // eleman hariç kalan elemanlari print ediniz.

public static void sonHrfnGrSrlIlkElmnHrcKlnElmnlr(List<String >isimler){
isimler.stream().
        sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
        skip(1).forEach(t->System.out.print(t+" "));
}


    // Task-9 : Karakter sayilari cift olan elemanlarin karakter sayilarinin karelerini hesaplayan;
    // tekrarli olanlari sadece bir kere buyukten kucuge  yazdiran programi yaziniz
public static void krktrSysCftElmnSylrnnKrsi(List <String >isimler){

        isimler.stream().

                filter(t->t.length()%2==0).
                map(t->t.length()*t.length()).
                distinct().// karelerinden ayni rakam  var mi diye onlari sildik
                sorted(Comparator.reverseOrder()).
                forEach(t-> System.out.print(t+" "));

}

}
