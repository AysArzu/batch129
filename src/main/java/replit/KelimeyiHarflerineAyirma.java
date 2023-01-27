package replit;

import java.util.Arrays;

public class KelimeyiHarflerineAyirma {
    /*Create a custom return type method accepts a name as parameter
    and prints the name as a char array.
    (do not use toCharArray() method)
    Input : John
    Output :[J, o, h, n]*/

    public static void main(String[] args) {
        name("John");
    }

    public static void name(String str) {
        str = "John";
        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));
    }
}
