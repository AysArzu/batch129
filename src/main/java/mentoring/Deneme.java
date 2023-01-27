package mentoring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
/* Verilen bir listede istenen iki indexdeki elementlerin yerini kalici olarak degistiren
 bir method olusturun { {1,2,3,4,5, 6 } */
    listedeYerDegistir();
}
    public static String  listedeYerDegistir(){
        Scanner in=new Scanner(System.in);
        System.out.println("lutfen degistirmek istediginiz ilk indeksin numarasini girin");
        int ilk=in.nextInt();
        System.out.println("lutfen degistirmek istediginiz ikinci indeksin numarasini girin");
        int iki=in.nextInt();
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        int a=list.get(ilk);
        System.out.println(ilk+" indeksi degeri " +a);
        int b=list.get(iki);
        System.out.println(iki+" indeksi degeri " +b);
        System.out.print("Degistirilecek liste= "+list+"-");
        System.out.println();
        for (int i = 1; i < list.size(); i++) {
            if (i==ilk){
                list.remove(ilk);
                list.add(iki , a);
                if (i==iki) {
                    list.remove(iki);
                    list.add(ilk,  b);
                }
            }
        }
        System.out.println("Degisen liste= "+list+"-");

        return list.toString();
}}
