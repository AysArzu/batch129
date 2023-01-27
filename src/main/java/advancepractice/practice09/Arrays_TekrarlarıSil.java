package advancepractice.practice09;

import java.time.LocalDate;
import java.util.Arrays;

public class Arrays_TekrarlarıSil {
//Bir array içerisindeki elementleri tekrarsız yazdıran bir kod yazınız.

    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 50, 50, 60,};
        Arrays.sort(arr);
        int idx = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[idx] = arr[i];
                idx++;
            }
        }
        arr[idx] = arr[arr.length - 1];
        idx++;
        int[] arrTekrarsiz = new int[idx];
        for (int i = 0; i < idx; i++) {
            arrTekrarsiz[i] = arr[i];
        }
        System.out.println(Arrays.toString(arrTekrarsiz));

    }


}
