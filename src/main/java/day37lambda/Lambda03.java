package day37lambda;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda03 {//Method Referance ile

    public static void main(String[] args) {
        List<Integer> sayilar = Arrays.asList(-2, -8, -5, 0, 2, 5, 6, 7, 15, 6, 8);
        tekSayilariAralarindaBosluklaYazdir(sayilar);//-5 5 7 15
        System.out.println("ciftSayilarinCarpimi= " + ciftSayilarinCarpimi(sayilar));//0
        NegatifSayilarinKarelerininToplami(sayilar);//93
        pozitlerinKupununMaxi(sayilar);//3375


    }//main

    // S1: Tek sayilari aralarinda bir bosluk birakarak yazdiralim
    public static void tekSayilariAralarindaBosluklaYazdir(List<Integer> sayilar) {

        sayilar.stream().
                filter(Utilities::tekMi).
                forEach(Utilities::yazInt);
    }
    // S2: ciftlerin carpimini bulalim

    public static Optional<Integer> ciftSayilarinCarpimi(List<Integer> sayilar){

        return sayilar.stream().
                filter(Utilities::ciftMi).
                reduce(Utilities::carpim);
    }


// S3: negatiflerin kare toplamlarini  bulalim

    public static void NegatifSayilarinKarelerininToplami(List<Integer> sayilar){

        System.out.println(sayilar.stream().
                filter(Utilities::negatifMi).
                map(Utilities::karesiniBul).
                reduce(Utilities::toplam));
    }

// S4: poziflerin kuplerinden max olani yazdiralim

    public static void pozitlerinKupununMaxi(List<Integer>sayilar){
        System.out.println(sayilar.
                stream().
                filter(Utilities::pozitifMi).
                map(Utilities::kupunuBul).
                mapToInt(t -> t).
                max());
    }





}
