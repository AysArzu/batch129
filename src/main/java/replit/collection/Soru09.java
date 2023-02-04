package replit.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Soru09 {
    /*
Bir LinkedList oluşturalım ve Iterator yöntemi ile tersten yazdıralım.

LinkedList elemanları: sari,mavi,yesil,kirmizi,beyaz,mor

Beklenen Çıktı:
Orijinal linked list: [sari,mavi,yesil,kirmizi,beyaz,mor]
LinkedList Tersi:
mor
beyaz
kirmizi
yesil
mavi
sari
*/
    public static void main(String[] args) {
        LinkedList<String> renkler = new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("mor");

        ListIterator<String> reversed = renkler.listIterator(renkler.size());
        while (reversed.hasPrevious()) {
            System.out.println(reversed.previous());
        }

    }

}

