package replit.conditionalstatement;

import java.util.Scanner;

public class Soru03 {
    /*
                Girilen 3 sayıdan en büyüğünü bulan Java Kodunu yazınız.
                Test Data:
                12
                34
                23
                Beklenen Çıktı:
                En Buyuk Sayi: 34

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("lutfen uc sayi giriniz");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max=num1;
        if(num2>num1){
            max=num2;
        } else if (num3>num2) {
          max=num3;
        }
        System.out.println("En Buyuk Sayi: "+max);
    }
}
