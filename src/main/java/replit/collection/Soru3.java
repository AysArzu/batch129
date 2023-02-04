package replit.collection;

import java.util.ArrayList;
import java.util.List;

public class Soru3 {
    /*
    Bir ArrayList oluşturalım ve birinci ve üçüncü elemanlarını yazdıralım.

    ArrayList elemanları:  beyaz,siyah,sari,kirmizi,turuncu

    Beklenen Çıktı:Arrayin 1. elemani: beyaz
                   Arrayin 3. elemani: sari

     */
    public static void main(String[] args) {
        List<String>list= new ArrayList<>();

        list.add("beyaz");
        list.add("siyah");
        list.add("sari");
        list.add("kirmizi");
        list.add("turuncu");

        System.out.println("Arrayin 1. elemani:"+ list.get(0));
        System.out.println("Arrayin 3. elemani:"+ list.get(2));






    }

}
