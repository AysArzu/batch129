package day36lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        Universite u1 = new Universite("hacettepe", "fizik", 1200, 88);
        Universite u2 = new Universite("bogazici", "qa", 1000, 90);
        Universite u3 = new Universite("odtu", "dev", 900, 95);
        Universite u4 = new Universite("marmara", "matematik", 3000, 82);
        Universite u5 = new Universite("ege", "elektrik-elektronik", 2000, 83);
        List<Universite> unv = new ArrayList<>(Arrays.asList(u1, u2, u3, u4, u5));

        System.out.println("notOrt75tenByk(unv) = " + notOrt75tenByk(unv));
        System.out.println("matematikBlmVarMi(unv) = " + matematikBlmVarMi(unv));

    }
    //Task 01: butun universitelerin not ortalamasi 75'ten buyuk oldugunu gosteren bir program olusturunuz.
    public static boolean notOrt75tenByk(List<Universite>unv){


        return unv.stream().allMatch(t->t.getNotOrtalamasi()>75);//biri azsa bile false doner hepsi buyukse true doner
    }
    //Task 02:Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.
public static boolean matematikBlmVarMi(List<Universite>unv){
       return /*unv.stream().
               anyMatch(t->t.getBolum().
                       toLowerCase().
                       contains("matematik"));*///true
    unv.stream().anyMatch(t->t.getBolum().equalsIgnoreCase("matematik"));//true
}
//ogrenci sayilarina gore buyukten kucuge siralayiniz
    public static void ogrSysnGrByktnKcg(List<Universite>unv){

        unv.stream().sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).forEach(t-> System.out.println(t+" "));
    }
}
