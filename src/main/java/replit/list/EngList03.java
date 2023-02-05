package replit.list;

import java.util.Scanner;

public class EngList03 {
    /*
        Get a sentence from the user. Accept the sentence received from the user as a parameter,
        Invert sentence using Array and write a Method that returns the result as a String to the main method.
        Note: Upper and lower case letters, spaces and special characters will not be changed.
        Input :
        It is very nice to write code.
        Output :
        .edoc etirw ot ecin yrev si tI
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("bir cumle giriniz");
        String cumle = scan.nextLine();

        String reversed = hemCumleyiHemKelimeyiterstenYazdir(cumle);
        System.out.println(reversed);
    }

    private static String hemCumleyiHemKelimeyiterstenYazdir(String cumle) {
        String[] arr = cumle.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = arr.length - 1; i > 0; i--) {
            String word = arr[i];
            for (int j = word.length() - 1; j >= 0; j--) {
                reversed.append(word.charAt(j));

            }
            reversed.append(" ");
        }
        return reversed.toString().trim();
    }
}






