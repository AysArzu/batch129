package replit;

public class StringtekiRakamlariToplama {
    public static void main(String[] args) {
        /*Write a method which accepts a String as parameter and prints the sum of the digits,
         present in the given string.
         input : ade1r4d3
         output : 8
         Hint : Use Character.isDigit()
                Integer.valueOf()*/

        String input="ade1r4d3";
        int sum=0;
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){
                sum+=Integer.valueOf(""+input.charAt(i));
            }

        }
        System.out.println(sum);


    }
}
