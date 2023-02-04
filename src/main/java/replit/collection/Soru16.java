package replit.collection;

import java.util.TreeSet;

public class Soru16 {
    /*
                Bir TreeSet oluşturalım ve Tree Listesini ve
                listedeki eleman sayısını yazdıran java kodunu yazdıralım.
                TreeSet elemanları: yesil,sari,mavi,kirmizi,pembe
                Beklenen Çıktı:
                Orjinal TreeSet: [kirmizi,mavi,pembe,sari,yesil]
                Tree eleman sayısı: 5
     */
    public static void main(String[] args) {
        TreeSet<String >colours= new TreeSet<>();
        colours.add("yesil");
        colours.add("sari");
        colours.add("mavi");
        colours.add("kirmizi");
        colours.add("pembe");

        System.out.println("Orjinal TreeSet: "+colours);
        System.out.println("Tree eleman sayısı: "+ colours.size());

    }


}
