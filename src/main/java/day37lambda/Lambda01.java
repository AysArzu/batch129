package day37lambda;

import day36lambda.Universite;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        Universite u1 = new Universite("hacettepe", "fizik", 200, 88);
        Universite u2 = new Universite("bogazici", "qa", 1000, 90);
        Universite u3 = new Universite("odtu", "dev", 900, 95);
        Universite u4 = new Universite("marmara", "matematik", 3000, 60);
        Universite u5 = new Universite("ege", "elektrik-elektronik", 2000, 83);
        Universite u6 = new Universite("sutcu Imam", "matematik ogretmenligi", 147000, 60);
        Universite u7 = new Universite("karaelmas", "matematik", 350, 60);
        Universite u8 = new Universite("samsun", "matematik", 6000, 60);


        List<Universite> unv = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8));

        System.out.println("notOrt75tenByk(unv) = " + notOrt75tenByk(unv));
        System.out.println("matematikBlmVarMi(unv) = " + matematikBlmVarMi(unv));
        System.out.println("ogrSysnGrByktnKcg(unv) = " + ogrSysnGrByktnKcg(unv));
        System.out.println("matematik bolum sayisi : " + matBolumSayisi(unv));
        System.out.println("ogrncSylr550fzl = " + ogrncSylr550fzl( unv));
        System.out.println("ogrncSylr1050az = " + ogrncSylr1050az( unv));
    }

    //Task 01: butun universitelerin not ortalamasi 75'ten buyuk oldugunu gosteren bir program olusturunuz.
    public static boolean notOrt75tenByk(List<Universite> unv) {


        return unv.stream().allMatch(t -> t.getNotOrtalamasi() > 75);//biri azsa bile false doner hepsi buyukse true doner
    }

    //Task 02:Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.
    public static boolean matematikBlmVarMi(List<Universite> unv) {
        return /*unv.stream().
               anyMatch(t->t.getBolum().
                       toLowerCase().
                       contains("matematik"));*///true
                unv.stream().anyMatch(t -> t.getBolum().equalsIgnoreCase("matematik"));//true
    }

    //03ogrenci sayilarina gore buyukten kucuge siralayiniz
    public static List<Universite> ogrSysnGrByktnKcg(List<Universite> unv) {

        return unv.stream().
                sorted(Comparator.comparing(Universite::getOgrenciSayisi).//ogrenci sayisin al getir ve karsilastir
                        reversed()).
                collect(Collectors.toList()); //  collect ile stream yapisindaki datalar list haline getirildi


        //Task: "matematik bolumlerinin sayisini print ediniz
    }

    public static int matBolumSayisi(List<Universite> unv) {
        return (int) unv.stream().
                filter((t -> t.getBolum().equalsIgnoreCase("matematik"))).
                count();//sayma islemi yapar

    }

    //ogrenci sayisi 550 den az olan uni lerin en buyuk not ortalamasini bulunuz
    public static OptionalInt ogrncSylr550fzl(List<Universite> unv){
        return unv.
                stream().
                filter(t->t.getOgrenciSayisi()>550).
                mapToInt(t->t.getNotOrtalamasi()).//mapToInt ile degeri guncelledik
                max(); // max() methodundan null gelme ihimali wrapper classlarda var
        //OptionalInt return etmeni ister  OptionalInt[95]
    }
    //Task06:ogrenci satilari 1050 den az olan unilerin en kucuk not ortalamasini bulunuz
    public static OptionalInt ogrncSylr1050az(List<Universite> unv) {
        return unv.
                stream().
                filter(t -> t.getOgrenciSayisi() < 1050).
                mapToInt(t -> t.getNotOrtalamasi()).//mapToInt ile degeri guncelledik
                min();//= OptionalInt[60]

    }











}
