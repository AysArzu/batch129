package day28exceptions;

public class C02_Exceptions {

    public static void main(String[] args) {
        /*
        2)StringOutOfBoundExceptions
         */
        //Bir String'in istediğimiz indexteki datasını bize veren kodu yazınız.
        char ch = getCharFromString("Ebubekir", 8);//8. index yok varsa normal çalışır.
        System.out.println("ch = " + ch);


    }

    private static char getCharFromString(String str, int i) {
        char ch=' ';
        try {
            ch=str.charAt(i);//cntrl + Alt+ t try catch i açar! imleci bu satırın başına koyarız nerede hata olabilir diye düşünürsek oraya
        } catch (Exception e) {
            System.out.println("StringIndexOutOfBoundsException olmayan indexi getiremedi");
          //  System.out.println("kendi eklediğim  e.getMessage() çalıştı "+  e.getMessage());; şeklinde de olur
            e.printStackTrace();// hatanın hepsini yazdırır
            System.out.println(e.getCause());// null verir sebep izah etmiyor. o yüzden null döndürüyor
        }
        return ch;
    }
}

