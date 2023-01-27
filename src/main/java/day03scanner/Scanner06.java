package day03scanner;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {

        //Kullanicidan alacaginiz 5 basamakli
        // bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamakli bir sayi giriniz...");

        int number = input.nextInt();

        //Son rakami al
        int lastDigit = number%10;
        System.out.println(lastDigit);

        //Sayiyi kucult
        number = number/10;
        System.out.println(number);
    }
}
