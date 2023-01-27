package day18List;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

        //Names.containsAll() öethodu "names" Listindeki "females" listinedki "tüm elemanların" var olup olmadığını kontrol eder
        //Tamamı varsa size "true" verir, herhangi bir yoksa size false verir.
        boolean r = names.containsAll(females);//false

        // names.subList() "names"listindeki indexi 1, 2, 3 olan elemanları bir listin içinde size verir
        // İkinci index olan 4, dahil olmaz
        List<String> subList = names.subList(1, 3);
        System.out.println(subList);//[Cuneyt, Mahsun]


        //retainsAll() methodu ortak olan eleman haricindeki herşeyi siler
        names.retainAll(females);
        System.out.println(names);//[Ajda]

        //Example: Elektronik aletler ve ev aleteri listemiz var
        //          Elektronik ev aletlerini listeleyiniz.


        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Notebook");
        electronics.add("Mobile Phone");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        //homeGoods.retainAll(electronic) homeGoods ile electronics List'lerin ortak elemanlarını homeGoods List'i içinde verir.
        //Başka deyişle (In other words) homeGoods Listindeki ortak olmayan elemanları siler.
        homeGoods.retainAll(electronics);
        System.out.println(homeGoods);//[Radio, TV]

        // isEmpty() Lİstte hiç eleman yoksa size "true" verir 1 veya daha fazla eleman varsa size false verir
        //"isEmpty() esasında "names.size==0" ile aynı manaya gelir ama 2 method var uzun iş
        names.isEmpty();

        System.out.println("names.hashCode() = " + names.hashCode());//names.hashCode() = 2041509
        // javanın sisteme names i kaydederkenki kullandığı adresi verir.!!!!
    }
}
