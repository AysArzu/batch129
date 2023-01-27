package day29exceptions;

public class Exceptions02 {
    /*
   **** "throw ile throws keywordleri arasındaki fark nedir?***
    1) "throw" method body'si içinde,"throws" ise method parantezinden hemen sonra kullanılır.
    2) "throw" method body'si içinde istenilen yerde istenildiği kadar kullanılır,
       "throws" ise method parantezinden sonra sadece bir kere kullanılır
    3) "throw"dan sonra new keyword ve constructor kullanılarak object oluşturulur.
       "throws"dan sonra sadece Exceptions Class ismi yazılır.
    4) "throw" belli şartlar için Exception atmada kullanılır
       "throws ise application'ı Exception attıktan sonra durdurur.
       * bazen  kendi oluşturduğumuz methodda Exceptions'ı biz atarız(throw new IllegalArgumentException gibi).Kritik durumlarda kullanılır.
       * Sonra o methodu kullanırken Exceptions'u handle etmemiz gerekir. Yani try catch'e almalıyız. Applicationun donmasını engellemiş oluruz.
     */
    public static void main(String[] args) throws IllegalArgumentException {
        //kullanıcıdan yaşını alıp yazdırma methodu oluşturunuz

        try {
            printAge(-18);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
/*

        try {
            getMark(-90);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
*/ getMark(-90);

    }

    //"throw" keyword bir method'un body'si icinde istedigimiz yerde, istedigimiz kosullar için, istedigimiz kadar Exception atmamizi saglar.
    //"throw" keyword yazildiktan sonra bir Exception Class object'i olusturulur.
    //Exception Class constructor'inin parantezi icine istediginiz Exception Mesaj'ini yazabilirsiniz
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");//exception  atma ihtimalini handle yapmamız lazım o yüzden age i de try içine aldık.
        } else {
            System.out.println(age);
        }
    }

    //Ogrenci notlari girisi yapan ve notu console'a yazdiran bir method olusturunuz
    public static void getMark(double d) {

        if (d < 0) {
            throw new IllegalArgumentException("Marks cannot be less than zero");
        } else if (d > 100) {
            throw new IllegalArgumentException("Marks cannot be greater than hundred");
        } else {
            System.out.println(d);
        }
    }
}

