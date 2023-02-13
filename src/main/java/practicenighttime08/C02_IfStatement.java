package practicenighttime08;

import java.util.Scanner;

public class C02_IfStatement {
    /*
       Kullanicidan alacaginiz 2 sayiyi yine kullaniciya
       sectireceginiz dort islemden biri ile isleme koyup yazdiriniz

        */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen\n toplama yapmak icin 1\n cikarma yapamk icin " +
                "2\n carpma yapma icin 3 \n bolme yapmak icin 4\n giriniz");//kullaniciya secmesi icin menu olusturdum

        int islem = input.nextInt();
        System.out.println("Lutfen iki tamsayi giriniz");
        double num1 = input.nextDouble();//1.sayi assign edildi
        double num2 = input.nextDouble();//2.sayi assign edildi

        if (islem == 1) {
            System.out.println("Toplama isleminin sonucu : " + num1 + "  +  " + num2 + "  =  " + (num1 + num2));
        } else if (islem == 2) {
            System.out.println("Cikarma isleminin sonucu :" + num1 + "-" + num2 + "=" + (num1 - num2));
        } else if (islem == 3) {
            System.out.println("Carpma isleminin sonucu :" + num1 + "x" + num2 + "=" + (num1 * num2));
        } else if (islem == 4) {
            System.out.println("Bolme isleminin sonucu :" + num1 + "/" + num2 + "=" + (num1 / num2));
        } else
            System.out.println("Hatali secim yaptiniz tekrar deneyiniz");

    }
}
