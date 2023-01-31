package day31collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

/*
1)Interface'lerden object oluşturulamaz çünkü interface'lerin constructorları yoktur.
2)Abstract classlardan object oluşturulamaz. Constructor'ları vardır ama constructor object oluşturmada kullanılamaz.
3)Interface'lerin constructorları olmadığından collection oluştururken interface isimleri "new" keywordundan sonra kullanılamaz.
4)*class--> class==> extends
 class--> interface==> implements
 *interface-->interface==> extends
 interface-->class==> bu mümkün değildir. class interfacenin parenti olamaz
5)Arraylistler eleman silme ve eleman eklemede başarısızdırlar.
Bu yüzden eleman silme ve ekleme işlemeleri çoklukla yapılacaksa arraylist kullanmak tavsiye edilmez.

//LINKEDLIST ==> Eleman silme-ekleme cok kolaydır. Index kullanmaz.
Note: ArrayLists'ler eleman ekleme ve eleman silme konusunda başarısızdırlar.
Bu yüzden yapılacak application'da fazlaca eleman eklenip çıkarılacaksa ArrayList kullanılması tavsiye edilmez.
Java Bu tarz işlemler için LinkedList'i oluşturmuştur.
LinkedList index kullanmadığı için eleman ekleme ve çıkarma işlemini oldukça kolay yapar.
Herbir eleman iki bölümden oluşur. birinci bölümde elemanın değeri vardır. ikinci bölümde pointer vardır bir sonraki elemanı gösterir.
6)Linkedlist'ler index kullanmadılarından eleman silmede ve eklemede re-index yapılmasına gerek yoktur.
Bu da LinkedList'leri eleman eklemede ve silmede çok başarılı hale getirir.
Bu yüzden eleman ekleme ve silmenin çok yapılması gereken durumlarda LinkedList kullanmak tavsiye edilir.
7)Arraylistlerde "search" işlemi kolay yapılır. çünkü indexler adres gibidir.
LinkedListteki en başına "head" denir.ilk elemanı gösterir. Son elemana "tail" denir, son eleman null gösterir.
8)LinkedListlerde  "search" işlemi zor yapılır çünkü LinkedListler index kullanmaz. index kullanmayınca herhangi
bir elemanı bulmak için en baştan bütün elemanlar kontrol edilir, bu da çok fazla iş demektir.
9) LinkedList'lerde eleman kelimesi kullanılmaz



 */

    public static void main(String[] args) {

        List<String> cityName = new LinkedList<>();
        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);//[Steve, Ajda, Raj, Megan, Brandon]
        names.addFirst("Ayşe");
        System.out.println(names);//[Ayşe, Steve, Ajda, Raj, Megan, Brandon]

        names.addLast("Ajda");//"addLast()" is equivalent to "add()"==> addlast ile add() aynıdır.
        System.out.println(names);//[Ayşe, Steve, Ajda, Raj, Megan, Brandon, Ajda]

        names.add(2, "Ebubekir");
        System.out.println(names);//[Ayşe, Steve, Ebubekir, Ajda, Raj, Megan, Brandon, Ajda]

        //names.clear(); LinkedList'teki tüm elemanları siliyor. Boş LinkedList kalıyor.
        // names.addAll(); ile başka bir linkedlist i ekliyoruz

        names.remove("Ajda");//ilk Ajda yı siler. ve loop u kırar. (cut+paste) ilk elemanı siler bize verir
        System.out.println(names);//[Ayşe, Steve, Ebubekir, Raj, Megan, Brandon,Ajda]

        names.remove(4);
        System.out.println(names);//[Ayşe, Steve, Ebubekir, Raj, Brandon, Ajda]

        names.add("Ayşe");
        System.out.println(names);//[Ayşe, Steve, Ebubekir, Raj, Brandon, Ajda, Ayşe]

        names.remove();//Retrieves and removes the head (first element) of this list. ilk elemanı siler ve size geri verir demek
        System.out.println(names);//[Steve, Ebubekir, Raj, Brandon, Ajda, Ayşe]
        //remove() soutta yazdırırsak sildiği elemanı verir ilk eleman yani!!

        // names.remove()== names.removeFirst()
        names.add("Ayşe");
        names.removeFirstOccurrence("Ayşe"); //ilk gördüğü ayşe yi siler
        names.removeLastOccurrence("Ayşe");// sonuncu ayşeyi siler.

        names.getFirst();//ilk elemanı al getir demek
        names.getLast();//son elemanı al getir demek

        String r2 = names.peek();//İlk elemanı silmeden size verir.
        System.out.println(r2);//Steve

        System.out.println(names.peek());//Retrieves, but does not remove, the head (first element) of this list.(Copy+Paste)
        // Returns: the head of this list, or null if this list is empty bossa null doner
        //[Steve, Ebubekir, Raj, Brandon, Ajda, Ayşe] peek silmiyor

        names.peekLast();// son elemanı yazdırır silmez.
        names.peekFirst();//İlk elemanı yazdırır, silmez.

        //Retrieves and removes the head first element of this list.(cut+paste)
        //Returns:the head of this list, or null if this list is empty

        names.poll();// ilk elemanı siler (Cut+ Paste)
        //remove() boş LinkedListte kullanılırsa hata verir, poll boş LinkedList'te kullanılırsa null verir.

        /*Pops  removes and returns the first element of this list.
        This method is equivalent to removeFirst().(Cut+Paste)
        Returns:the element at the front of this list (which is the top of the stack represented by this list)
*/       names.pop();//Removefirst ile aynı


    }
}
