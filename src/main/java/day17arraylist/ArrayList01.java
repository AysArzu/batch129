package day17arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList01 {

    /*
    1)Arraylistler çoklu data depolamak için kullanılırlar.
    2)ArrayList'ler non-primitive data type'ındeki çoklu dataları depolamak için kullanılır.
     List'ler "non-primiitive" data kabulederler,"Arrayler ise "primitive" data veya reference kabul eder
   3) ArrayList'leri oluştururken içine koyacağınız eleman sayısını başta soylemeye gerek yoktur.
     List'ler eleman sayısına "flexible"dırlar ama "Array"ler "flexible" değildirler
     4)Madem "Array"ler eleman sayısında flexible değil niçin java "Array"leri iptal etmedi
     i)Eleman sayısı belli olan data'ları depolamak için Array'ler tercih edilir
     ii)Array'ler çok hızlı çalışır
     iii)Array'ler memory'de az yer kaplar

     */
    public static void main(String[] args) {

        //List nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        //List'lere eleman nasıl eklenir?
        // List'e eleman eklemek için add() methodu kullanırız.
        //add() methodu elemanları sizin verdiğiniz sırada "List"e ekler.(Insertion Order
        ages.add(12);
        ages.add(9);
        ages.add(10);
        ages.add(1, 656);// index verilir indekse konulacak eleman yazılır
        ages.add(3, 777);
        ages.add(888);
        System.out.println(ages);//[12, 656, 9, 777, 10, 888]

        //List'e çoklu eleman nasıl eklenir? veya List'e baska bir List nasıl eklenir?
        //Bir "List" çoklu eleman eklemek , o elemanları önce bir List'in içine koymalısınız
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);
        ages.addAll(newAges);
        System.out.println(ages);//[12, 656, 9, 777, 10, 888, 8, 9, 10]

        ages.addAll(2, newAges);
        System.out.println(ages);//[12, 656, 8, 9, 10, 9, 777, 10, 888, 8, 9, 10]

        //Bir List'teki tum elemanları nasıl silebilirim?
           /* ages.clear();
            System.out.println(ages);//[]*/

//Bir elemanın List'te var olup olmadığını kontrol eder.
        boolean r = ages.contains(656);
        System.out.println(r);//true

        //Bir List'in başka bir listle aynı olup olmadığını nasıl kontrol eder?
        //İki List'in eşit olabilmesi için aynı index'te aynı elemanlar olmalıdır.
        ArrayList<String > names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");
        ArrayList<String > names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");
        boolean s=names1.equals(names2);
        System.out.println(s);//false

        //Verilen iki Integer listte tamamıyla aynı elemanların olup olmadığını
        // kontrol eden kodu yazınız.

        ArrayList<Integer > nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer > nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);
        Collections.sort(nums1);

        Collections.sort(nums2);

       boolean t= nums1.equals(nums2);
        System.out.println(t);//true
print(nums1);



    }public static void print(List<Integer> nums1){
        nums1.stream().forEach(t-> System.out.print(t+" "));
    }
}
