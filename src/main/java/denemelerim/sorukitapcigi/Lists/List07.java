package denemelerim.sorukitapcigi.Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List07 {
    /*
    Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
    Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
     */
    public static void main(String[] args) {
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);

        Collections.sort(h);

        int min = h.get(1) - h.get(0);
        for (int i = 1; i < h.size(); i++) {
            if (h.get(i) - h.get(i - 1) < min) {
                min = h.get(i) - h.get(i - 1);
            }
            if (h.get(i) - h.get(i - 1) == min)
                System.out.println(h.get(i) + " ile " + h.get(i - 1) + " farki minimumdur");

        }
    }
}
