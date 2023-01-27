package advancepractice.practice09;

import java.util.Scanner;

public class Q03_ForLoop_RakamlarToplamı {
    /*
     Kullanıcıdan alınan bir String içerisindeki rakamların toplamını hesaplayan bir method yazınız.
     Örn:
     input : J4\/4 1$ 34$¥
     output : 16
     İpucu:
     Character.isDigit()
     Integer.valueOf()
    */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz.");
        String str = input.nextLine();

        rakamlarToplami(str);
    }

    public static double rakamlarToplami(String str) {
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                toplam+=Integer.valueOf(""+str.charAt(i));
            }
        }
        System.out.println("toplam = " + toplam);

        return toplam;
    }
}
