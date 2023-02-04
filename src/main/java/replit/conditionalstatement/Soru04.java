package replit.conditionalstatement;

import java.util.Scanner;

public class Soru04 {
    /*
    1 ile 7 arasında girilen bir tamsayı ile haftanın gününün adını gösteren bir Java kodu yazın.
        Test Data
        3
        Beklenen Çıktı:
        Carsamba
        Test Data:
        1
        Beklenen Çıktı:
        Pazartesi

     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Haftanin gunlerinden bir sayi giriniz.");
        int day = in.nextInt();
        switch (day){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli gun numarasi giriniz");
        }
    }

}

