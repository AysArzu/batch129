package replit.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Soru07 {
    /*
         bir LinkedList oluşturalım ve Iterator methodunu kullanarak
         listedeki elemanlardan istenilen pozisyondan başlayarak listeyi yazdıralım.
        LinkedList elemanlari: sari,beyaz,mavi,yesil,turuncu
        1. elemandan itibaren yazdıralım.
         Beklenen Çıktı:beyaz
                        mavi
                        yesil
                        turuncu


     */
    public static void main(String[] args) {
        LinkedList<String>renkler= new LinkedList<>();
        renkler.add("sari");
        renkler.add("beyaz");
        renkler.add("mavi");
        renkler.add("yesil");
        renkler.add("turuncu");

        ListIterator<String> iterator = renkler.listIterator(1);
        System.out.println("LinkedList Elemanları:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
