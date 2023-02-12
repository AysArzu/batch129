package day34mapiterators;

import java.util.HashMap;

public class HashMapMechanism {
    public static void main(String[] args) {
        /*
        1)Siz HashMap olusturmak icin  HashMap<String,Integer> hm=new HashMap<>(); " kodunu yazdiginizda Java
        16 tane bucket(kova) olusturur ve bu bucket leri 0 dan 15 e kadar indexler
        2) Siz entry eklemek icin hm.put("Istanbul",17000000); yazdiginizda Java;
        i) "key" icin "hashCode" uretir
        ii) "hashCode" u 16 ya boler
        iii) kalani index olarak kullanip indexi kalana esit olan bucket'a bu "entry" e yerlestirir
        iv)Bucket a "entry" eklenirken  Java o bucketin icinde "LinkedList" yapisini kullanir
        LinkedList'te node"lar vardi. map yapisina giren her node 4 bolumden olusur.i)HashCode ii)Key iii)Value iv)Pointer
        Her HashCode unique tir bazen Java kazara ayni hashCode u verir buna hashcode collision denir(hashcode kazasi)
         */

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Istanbul",17000000);
        hm.put("Miami",5000000);
        hm.put("Moscow",1800000);
        hm.put("New Delhi",31000000);

        System.out.println(hm);//{New Delhi=31000000, Istanbul=17000000, Moscow=1800000, Miami=5000000}

//hashmapler her bir index icin linkedlist kullanir. Bunun da StringBuilder gibi 16 kutusu var her kutucuga Bucket denir.
// linkedlistte bulmak zordu yan yana gidiyordu bu 16 ya boler ve ona gore kalan sayiyi index yapar ustuste gelince linked list gibi yan yana ekler
    }
}
