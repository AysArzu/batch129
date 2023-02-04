package replit.collection;

import java.util.LinkedList;

public class Soru06 {
    /*
    Bir likedList oluşturalım ve tüm elemanlarını tek tek yazdıralım.
    LinkedList elemanları: sari,mavi,mor,yesil,beyaz
    Beklenen Çıktı:
    sari
    mavi
    mor
    yesil
    beyaz
     */
    public static void main(String[] args) {
        LinkedList<String > linkedList= new LinkedList<>();
        linkedList.add("sari");
        linkedList.add("mavi");
        linkedList.add("mor");
        linkedList.add("yesil");
        linkedList.add("beyaz");
        for (String s : linkedList) {
            System.out.println(s);
        }
    }
}
