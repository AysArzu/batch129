package advancepractice.practice12;

import java.util.Collection;
import java.util.HashMap;

public class Q02_Map_FiyatToplami {
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
        System.out.println("urunler ve fiyatlari: "+map);
        Collection<Double> fiyatlar= map.values();
        System.out.println("fiyatlar = " + fiyatlar);

        double toplam=0;
        for (Double w : fiyatlar) {
            toplam+=w;
        }

        return toplam;
    }
}
