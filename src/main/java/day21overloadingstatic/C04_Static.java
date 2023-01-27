package day21overloadingstatic;

import java.util.List;

public class C04_Static {
    public static void main(String[] args) {
// static olanlara ulaşmak için obje oluşturmadık. sadece class ismi yeterli
// instance olanlara ulaşmak için obje oluşturmak zorundayız.
        System.out.println(C03_StaticDepo.okulIsmi);//Emre Okullari

        C03_StaticDepo obj1 = new C03_StaticDepo();

        System.out.println(obj1.ogrenciGul);//Gül Geçer
        C03_StaticDepo.okulIsmi = "Ayse Okulları";
        System.out.println(C03_StaticDepo.okulIsmi);//Ayse Okulları

        C03_StaticDepo obj2 = new C03_StaticDepo();
        obj2.ogrenciGul = "Zeynep Karagöl";
        System.out.println(obj1.ogrenciGul);//Gül Geçer
        System.out.println(obj2.ogrenciGul);//Zeynep Karagöl

String initials=C03_StaticDepo.getInitials("Ayse Battal");
        System.out.println(initials);
        System.out.println(obj1.countVowels("ayse arzu"));
       //4
        //static olanlar obje ile çağırılması iyi olmaz
// list oluşturmada yeni bir yol....
        List<String> name= List.of("Ayşe", "Ebubekir","Ebrar");
        System.out.println(name);
    }

}
