package day16multidimansionalarray;

import java.util.Arrays;

public class Md04 {
    public static void main(String[] args) {
        //Bir multidimensional array oluşturunuz ve bir dimensionalli aray e dönüştürünüz.
        //            [ [2, 5], [3], [4, 7, 11] ==>[2,5,3, 4, 7, 11]
        int [][]a={{2,5},{3},{4,7,11}};
        //"a" arrayindeki toplam eleman sayısını bulunuz
        int totalElement=0;
        for (int[] w:a) {
          totalElement += w.length;
        }
        //b isimli tek dimensionalli bir array oluşturunuz
        int []b= new int[totalElement];
        int idx=0;
        for (int[]w :a) {
            for (int k:w) {
                b[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));//[2, 5, 3, 4, 7, 11]
    }
}
