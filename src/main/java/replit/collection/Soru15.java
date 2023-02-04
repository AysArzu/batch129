package replit.collection;

import java.util.TreeSet;

public class Soru15 {
    /*
    Bir TreeSet oluşturalım ve ilk ve son elemanlarını yazdıralım.

TreeSet elemanları: sari,mavi,yesil,kirmizi,turuncu,pembe
Beklenen Çıktı:
Orjinal Tree: [kirmizi,mavi,pembe,sari,turuncu,yesil]
ilk elemen: kirmizi
son eleman: yesil
     */
    public static void main(String[] args) {

        TreeSet<String>colour=new TreeSet<>();
        colour.add("sari");
        colour.add("mavi");
        colour.add("yesil");
        colour.add("kirmizi");
        colour.add("turuncu");
        colour.add("pembe");
        System.out.println("Orjinal Tre: "+ colour);

        System.out.println(colour.first());
        System.out.println(colour.last());
        System.out.println(colour);
    }
}
