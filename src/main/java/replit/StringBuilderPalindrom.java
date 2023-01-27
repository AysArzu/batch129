package replit;

public class StringBuilderPalindrom {
    /*
     Write a java program which accept a sentence as parameter, than reverses sentence by using StringBuilder
   and checks if sentence is palindrome or not
   (without case sensitivity)
   Eg : input : I love Java
   Output: "Reversed sentence : avaJ evol I .
   It is not a palindrome"
     */
    public static void main(String[] args) {
        String cumle="I love you";
        String newCumle=cumle.toLowerCase();
        StringBuilder sb=new StringBuilder(newCumle);
        String reversed=sb.reverse().toString();
        if(cumle.equals(reversed)){
            System.out.println("It is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }

    }
}
