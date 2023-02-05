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
        System.out.print("Input a string: ");
       String input= scan.nextLine().toLowerCase();
        int[] charCount = new int[256];
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount[c]++;
        }

        int max = 0;
        char maxChar = ' ';
        for (int i = 0; i < 256; i++) {
            if (charCount[i] > max) {
                max = charCount[i];
                maxChar = (char) i;
            }
        }

        System.out.println("The maximum occurring character is: " + maxChar);
    }




    }

