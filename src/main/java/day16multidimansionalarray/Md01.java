package day16multidimansionalarray;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        int[][] a = new int[3][2];
        System.out.println(Arrays.deepToString(a));//[[0, 0], [0, 0], [0, 0]]
        a[0][0] = 5;
        a[0][1] = 12;
        a[1][0] = 81;
        a[1][1] = 45;
        a[2][0] = 123;
        a[2][1] = 0;

        //Note: Array'lere non-primitive data konulamaz.
        //Note: Array'lere primitive data veya reference konulur.
        // Ama siz bir array'i yazdırmak istediğinizde Java adresler yardımı ile non-primitive data'ya ulaşır.
        //ve o non-primitive data'yı sanki array'in içindeymiş gibi gösterir.

        //Multidimensional Array'lerdeki belli elemanlara nasıl ılaşılır?
        System.out.println(Arrays.toString(a[2]));// [123, 0]
        System.out.println(a[1][0]);//81
        System.out.println(Arrays.deepToString(a));//


    }
}
