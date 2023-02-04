package replit.conditionalstatement;

import java.util.Scanner;

public class Soru11 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın.
    Girdiği değer harf değilse yada 1 karakterden fazla ise hata mesajı göstersin.
     (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)we,% de sorduk
     */
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
      String ch=scan.nextLine();
        String sesliHarfler="aeiou";
        if(ch.length()>1||!Character.isLetter((ch.charAt(0)))) {
            System.out.println("Yanlis karakter girdiniz");
        }   else if(sesliHarfler.contains(ch)){
            System.out.println(ch+ " harfi sesli harftir");
        }else{
            System.out.println(ch+ " harfi sessiz harftir");
        }
    }
}
