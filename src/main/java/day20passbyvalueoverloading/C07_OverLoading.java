package day20passbyvalueoverloading;

public class C07_OverLoading {
    public static void main(String[] args) {
        /* Aynı İsimde aynı classta birden fazla method oluşturabilir miyiz?
Java aynı isimde aynı classta birden fazla method olduğunda
içerisindeki Data type ona data syısınıa ya da yerlerine göre
en uygun olanı seçer. Eğer bir classta isimleri aynı data typeları
farklı methodlar oluşturursak buna "Method Overloading" denir.
Java hangi methodu kullanacağına karar verirken optimizasyona gider. En uygun olani en az Autowidening gerekeni seçer.
epğer ikisinde de aynı sayıda Autowidening varsa çalışmaz!!!
       */


        String str = "Java ile güzel hayat";
        System.out.println(str.substring(2));//

        System.out.println(str.replace("Java","*"));
        System.out.println(str.replace("J","*"));
 topla(3,5);
 topla(8.6,5);
 topla(2.4,6.8);

int  y=9;
        System.out.println(y>=0 && y<9 ? 11 : "Java");

    }private static void topla(double a, double b) {
        System.out.println(a + b);
    }


        private static void topla(double a, int b) {
        System.out.println(a+b);

    }private static void topla(int a, int b) {
        System.out.println(a+b);

    }
}
