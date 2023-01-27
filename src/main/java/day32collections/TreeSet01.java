package day32collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {
        // tekrarsiz elelmanlari natural order a gore siralar

        long one = System.nanoTime();
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);//[3, 8, 12, 25, 32]
        long two = System.nanoTime();
        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println(hs);//Random rastgele [32, 3, 8, 25, 12]
        long three = System.nanoTime();
        System.out.println("TreeSet in uygulama suresi :" + (two - one));//TreeSet in uygulama suresi :4451600
        System.out.println("HashSet in uygulama suresi :" + (three - two));//HashSet in uygulama suresi :203900
        //NOTE: TreeSet Eleman eklemede cok yavas  HashSet ise cok hizlidir.
        // TreeSet"in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler
        // sonra HashSet'i TreeSet'e ceviririz.

        int first = ts.first();
        System.out.println(first);//3 ilk eleman

        int last = ts.first();
        System.out.println(last);//32 son eleman

        int floor1 = ts.floor(15);
        System.out.println(floor1);//12 ==> 15 elemanlardan biri degil o yuzden 15ten bir onceki eleman yazdirildi
        int floor2 = ts.floor(12);//12 ==> 12 elemanlardan biri o yuzden 12 direk yazildi
        System.out.println(floor2);

        //  int floor=  ts.floor(2);//floor() method'unda kullanabileceginiz sayi en kucuk elemandan az olamaz hata firlatir
        //  System.out.println(floor);

        int ceiling1 = ts.ceiling(15);//25==> 15 elemanlardan biri degil o yuzden 15ten bir sonraki eleman yazdirildi
        System.out.println(ceiling1);
        int ceiling2 = ts.ceiling(25);//25 ==> elemanlardan biri o yuzden 25 direk yazildi
        System.out.println(ceiling2);
        //ceiling() method'unda kullanabileceginiz sayi en buyuk elemandan daha fazla olamaz hata firlatir


        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println(tailSet1);//[12, 25, 32]  ==> 12 elemanlardan biri degil o yuzden 12 ve sonraki elemanklar set icinde  yazdirildi
        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println(tailSet2);//[25, 32] 15 elemanlardan biri degil ondan sonrakileri yazdirdi


        NavigableSet<Integer> tailSet3 = ts.tailSet(12, false);// 12 olsa da yazdirma demek
        System.out.println(tailSet3);//[25, 32] 12 elemanlardan biri normalde 12 ve sonraki elemanlar bir Set icinde yazdirilirdi
        //ama ben ikinci parametrelerde false kulladigim icin 12 haric tutuldu.

//Generic Method: Normal methodlar parametrelerde belirtilen data type'lari ile calisirlar.
        //Generic Method'lar ise verilen her turlu data type ile calisma becerisine sahiptirler.
        SortedSet<Integer> headSet1 = ts.headSet(12);
        System.out.println("headSet1 = " + headSet1);//headSet1 = [3, 8] 12 elemanlardan biri ondeki elemanlar bir set icinde yazdirildi. 12 yazdirilmadi.

        SortedSet<Integer> headSet2 = ts.headSet(12, true);
        System.out.println("headSet2 = " + headSet2);//headSet2 = [3, 8, 12]

        int higher1 = ts.higher(12);//12 den bir sonraki elemani verir
        System.out.println("higher 1= " + higher1);//higher = 25


      int lower= ts.lower(12);
        System.out.println("lower = " + lower);//8==> 12den bir onceki elemani verir.


    }
}