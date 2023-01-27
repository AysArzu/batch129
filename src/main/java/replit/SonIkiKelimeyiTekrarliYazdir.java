package replit;

import java.util.Scanner;

public class SonIkiKelimeyiTekrarliYazdir {
    /* Ask user for a string and print a new string made of 3 copies of the last 2 letters
The strings length will be at least 2.
 Sample:INPUT       : Mustafa
        OUTPUT      : fafafa*/
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a String");
        String name=input.next();

        System.out.println(name.substring(name.length()-2).repeat(3));

    }
}
