package practice.practice02.practice04;

import java.util.Scanner;

public class C02_ForLoop {
    /*
    Kullanicidan aldiginiz bir String degerde 'c' den onceki 'a'
    harfinin String deger icerisinde kac kez gectigini bulan kodu yaziniz

     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen String bir ifade veriniz ");
        String str =input.nextLine().toLowerCase();
        int sayac=0;

        for (int i = 0;         i <str.length();                i++) {
            if(str.charAt(i)=='a'){
                sayac++;
            }else if(str.charAt(i)=='c'){
                break;
            }
        }
        System.out.println(" c oncesi 'a' larin sayisi = " + sayac);

        //**********************************************************************
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk " " veya 'a' harfi geldiginde bunlari yazmasin

            /*
            gazi antep
            g
            z
            i
            n
            t
            e
            p

             */



            Scanner input1 = new Scanner(System.in);
            System.out.println("Lutfen bir cumle giriniz");
            String str1= input1.nextLine();

            for (int i = 0; i <str1.length();        i++) {
                if(str1.charAt(i)=='a' || str1.charAt(i)==' '){
                    continue;
                }//if else
                System.out.println(str1.charAt(i));
            }//for loop

    }
}
