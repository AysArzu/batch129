package advancepractice.practice12;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q02_Map_FiyatToplamiEntryset {
    public static void main(String[] args) {
/*
    Bir map içerisinde verilen fiyatların toplamını bulan bir kod yazınız.(for each loop kullanınız)
    Örn: {Kemer=19.99, Gömlek=29.99, Ayakkabı=89.99, Kazak=24.99, Kravat=19.99} ==> Toplam: 184.95
    */
        HashMap<String, Double>urunlerFiyatlar = new HashMap<>();
        urunlerFiyatlar.put("Kemer", 19.99);
        urunlerFiyatlar.put("Ayakkabı", 89.99);
        urunlerFiyatlar.put("Kazak", 24.99);
        urunlerFiyatlar.put("Kravat", 19.99);
        urunlerFiyatlar.put("Gömlek",29.99);
        System.out.println(urunlerFiyatlar);
        System.out.println(fiyatToplami(urunlerFiyatlar));


    }public static double fiyatToplami( HashMap<String, Double> map){
        System.out.println("urunler ve fiyatlari: "+map);//urunler ve fiyatlari: {Kemer=19.99, Kazak=24.99, Kravat=19.99, Gömlek=29.99, Ayakkabı=89.99}
        System.out.println(map.entrySet());//[Kemer=19.99, Kazak=24.99, Kravat=19.99, Gömlek=29.99, Ayakkabı=89.99]
        Collection<Double> fiyatlar= map.values();
        System.out.println("fiyatlar = " + fiyatlar);

        double toplam=0;
       for(Map.Entry<String ,Double> w : map.entrySet()){

           toplam+=w.getValue();
       }

        return toplam;//184.95
    }
}
