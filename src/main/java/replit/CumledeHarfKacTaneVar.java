package replit;

import java.util.Scanner;

public class CumledeHarfKacTaneVar {/*
Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name
e.g:char ch1= 'a' ;
String name =“John came late"
Expected Output: Number of a = 2*/

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a name");
        String name=input.nextLine();
        System.out.println("Enter a character");

        String  ch=input.next();

       int fark= (name.length())-name.replaceAll(ch,"").length();
        System.out.println("Number of a = "+fark);

    }


}
