package replit.collection;

import java.util.TreeSet;

public class Soru17 {
    public static void main(String[] args) {
        /*
               Ortak elemanları olan 2 farklı TreeSet oluşturalım ve
               elemanlarını tektek karşılaştırıp aynı olanlar için "yes"  farklı olanlar için "no" yazdıralım.

            1. TreeSet: mavi,yesil,kirmizi,sari
            2. TreeSet: yesil,mavi,pembe,turuncu
            Beklenen Çıktı:
            1. TreeSet: [kirmizi,mavi,sari,yesil]
            2. TreeSet: [mavi,pembe,turuncu,yesil
            Karsilastirma Sonucu:
            no
            yes
            no
            yes
         */
        TreeSet <String>tree1= new TreeSet<>();
        tree1.add("sari");
        tree1.add("mavi");
        tree1.add("yesil");
        tree1.add("kirmizi");
        System.out.println("1. TreeSet: "+tree1);
        TreeSet<String >tree2=new TreeSet<>();
        tree2.add("mavi");
        tree2.add("yesil");
        tree2.add("turuncu");
        tree2.add("pembe");
        System.out.println("2. TreeSet: "+tree2);

        System.out.println("Karsilastirma Sonucu:");
        for(String w:tree1){
            System.out.println(tree2.contains(w)? "yes":"no");
        }
    }
}
