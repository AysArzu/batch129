package day31collections;

import java.util.HashSet;

public class  HashSet01 {
    public static void main(String[] args) {

/*
 1)"Hash" bir tekniktir, Java bu teknigi kullanarak unique (benzersiz) datalar uretir.
 2)"Set" tekrarsiz data depolamak icin kullanilan bir Collection'dir.
 3)Set tekrar kabul etmez. Yani; tekrarsiz verileri depolamak icin kullanilir.
"Set"ler 3 e ayrılır
i)HashSet: a) süper hızlıdır. çünkü HashSetler verdiğiniz elemanları sıralamak için zaman kaybetmez.
               yani HashSetlere eklenen elemanlar rastgele sıralanırlar.
           b)"HashSet"ler tekrarlı elemana müsaade etmezler.
           c)HashSet'ler sadece 1 tane null'ı eleman olarak kabul ederler.

 ii)LinkedHashSet: a) LinkedHashSet elemanları "insertion order"a göre dizer.(giriş sırasına göre)
                   b)LinkedHashSet elemanları sıralamakta zaman kaybettiği için HashSet'e göre yavaştır.
                   c)"LinkedHashSet"ler tekrarlı elemana müsaade etmezler.
iii)TreeSet:a)TreeSet elemanları "natural order"'a göre dizer.
            b)TreeSet "natural order" yaparken çok zaman harcar. O yüzden en yavaş "Set"'tir.
            c)"TreeSet"ler tekrarlı elemana müsaade etmezler.


 */

        HashSet<Integer>hs= new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs);//[5, 234, 12, 78] gördüğümüz gibi elemanlar rastgele sıralandı.

        int hc=hs.hashCode();
        System.out.println(hc);//329
    }
}
