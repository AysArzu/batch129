package advancepractice.practice7;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays_OrtaElement {
    public static void main(String[] args) {
        /*
       Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
      Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
      (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int[] arr = new int[input.nextInt()];
        for(int i=0; i<arr.length; i++){
            System.out.println(1+i+ ". elementi giriniz");
            arr[i]=input.nextInt();

        }Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ortaIndx=arr.length/2;
        if(arr.length%2!=0){
            System.out.println("Orta element "+arr[ortaIndx]);
        }else{
            System.out.println("Ortadaki iki elementin toplamının ortalaması " +(arr[ortaIndx]+arr[ortaIndx-1])/2);
        }
    }

}
