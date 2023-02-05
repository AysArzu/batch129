import day37lambda.Utilities;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));
        ciftVePozitif(sayi);
        System.out.println();
        ciftVeNegatifMethodReference(sayi);
        System.out.println();
        kareleriBosluklaYazdir( sayi);
        System.out.println();
        kareleritekrarsizYazdir(sayi);
        System.out.println();
        buyuktenKucugeSirala(sayi);
        System.out.println();
        pozitifKupununBirlerBasamagi5Olani(sayi);
        System.out.println();
        System.out.println(elemanlariTopla(sayi));
        elemanlariToplaLambdaExp(sayi);
        System.out.println(pozitifElemanlariCarp(sayi));
        System.out.println(ciftElemanlarinKarewleriniKUcuktenBuyugeSirala(sayi));
    }//SORU1: List elemanlarının çift ve pozitif olanlarını,

    // Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVePozitif(List<Integer> sayi) {

        sayi.stream().filter(t -> t > 0 && t % 2 == 0).forEach(t -> System.out.print(t + " "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    // Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVeNegatifMethodReference(List<Integer> sayi) {
        sayi.stream().filter(Utilities::negatifMi).filter(Utilities::ciftMi).forEach(Utilities::yazInt);
    }//SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void kareleriBosluklaYazdir(List<Integer> sayi){
        sayi.stream().map(t->t*t).forEach(Utilities::yazInt);
    }
    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareleritekrarsizYazdir(List<Integer> sayi){
        sayi.stream().distinct().map(Utilities::karesiniBul).forEach(Utilities::yazInt);

    }//SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyuktenKucugeSirala(List<Integer>sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utilities::yazInt);
    }
    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupununBirlerBasamagi5Olani(List<Integer>sayi){
        sayi.stream().
                filter(Utilities::pozitifMi).
                filter(t->t%10==5).
                map(Utilities::kupunuBul).
                forEach(Utilities::yazInt);
    }// SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static Optional<Integer> elemanlariTopla(List<Integer>sayi){
      return sayi.stream().reduce(Utilities::toplam);
      //reduce methodu terminal methoddur ondan sonra hicbir method kullanilmaz!!!
        //findFirst(), foreach()  terminal methoda ornektir

    }// SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void elemanlariToplaLambdaExp(List<Integer>sayi){
        System.out.println(sayi.stream().reduce(0, (t, u) -> t + u));
        //identity e 0 atadik o yuzden optionelInteger yapmadik
        /** t değişkeni ilk elemanı identity den alır sonraki değerlerini toplamdan
         u ise her zaman streamden(akıştan) alır.
         */
    }//SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın
    public static int pozitifElemanlariCarp(List<Integer>sayi){

       int carpim= sayi.stream().filter(t->t>0).reduce(1,(t,u)->t*u);
       return carpim;
    }
    //SORU10 : Listin cift elemanlarının, karelerini, kucukten buyuge sıralayıp list halinde return ederek yazdırınız
    public static List<Integer> ciftElemanlarinKarewleriniKUcuktenBuyugeSirala(List<Integer>sayi){
    List<Integer>sonuc=  sayi.stream().filter(Utilities::ciftMi).
                map(Utilities::karesiniBul).sorted().
                collect(Collectors.toList());
    return sonuc;
    }/** collectors.toList() liste cevirir!!!*/
}
