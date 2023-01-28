package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {


    /*
           Example 1: Asagidaki sekli cizdiren kodu yaziniz
                       * * * *
                       * * *
                       * *
                       *
        */
        Scanner input1 = new Scanner(System.in);

        System.out.println("Satir(row) sayisini giriniz...");
        int row1 = input1.nextInt();

        for (int i = 1; i <= row1; i++) {

            for (int k = row1; k >= i; k--) {
                System.out.print("* ");
            }

            System.out.println();

        }
          /*

                      *
                     * *
                    *   *
                   *     *
                  * * * * *

                    ooooo*
                    oooo* *
                    ooo*   *
                    oo*     *
                    o* * * * *

            Satir sayisini kullanicidan alarak yukaridaki sekli yazdiriniz
             */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int row=input.nextInt();//5


        for (int i = 1;     i <=row ;                   i++) {//satir kontrol

            for (int bosluk = row; bosluk >= i;                 bosluk--) {//bosluk kontrol soldaki konsoldan uzaklastiran
                // en ust satirdaki 5 bosluk; alttaki 4 bosluk; bir altindaki 3  bosluk;2 ve 1 bosluk
                System.out.print(" ");//o
            }
            for (int yildiz = 1; yildiz <= i;               yildiz++) {//* kontrol 1.satirdaki *
                //2.satirdaki *==>* *  3.satirdaki *==>* *  4.satirdaki *==>* *

                if (yildiz == 1 || yildiz == i) {
                    System.out.print("* ");//en distaki yildizlar
                } else if (i == row) {
                    System.out.print("* ");//en alt satirdaki  *
                } else
                    System.out.print("  ");//3. ve 4.satirdaki iki bosluk
            }//for yildiz+ if else
            System.out.println();
        }//for auter sat

    }
}
