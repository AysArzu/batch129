package denemelerim.sorukitapcigi.Lists;

import java.util.ArrayList;
import java.util.List;

public class List11 {
    /*
    Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
    olup olmadığını kontrol ediniz.
     */
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(23);
        Integer counter = 0;
        for (Integer w:myList ) {
            for (Integer s:myList ) {
                if(w==s){
                    counter++;
                }
            }
        }if(counter==myList.size()){
            System.out.println("elemanlari tekrarsizdir");
        }else {
            System.out.println("En az bir oge tekrarlanmistir");
        }
    }
}
