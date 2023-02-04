package replit.collection;

import java.util.ArrayList;
import java.util.List;

public class Soru04 {

    /*
    Bir ArrayList oluşturalım ve istenen sıradaki elemanı güncelleyelim.
    Array Elemanları: sari,yesil,mavi,pembe
    **mavi rengini turuncu ile değiştirelim.**
    Beklenen Çıktı:[sari,yesil,mavi,pembe]
    [sari,yesil,turuncu,pembe]
     */
    public static void main(String[] args) {
        List<String > list= new ArrayList<>();
        list.add("sari");
        list.add("yesil");
        list.add("mavi");
        list.add("pembe");
        System.out.println();
        list.set(2,"turuncu");
        System.out.println(list);
    }

}

