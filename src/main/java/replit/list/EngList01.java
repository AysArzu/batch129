package replit.list;

import java.util.Scanner;

public class EngList01 {
    /*
        Write a Java program to get a String from user as input and find
        the maximum occurring character in that string. (Ignore case sensitivity)
        input :
        Learning java is easy
        output:
        maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       String input= scan.nextLine().toLowerCase();

        for (int i = 0; i <input.length() ; i++) {
            int count=0;
           char c= input.charAt(i);
            for (int j = 0; j <input.length() ; j++) {
               if( input.charAt(j)==c){
                  count++ ;
                }

            } System.out.print(c+" "+count);
        }



       // System.out.println(" maximum occurring character is :");
    }
}
