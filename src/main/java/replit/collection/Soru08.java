package replit.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class Soru08 {
    /*Bir LinkedList oluşturalım ve ilk ve son elemanlarını iterator özelliğini kullanarak yazdıralım
LinkedList: sari,mavi,turuncu,siyah,yesil,beyaz
Beklenen Çıktı:
Orjinal list elemanlari: [sari,mavi,turuncu,siyah,yesil,beyaz]
Listenin ilk elemani: sari
listenin son elemani: beyaz*/
    public static void main(String[] args) {
        LinkedList<String>renkler=new LinkedList<>();
        renkler.add("sari");
        renkler.add("mavi");
        renkler.add("turuncu");
        renkler.add("siyah");
        renkler.add("yesil");
        renkler.add("beyaz");
        System.out.println("Orjinal list elemanlari: "+renkler);

        ListIterator<String > iterator= renkler.listIterator();
        System.out.println("Listenin ilk elemani: "+renkler.getFirst());
        System.out.println("Listenin ilk elemani: "+renkler.getLast());


    }
}
