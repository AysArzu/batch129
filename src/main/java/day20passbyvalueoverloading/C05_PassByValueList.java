package day20passbyvalueoverloading;

import java.util.ArrayList;
import java.util.List;

public class C05_PassByValueList {
  /*
       bir list oluşturalım.
       sonra list elemanlarını degiştir methodu yazıp orada
       list elemanlarından bazılarını degiştirelim.
       method void olsun.
       main methoda döndükten sonra yeniden listi yazdıralım
       */

    public static void main(String[] args) {

        List<String> harfler= new ArrayList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("D");

        listElemanlariniDegistir(harfler);
        System.out.println("main içinde methoddan sonra harfler "+harfler);//main içinde methoddan sonra [R, B, C, D]
        // listemizde içindeki elemanlardan bir ya da birkaçını değiştirdiğimizde
        // listeyi değiştirmiş olmuyoruz Pass By Value Array ve Listlerde de aynen geçerlidir.
        // Ama listenin kendisini değiştirmiş olmuyoruz.

       harfler= listDegistir(harfler);
        System.out.println("main içinde methoddan sonra  harfler = " + harfler);// []
    }

    private static List<String> listDegistir(List<String> harfler) {
        harfler=new ArrayList<>();
        System.out.println("yeni liste harfler = " + harfler);//[]
        return harfler;

    }

    private static void listElemanlariniDegistir(List<String> harfler) {
        harfler.set(0,"R");
        System.out.println("Method içindeki harfler = " + harfler);//Method içindeki harfler = [R, B, C, D]


    }
}
