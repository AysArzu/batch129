package day21overloadingstatic;

public class C02_Static {
    static int sayi1;// static variable
    int sayi2;// static olayan variable= instance
/*
1)Static variable veya static methodlar (class member) tum objectler için ortak elemandır.
2)Static classs memberlar üzerinde yapılan tüm değişiklikler tum objectleri etkiler.
3)static class member lar Class'a non-static memberlar objectlere monte edilir.
Mesela bir classta 100 tane object oluşturduğunuzda non_static olanlar 100 kere oluşturulur
ama static olanlar obje sayısından bağımsız olarak bir kere oluşturulur
4)Static class memberlara ulaşmak için object oluşturmaya gerek duyulmaz, ama
non-static class memberlara ulaşmak için object oluşturmak şarttır.
A Static variable'lara sadece classin ismi kullanilarak da ulasilabilir.
B Static olmayan variable'lara ulasabilmek icin object olusturmak zorundayiz.
C Static variable'larin diger adi "class variable"'dir. Instance variable'larin diger adi "object variable"'dir.
D Static variable'lar object'lerin ortak kullanimina aciktir fakat instance variable'lar degildir.
 */
    public static void main(String[] args) {

        System.out.println("sayi1 "+sayi1);//0 yani default yazar
        // sayı 2 yazılamaz static değil

        C02_Static obj1 = new C02_Static();
        System.out.println(  "sayi2 "     + obj1.sayi2);// 0

        sayi1++;
        System.out.println("sayi1 = " + sayi1);//1
        obj1.sayi2++;
        System.out.println("sayi2 = " + obj1.sayi2);//1

        C02_Static obj2 = new C02_Static();
        System.out.println(obj2.sayi2);//0


    }
}
