package replit.collection;

import java.util.TreeSet;

public class Soru13 {
    /*
    Bir TreeSet oluşturalım ve tüm elemanlatını tektek yazdıralım.

TreeSet elemanları: yesil,mavi,kirmizi,sari,beyaz,siyah

Beklenen Çıktı:
beyaz
kirmizi
mavi
sari
siyah
yesil

     */
    public static void main(String[] args) {
        TreeSet<String>renkler=new TreeSet<>();
        renkler.add("yesil");
        renkler.add("mavi");
        renkler.add("kirmizi");
        renkler.add("sari");
        renkler.add("beyaz");
        renkler.add("siyah");
        for(String w:renkler){
            System.out.println(w);
        }
    }

}
