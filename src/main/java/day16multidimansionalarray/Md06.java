package day16multidimansionalarray;

public class Md06 {
    public static void main(String[] args) {
        //Bir multi dimensional arraydeki en büyük ve en küçük sayının toplamını ekrana yazdırınız.
        int[][] a = {{21, 5}, {14, 70, 11}};
        int small=a [0][0];
        int big=a [0][0];
        for (int[] w : a) {
            for (int s:w) {
               small=Math.min(small,s);
               big=Math.max(big,s);
            }
        }
        System.out.println(small);//5
        System.out.println(big);//70
        System.out.println(big+small);//75
    }
}
