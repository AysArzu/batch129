package replit.collection;

import java.util.Collections;
import java.util.LinkedList;

public class Soru10 {
    /*
    Bir LinkedList oluşturalım ve ilk eleman ile 4. elemanı yerdeğiştiren java kodunu yazınız.
    LinkedList: mavi,kirmizi,beyaz,siyah,yesil,turuncu
    **hint:  Collections.swap();**
    Beklenen Çıktı:
    Orjinal LinkedList: [mavi,kirmizi,beyaz,siyah,yesil,turuncu]
    Swap sonrası durum: [**siyah**,kirmizi,beyaz,**mavi**,yesil,turuncu]
     */
    public static void main(String[] args) {
        LinkedList<String> renkler = new LinkedList<>();

        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("beyaz");
        renkler.add("siyah");
        renkler.add("yesil");
        renkler.add("turuncu");
        Collections.swap(renkler,0,3);
        System.out.println("Swap sonrası durum: "+renkler);
    }
}

