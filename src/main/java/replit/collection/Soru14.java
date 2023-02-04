package replit.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Soru14 {
    /*
    Bir TreeSet yapalım ve elemanlarını önce normal yazdıralım ve ardından
    descendingIterator()  fonksiyonunu kullanarak ters sıradan yazdıralım.
    TreeSet elemanları:  yesil,sari,mavi,turuncu,kirmizi
    Beklenen Çıktı:
    Orjinal Tree sonucu: [kirmizi,mavi,sari,turuncu,yesil]
    Tersten Siralanisi:
    yesil
    turuncu
    sari
    mavi
    kirmizi

     */
    public static void main(String[] args) {
        TreeSet <String>colours= new TreeSet<>();
        colours.add("yesil");
        colours.add("sari");
        colours.add("mavi");
        colours.add("turuncu");
        colours.add("kirmizi");
        System.out.println("Orjinal Tree sonucu : "+colours);
        Iterator<String> reversed=colours.descendingIterator();
        while(reversed.hasNext()){
            System.out.println(reversed.next());
        }
    }
}
