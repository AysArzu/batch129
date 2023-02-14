package day34mapiterators;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Iterators01 {
    public static void main(String[] args) {
    /*
        Iterator'lar Loop'ların yaptığı işi yapar.
        Iteratorslar tıpkı loop'larda olduğu gibi elemanı alarak işleme sokar.
        Javanın Iterator'ları ortaya çıkarma sebebi infinit Loop riskini bitirmektirr.

        Iterator'larda sonsuz loop yoktur.
        Iterator'lar Java tarafından sonradan oluşturulmuşlardır.
        Loop'ların yaptıkları bütün işlemleri yapabilirler.
        Looplar ile iteratorlarin performans farki yoktur ama Iteratorlar eleman silme ve update etmede daha basarilidirlar
        eger bir collectionda eleman silme ve update islemi yapcaksan loop kullanmamaliyiz

        iki tip iterator var
        i) Iterator : Sadece elemanlari remove edebilirsiniz.
                      Sadece soldan saga calisir yani tek yonludur(for-each loop gibi.)
                      index yok

        ii)ListIterator : Eleman "remove etme", "update etme" ve "add" yapabilirsiniz
                          Hem sol'dan saga hem de sag'dan sola calisabilir yani cift yonludur
                          sadece listlerde kullanilir
         */


        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        Iterator<String> itr1 = list1.iterator();
        System.out.println(list1);//[Ali, Can, Aliye]
        while (itr1.hasNext()) {// sonrasinda eleman var mi demek

            itr1.next();//(eleman var mi)Ali yi verir, sonra Can gelir

            itr1.remove();//Kill Ali sonraki gelen Can i da siler

        }
        System.out.println(list1);//[]

//Example 1:
        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");

        ListIterator<String> listItr = list2.listIterator();
        while (listItr.hasNext()) {

            String el = listItr.next();
            listItr.set(el + "!");
        }
        System.out.println(list2);//[Ali!, Can!, Aliye!] list ikiye set ettik. eleman ekledik update ettik.
        // list ikinin uzerine yazar list ikiyi degistirir


//Example 2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        ListIterator<String> listItr2 = list3.listIterator();


        //Bu loop pointer'i en saga almak icin yazildi
        while (listItr2.hasNext()) {
            listItr2.next();//pointer i en sona goturduk
        }//Bu loop elemanlari sagdan sola kontrol ederek calisir
        while (listItr2.hasPrevious()) {
            String el = listItr2.previous();
            listItr2.set(el + "<===");

        // icine yazarsak tek tek yazdirir [Ali, Can, Aliye<===] gibi
        }
        System.out.println(list3);//[Ali<===, Can<===, Aliye<===] aliye ye <== isareti ekler sonra
        // solundakine sonra da onun solundakine gore devam eder

    }
}
