package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        System.out.println(cities);


        //remove() methodu index ile kullanırsa o index'teki elemanı siler
        //remove() methodu index ile kullanırsa size sildiği elemanı verir
      String n=  cities.remove(1);
        System.out.println(n);//Istanbul
        System.out.println(cities);//[Miami, Istanbul, Kayseri, Almaty]

        //remove() methodu eleman ile kullanılırsa ilk görünümü siler
        //remove() methodu eleman ile kullanılırsa size o elemanı silip silmediğini ifade eden
        //true veya false verir
        //Eğer eleman List'te var ise o elemanı siler ve size true der
        //Eğer eleman List'te yok ise o elemanı silemediğinden ve size false der.

        cities.remove("Kayseri");
        System.out.println(cities);
        boolean p=cities.remove("Kayseriyi");
        System.out.println(p);//false çünkü olmayan elemanı silemez 

    }
}
