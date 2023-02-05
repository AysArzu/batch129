import day37lambda.Utilities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt","nar",
                "mandalina","armut","elma","keciboynuzu","elma"));
        IlkHarfEVeyaCOlanlar(meyve);
        System.out.println();
        elemaninBasinaSonunaYildizEkle(meyve);
        System.out.println();
        System.out.println(karakterSayisinaGoreBuyuktenKucugeSiraliIlkUcEleman(meyve));
        System.out.println();







    }
    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım
    public static void IlkHarfEVeyaCOlanlar(List<String >meyve){
        meyve.stream().filter(t->t.startsWith("e")||t.startsWith("c")).forEach(Utilities::yazString);
    }
    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void elemaninBasinaSonunaYildizEkle(List<String >meyve){
        meyve.stream().map(t->"*"+t+"*").forEach(Utilities::yazString);
    }
    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
// karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> karakterSayisinaGoreBuyuktenKucugeSiraliIlkUcEleman(List<String >meyve){
    List<String>sonuc=    meyve.stream().
                sorted(Comparator.comparing(t->t.toString().length()).
                reversed()).
                limit(3).//ilk 3 elemani aldim
               collect(Collectors.toList());
    return sonuc;
    }
}
