package day16multidimansionalarray;

public class Md05 {
    public static void main(String[] args) {
        //Example: Bir integer multi-dimensional array oluşturunuz
        //Bu arraydeki tüm elemanların çarpımını console'a yazdıran kodu yazınız.

        int[][] a = {{2, 5}, {4, 7, 11}};
        int carpim = 1;
        for (int[] w : a) {
            for (int s : w) {
                carpim *= s;
            }
        }
        System.out.println(carpim);//3080

    }
}
