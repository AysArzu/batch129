package denemelerim.sorukitapcigi.Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets05 {
    /*
    Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);

        Set<Integer> mySet= new HashSet<>(myList);
        if(mySet.size()==myList.size()){
            System.out.println("Tekrarlanan eleman yoktur");
        }else System.out.println("Tekrarlanan eleman vardir.");



    }
}
