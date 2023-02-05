package replit;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map_Soru {
    /*
        Write a Java program to get a String from user as input and find
        the maximum occurring character in that string. (Ignore case sensitivity)
        input :
        Learning java is easy
        output:
        maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        Map<Character, Integer> charCount = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int maxCount = 0;
        char maxChar = ' ';
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        System.out.println("Maximum occurring character is: " + maxChar);
    }
}
