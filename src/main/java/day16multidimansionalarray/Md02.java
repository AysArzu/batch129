package day16multidimansionalarray;

public class Md02 {
    public static void main(String[] args) {
        //Example: Bir integer multidimensional array oluşturunuz
        // toplam eleman sayısını console' a yazdırınız

        int a[][]= {{13,213,4},{12,87},{4,7,1,9},{99}};
        int sum=0;
        for (int[] w : a){
           sum=sum+w.length;
        }
        System.out.println(sum);//10
    }
}
