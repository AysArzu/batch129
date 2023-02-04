package day37lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(9);
        list.add(13);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(15);
        System.out.print("tum cift sayilarin kupu :");
        ciftSayilarinKupunuAl(list);
        System.out.print("tum elemanlari topla : ");
        listedekiElemanlarinToplami(list);
        System.out.print(" listedekiTekElemanlarinCarpimi :");
        listedekiTekElemanlarinCarpimi( list);
        ucIleBolunenlerinIkiFazlasi( list);
        listtekiTekrarsizElemanlariYazdir(list);
    }//main

    //Tum cift sayi olan elemanlarin kuplerini ekrana yazdiriniz
    public static void ciftSayilarinKupunuAl(List<Integer> list) {
       /*
        list.stream().
                filter(t->t%2==0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));*/
        list.stream().
                filter(Utilities::ciftMi).
                map(Utilities::kupunuBul).
                forEach(Utilities::yazInt);
    }


    //list'deki tum elemanlarin toplamini ekrana yazdiriniz
    public static void listedekiElemanlarinToplami(List<Integer> list) {
        System.out.println(list.stream().

                reduce(Utilities::toplam));//  reduce(0,(t,u)->t+u)
    }

        //list'deki tum tek sayi olan elemanlarin carpimini ekrana yazdiriniz

    public static void listedekiTekElemanlarinCarpimi(List<Integer> list) {
        System.out.println(list.stream().filter(Utilities::tekMi).
                reduce(Utilities::carpim));//  reduce(0,(t,u)->t+u)
    }

        //list'deki 3 ile bolunebilen elemanlarin 2 fazlalarinin toplamini ekrana yazdiriniz
public static void ucIleBolunenlerinIkiFazlasi(List<Integer> list){

    System.out.println(list.stream().filter(Utilities::uceBolunebilme).map(t->t+2).reduce(Utilities::toplam));

}

        //list'deki elemanlari ekrana yazdiriniz ama tekrarli olanlari 1 kere yazdiriniz
    public static void listtekiTekrarsizElemanlariYazdir(List<Integer>list){

      list.stream().distinct().forEach(Utilities::yazInt);
    }



}
