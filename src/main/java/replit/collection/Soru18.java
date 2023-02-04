package replit.collection;

import java.util.PriorityQueue;

public class Soru18 {
    /*
    Bir Priority Queue  oluşturalım, elemanlarını ekleyim priority queue yazdıralım.

priority queue elemanları: sari,yesil,mavi,kirmizi

Beklenen Çıktı:

Priority Queue elemanlari: [kirmizi, mavi, sari, yesil]
     */
    public static void main(String[] args) {
        PriorityQueue<String>pq= new PriorityQueue<>();
        pq.add("sari");
        pq.add("yesil");
        pq.add("mavi");
        pq.add("kirmizi");
        System.out.println("Priority Queue elemanlari: "+ pq);
    }
}
