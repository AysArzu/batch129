package replit.conditionalstatement;

import java.util.Scanner;

public class Soru02 {
    /*
    iki sayıyı kıyaslayan Java kodunu yazınınz.
**Kullanılacak Operatörler**
**Büyüktür >**
**Küçüktür <**
**Büyük yada eşit =>**
**Küçük yada eşit =<**
**Eşittir ==**
**Eşit değildir !=**
**Kullanılacak sayılar 25 ile 39**
Beklenen Örnek Çıktı:
25 != 39
25 < 39
25 <= 39
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if(number1!=number2){
            System.out.println(number1+ " != "+number2);
        } if(number1>number2){
            System.out.println(number1+ " > "+number2);
        } if(number1>=number2){
            System.out.println(number1+ " >= "+number2);
        } if(number1<number2) {
            System.out.println(number1 + " < " + number2);
        } if(number1<=number2){
            System.out.println(number1+ " <= "+number2);
        } if(number1==number2){
            System.out.println(number1+ " == "+number2);
        }
    }
}
