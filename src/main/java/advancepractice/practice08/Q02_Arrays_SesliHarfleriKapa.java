package advancepractice.practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_SesliHarfleriKapa {

    public static void main(String[] args) {
/*Kullanıcıdan alınan bir kelimedeki sesli harfleri kapatıp her bir
karakteri bir array elemanı olarak yazdıran bir kod yazınız.
    Örn:
    input: Merhaba
    output: [M, *, r, h, *, b, *]
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        int idx = 0;
        String[] arr = input.nextLine().toLowerCase().split("");
        for (String w : arr) {
            if (w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u")) {
                arr[idx] = "*";
                idx++;
            } else {
                arr[idx] = w;
                idx++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
