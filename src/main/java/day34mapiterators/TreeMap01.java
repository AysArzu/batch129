package day34mapiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
/*
1)"TreeMap" entry'leri "key"lere gore natural order"a koyar.
2)"TreeMap " coook yavastir. cunku "natural order" yapmak coook zaman ister.
3)"TreeMap "thread-safe" ve "synchronized" degildir.
4)"TreeMap"lerin "key"lerinde null kullanilamaz ama value"larda istediginiz kadar kullanabilirsiniz.

 */
        long one=System.nanoTime();
        TreeMap<String, Integer>stdAge1= new TreeMap<>();
        stdAge1.put("Murat",22);
        stdAge1.put("Ali",21);
        stdAge1.put("Ayse",25);
        stdAge1.put("Kemal",19);

        //Keylere goer alfabetik sira yapti.
        System.out.println("stdAge = " + stdAge1);//stdAge = {Ali=21, Ayse=25, Kemal=19, Murat=22}

        long two=System.nanoTime();
        HashMap<String, Integer> stdAge2= new HashMap<>();
        stdAge2.put("Murat",22);
        stdAge2.put("Ali",21);
        stdAge2.put("Ayse",25);
        stdAge2.put("Kemal",19);
        System.out.println("stdAge2 = " + stdAge2);

        long three=System.nanoTime();
        System.out.println("HashMap = " + (three - two));
        System.out.println("Treemap = " + (two -one));

        HashMap<String, Integer> stdAge3= new HashMap<>();
        stdAge3.put("Murat",22);
        stdAge3.put("Ali",21);
        stdAge3.put("Ayse",25);
        stdAge3.put("Kemal",19);
        TreeMap<String ,Integer>stdAges=new TreeMap<>(stdAge3);
        long four=System.nanoTime();
        System.out.println("Treemap2 = " + (four-three));//HashMap = 1067800 Treemap = 56778500 Treemap2 = 18777300


    }
}
