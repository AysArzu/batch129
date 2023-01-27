package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {
/*"Set" demek tekrarsiz data depolamak icin kullanilan bir Collection'dir.
Set tekrar kabul etmez. Yani; tekrarsiz veriler için kullanılır.*/

        //LinkedHashSet olusturma
        LinkedHashSet<String > artist=new LinkedHashSet<>();

        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Tom");
        artist.add("Brad");
        artist.add("Angelina");
        System.out.println(artist);//[Ajda, Tom, Brad, Angelina] iki tom olmasina ragmen 1 tane yazdi!!!

//'Set' ler tekrarsiz eleman icerirler.Siz ayni elemani tekrar tekrar eklerseniz Java hata vermez
// ama tekrarli eklenen elelmani "Set"e sadece 1 kere koyar.

        LinkedHashSet<String>actress=new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist);

        artist.remove("Tom");// Tom u siler
     //   artist.retainAll(); iki listeden ortak olani silip kalani verir.
    }
}
