package day34mapiterators;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {

        /**32. Session Java Hashtable TreeMap 1910   19.dk da kaldim  */
      /*1)HashTable "thread-safe" ve "synchronized"dir.
        2)HashTable entryleri rastgele siralar.
        3)"HashTable" lar "HashMap"lere gore daha yavastirlar
        4)HashTable" key"lerde ve" value"larda "null" kullanilmasina musaade etmezler.

        Note:i) "multi thread" ve synchronization kullanmaniz gerekirse ve
             ii)"key" ve" value"larda "null" kullanilmak  yasaksa; "HashTable" kullanmak gerekir.
         */

        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(1,2);//1 ve -1
        ht.put(2,4);//1,-1,2,-2 bolenleri
        ht.put(6,8);//1, -1, 2, -2, 3, -3, 6, -6
        System.out.println(ht);//{6=8, 2=4, 1=2}

        Enumeration<Integer> r= ht.elements();//hashcode gibi bir kod
        System.out.println(r);//java.util.Hashtable$Enumerator@6a5fc7f7





    }
}
