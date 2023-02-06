package denemelerim.sorukitapcigi.Lists;

import java.util.ArrayList;
import java.util.List;

public class List06 {
    /*
    Listede 15 veya 13 varsa, bu elemanları kaldırınız.
    Örnek: (10, 31, 15, 13, 54) ==> Çıktı (10, 31, 54)
     */
    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);
        if (!h.contains(15) && !h.contains(13)) {
            System.out.println("Liste de 15 ve 13 elemanlari yok");
        } else {

            for (int i = 0; i <h.size() ; i++) {
                if(h.get(i)==15){
                    h.remove(h.get(i));
                    i--;
            } else if (h.get(i)==13) {
                    h.remove(h.get(i));
                    i--;
                }
            }
            System.out.println(h);

        }
    }
}
