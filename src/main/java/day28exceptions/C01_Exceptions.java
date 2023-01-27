package day28exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
     /* 1) Exception demek beklenmedik hata(unexpected issue) demek. Seyahatte benzin bitmesi arabanın bozulması gibi.
     //Error denmez errorlar handle edilemez exceptionlar handle edilebilir
        2) Gerçek hayatta karşılaştığımız beklenmedik problemler için
        çözüm yollarımız vardır. mesela benzin bitince Yol Yardımı ararız.
        Application'larda beklenmedik problemler için çözüm yolları üretmeliyiz,bu işleme "Exception Handling" denir.
        3) Exception'lar temel olarak 2 ye ayrılır:
              i)Compile Time Exception: Siz code yazarken farkedilir ve yazdığınız kodun altı kırmızı çizgi ile çizilir.
              ii)Run Time Exception : Siz code yazarken farkedilmez ama, code'u çalıştırdığınızda console'da hata alabilirsiniz.
        4) Exceptionlar arasında "Error" diye adlandırdığımız "Handle" edilemeyen problemler vardır.
        Gerçek hayatta şoförün ölmesi gibi, handle edilemeyecek durumlar "Error"dur.
        Application'larda "Memory"nin dolması "Error"dur.
        İki tür memory var i)Stack Memory dolarsa "StackOverFlow Error" alırsınız
                           ii)Heap Memory dolarsa "OutOfMemory Error" alırsınız.
         5) Yazdiginiz kod calismadiginda problemi bulmak icin "Log" lara bakariz.
         6) if else kullanirsak olusacak her problemi spesifik olarak if parantezinin içine yazmamız gerekir.
         Bu da ciddi bir matematik bilgisi gerektirir, ve yazacağımız kodu çok uzatır
            Ama try catch'te Java ilgili Exceptionla alakalı oluşabilecek butun problemleri yakalar.
         7) Exception Handling'de if-else kullanılmaz.

           Aritmetik Exception yazdığınız code'da matematiksel işlem kullanıyorsanız alınabilecek bir Exception'dir.==>12:0 gibi, sonucu yoktur gibi
         8) İçinde rakamlar dışında character olan bir String 'i sayıya çevirmek isterseniz Java "NumberFormatException" atar
         9) Bütün Exception'lar Class'tır.
         10)String'lerde var olmayan index'ler kullanıldığında Java "StringIndexOutOfBoundsException" atar.
         11) Array'lerde olmayan bir index kullanıldığında Java "ArrayIndexOutOfBounds" atar.
         12) Try kısmında birden fazla Exception oluşturma ihtimali olan kod varsa çoklu "catch" kullanabilirsiniz.
         13) Çoklu "catch" kullandığınızda exception class'lar arasında parent child ilişkisi yoksa catch'lerin sırası önemli değildir
         ama koddaki sıralamaya uymak tavsiye edilir.
         14) Çoklu "catch" kullandığınızda Exception Class'lar arasında parent-child ilişkisi  varsa "catch"'lerin sırası önemlidir.
         child olan class üstte olmalıdır.Parent yukarda olursa child class unreachable code olur
         15) Exception Class'lar arasında "parent - child" ilişkisi varsa ya child class'ı üste yazarak child ve parent class'lar
         için özelleştirilmiş code'lar yazarsınız(hırsız için 155, hasta için 112 gibi)
         16) Veya child'i hic kullanmaz sadece parent ile Exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)
         17)String'in değeri null olduğunda String Class'taki bazı methodları kullanamayız. Kullanırsanız "Java NullPointerException" atar.
         18 Birbirine dönüştürülemeyecek data type'larini dönüştürmekte ısrar ederseniz Java "ClassCastException" verir.
           Mesela Object olarak tanımladığımız rakamı String'e çevirmekte ısrar edersek bu hatayı atar.
           Bu class bu class'a dönüştürülemez demek ister. her data type'i her data type'ına çevrilemez.
                */
        /*
        1) NumberFormatException
         */ //bir stringi alıp int 'a  çeviren kodu yazınız

        String str = "123";//positive senario
        int result = convertToStringToInteger(str);//Stringi integer e çevir methodu
        System.out.println("result = " + (result+5));

        String st="123a";// negative senario
        int result2= convertToStringToInteger(st);
        System.out.println("result2 = " + (result2+10));// paranteze alınmalı yoksa concat yapar
    }

    private static int convertToStringToInteger(String str) {
        int i = 0;
        try {
            i = Integer.valueOf(str);
            System.out.println("Burası try bölümü");
        } catch (NumberFormatException e) {
            System.out.println("Bir String'in sayıya dönüştürülebilmesi için rakam dışı character içermemesi gerekir ");
            System.out.println(e.getMessage());
        }
        return i;
    }
}
