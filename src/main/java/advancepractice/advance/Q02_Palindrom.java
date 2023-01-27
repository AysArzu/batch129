package advancepractice.advance;

import java.util.Scanner;

public class Q02_Palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      /*  System.out.println( "Bir String değer giriniz");
        String str=input.nextLine().replaceAll(" ","").toLowerCase();

        String strReverse="";
        for (int i =str.length()-1;i>=0; i--) {
            strReverse+=str.charAt(i);

        }
        System.out.println(strReverse);

if(str.equals(strReverse)){
    System.out.println("Palindrom");
}else System.out.println("Palindrom değil");*/
        String str2 = input.nextLine().replaceAll(" ", "").toLowerCase();
        System.out.println("str2 = " + str2);

        StringBuilder stb = new StringBuilder(str2);// stringbuilder oluşturduk reverse methoduyla ters çevirdik.
        System.out.println("stb = " + stb);
        String str2Reverse = stb.reverse().toString(); //reverse ile doğru olsa da hata verir stringe çevirdik
        System.out.println("stb = " + stb);//Ali==>ilA// sonra yazdırabildik
        if (str2.equals(str2Reverse)) {
            System.out.println("Palindrom");
        } else System.out.println("Palindrom değil");
    }
}
