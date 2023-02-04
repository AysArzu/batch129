package replit.conditionalstatement;

import java.util.Scanner;

public class Soru07 {
    /*
Belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num1 = in.nextInt();
        for (int i = 1; i <11 ; i++) {
            System.out.println(num1+ " x "+ i+ " = "+ num1*i);
        }
    }
}
