package day07ifstatements;

import java.util.Scanner;
public class IfStatement01 {
    public static void main(String[] args) {

        //Example 1) Verilen character buyuk harf ise ekrana “Buyuk Harf” yazdiran
        //           kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu yaziniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz...");
        char ch = input.next().charAt(0);

        //1.Yol:
//        if(ch>='A' && ch<='Z'){
//            System.out.println("Buyuk Harf...");
//        }
//
//        if(ch>='a' && ch<='z'){
//            System.out.println("Kucuk Harf...");
//        }

        //2.Yol:
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf...");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Kucuk Harf...");
        } else {
            System.out.println("Harf degil..");
        }
    }

}
