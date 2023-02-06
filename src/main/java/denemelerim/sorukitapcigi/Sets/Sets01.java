package denemelerim.sorukitapcigi.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sets01 {
    /*
      Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
      Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
     */
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        System.out.println(myList.size());
        HashSet<Integer>mySet= new HashSet<>(myList);
        System.out.println(mySet.size()+ " Farkli oge vardir ");

    }
}
