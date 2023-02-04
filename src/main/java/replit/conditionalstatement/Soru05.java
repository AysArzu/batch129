package replit.conditionalstatement;

import java.util.Scanner;

public class Soru05 {
    /*
    1 ile 12 arasında girilen sayıdan ve yıldan  yılın hangi ayı olduğunun ve  o yıl bu ayın kaç gün olduğunu hesaplayan Java kodunu yazınız.
Test Data:
2
2016
Beklenen çıktı:
2016 yili Subat ayi 29 gun
Test Data:
4
1998

Beklenen Çıktı:

1998 yili Nisan ayi 30 gun

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla ay ve yil numarasi giriniz");
        int month = input.nextInt();
        int year = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("Ocak ayi 31 gun ");
                break;
            case 2:
                if(year%4==0&&year%100!=0||year%400==0&&year%4000==0){
                    System.out.println("subat ayi 29 gun");
                }else{
                    System.out.println("subat ayi 28 gun");
                }break;
            case 3:
                System.out.println("Mart ayi 31 gun ");
                break;
            case 4:
                System.out.println("Nisan ayi 30 gun ");
                break;

            case 5:
                System.out.println("Mayis ayi 31 gun ");
                break;
            case 6:
                System.out.println("Haziran ayi 30 gun ");
                break;
            case 7:
                System.out.println("Temmuz ayi 31 gun ");
                break;
            case 8:
                System.out.println("Agustos ayi 31 gun ");
                break;
            case 9:
                System.out.println("Eylul ayi 30 gun ");
                break;
            case 10:
                System.out.println("Ekim ayi 31 gun ");
                break;
            case 11:
                System.out.println("Kasim ayi 30 gun ");
                break;
            case 12:
                System.out.println("Aralik ayi 31 gun ");
                break;
            default:
                System.out.println("Gecerli bir ay adi giriniz");
        }


    }
}
