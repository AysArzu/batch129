package day29exceptions;

import java.util.Scanner;

public class C05_Exceptions {
    public static void main(String[] args) {
        /*throw==> Application'ın kurallarını biz belirlemek istiyorsak throw exceptions kullanabiliriz.
        throw keyword'u 2{} arasında body'de  yer alır
        throw new keywordu ile constructor oluşturur.
        throw 1 kere kullanılır
        throws istenildiği kadar kullanılabilir.

        //Yaşı ekrana yazdıran bir kod yazınız.*/

        Scanner input= new Scanner(System.in);
        int age=input.nextInt();
        System.out.println(age);
        if(age<0){
            throw new IllegalArgumentException("YAŞ negatif olmaz");

        }else System.out.println("throw herşey yolunda "+ age);



    }
}
