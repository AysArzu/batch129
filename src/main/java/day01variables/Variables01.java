package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable olusturmak
        //Java cumlesi = Statement
        //Java'da esittir demek "==". Yani Matematik'de "=", Java'dd "=="
        //Java'da "=" "assignment operator" dir. Sagdaki degeri alir soldaki kutuya koyar
        //Access Modifier yazmazsaniz "access modifier" "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assignment Operator(Atama Operatoru)  + Variable degeri ==> Assignment
        //Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerlerini(default) koyar.
        //Default degerler sayilar icin sifirdir.
        // Data Type'ini yaziniz   Variable ismi yaziniz  Assignment Operator(Atama Operatoru)   Variable degeri   Ingilizce'deki nokta gibi
        int age = 13;

        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //String'lere verilen degerler cift tirnak icinde olmalidir.
        //String'ler icin "default value" "null" dir.
        String studentName = "Ali Can";

        /*
           Java'da temelde iki tip data vardir;
           1)primitive data type:
                char: Tek karakterler icin kullanilir. A, x, ?, 5
                boolean: boolean'lar sadece iki farkli deger alabilir; true(dogru) veya false(yanlis)
                byte: -128 den +127 e kadar tamsayi degerleri icin kullanilir (1 byte)
                short: -32768 ile 32767 arasindaki tamsayilar icin kullanilir (2 byte)
                int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir (4 byte)
                long: -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 arasindaki sayilar icindir. (8 byte)
                float:
                double:
           2)non-primitive data type

         */

        //Ornek 2: char data type'inda ilk ismin ilk harfi olarak bir variable olusturnuz ve bir deger atayiniz.
        //Note: char data type'inda degerler tek tirnak icine konulmlaidir
        char isminIlkHarf = 'A';

        //Ornek 3: boolean data type'inde emeklimisin icin bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false;

        //Ornek 4: byte data type'inda ogrenci yasi icin bir variable olusturunuz ve deger atayiniz.
        byte studentAge = 23;

        //Ornek 5: Site nufusu icin bir variable olusturup deger atayiniz.
        short siteNufusu = 1200;

        //Ornek 6: Ulke nufuslari icin bir variable olusturup deger atamasi yapiniz
        int countryPopulation = 1864184648;

        //Ornek 7: iNsan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapiniz.
        //Note: Bir deger long ise sonuna "L"(Tercih edilir) veya "l" konulur.
        long cellNumberInHumanBody = 87654321356788L;

        //Eger long'a atadiginiz deger int'lerin araliginda ise sonuna "L" koymaya gerek yok
        long weightOfSun = 1234567;
    }
}