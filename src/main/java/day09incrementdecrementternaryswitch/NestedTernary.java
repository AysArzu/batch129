package day09incrementdecrementternaryswitch;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {

        /*
            Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */
        int year = 2005;

        String result = year%100==0 ? (year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap" : "Not leap");
        System.out.println(result);


/*
        TASK :
         Kullanicidan bir character girmesini isteyiniz
         Character harf ise kucuk harf olup olmadigini kontrol ediniz
         Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
         Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
         Harf degilse ekrana "Harf degil" yazdiriniz
         97:a  122:z ascii değeri
         */

            /*
            Ascii degerler verilmeseydi
            char a='a';
            System.out.println(a+0);
             */


            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir karakter giriniz");
            char ch =input.next().charAt(0);

            System.out.println("***************************TERNARY***********************");

            boolean harfMi=(ch<='z' && ch>='a') ||(ch<='Z'&& ch>='A');
            boolean kucukHarf=(ch<='z' && ch>='a');

            String result2=(harfMi)   ? kucukHarf ? "Kucuk Harf"   : "Buyuk Harf"  : "Harf Degil" ;
            System.out.println("result = " + result2);



    }

}
