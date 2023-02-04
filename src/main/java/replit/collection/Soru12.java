package replit.collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Soru12 {
    /*
    Bir HashSet oluşturalım ve HashSet elemanlarını TreeSet e dönüştürelim. Tree Set elemanlarını tektek yazdıralım.
    HashSet elemanları: sari,mavi,yesil,turuncu,kirmizi
    Beklenen Çıktı:
    Tree Set Elemanlari:
    kirmizi
    mavi
    sari
    turuncu
    yesil

     */
    public static void main(String[] args) {
        HashSet<String >colour=new HashSet<>();
        colour.add("sari");
        colour.add("mavi");
        colour.add("yesil");
        colour.add("turuncu");
        colour.add("kirmizi");

        TreeSet<String >treeSet= new TreeSet<>(colour);
        System.out.println("Tree Set Elemanlari: ");
        for (String s : treeSet) {
            System.out.println(s);
        }





    }
}
