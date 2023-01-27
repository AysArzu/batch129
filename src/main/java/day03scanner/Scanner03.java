package day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //Kullanicidan adresini aliniz ve ekrana yazdiriniz
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");

        //nextLine() method'u kullanicidian cok kelimeli String almak iicn kullanilir.
        String address = input.nextLine();

        System.out.println(address);

    }
}
