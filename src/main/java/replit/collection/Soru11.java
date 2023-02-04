package replit.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Soru11 {
    /*
    HashSet ile list oluşturalım ve  TreeSet ile sıralayalım ve listeyi yazdıralım.
    HashSet List: sari,mavi,kirmizi,yesil,mor
    Beklenen Çıktı:
    TreeSet elements:
    kirmizi
    mavi
    mor
    sari
    yesil
     */
    public static void main(String[] args) {
        HashSet<String> colours= new HashSet<>();
        colours.add("kirmizi");
        colours.add("mavi");
        colours.add("mor");
        colours.add("sari");
        colours.add("yesil");
        System.out.println("HashSet List:"+ colours);
        TreeSet<String>sortedColour=new TreeSet<>(colours);
        System.out.println("TreeSet elements: ");
        for (String s : sortedColour) {
            System.out.println(s);
        }

    }
}
