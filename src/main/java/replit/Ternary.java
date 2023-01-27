package replit;

import java.util.Scanner;

public class Ternary {
    /*Ask user to type a name,
the length of name should be 3.
Then check if the name has same characters.
If the String has same characters
Print “String has duplicate characters”
Else
Print “String has unique characters”
Please use ternary.
Input : ala
OutPut:String has duplicate characters*
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter three letter name ");
        String name=input.next();

        if(name.length()>3){
            System.out.println("Name must be 3 characters long");
        }else {
            System.out.println(name.charAt(0)==name.charAt(1)||name.charAt(1)==name.charAt(2)||name.charAt(0)==name.charAt(2)?"String has duplicate character":"String has unique characters");
        }
    }
}
