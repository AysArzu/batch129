package practicenighttime08.practice09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMethods {
    // Kullanıcıdan 5 sayıdan olusan
    // bir liste isteyin.
    // listeyi sirala ve tersten yazdir
    // listeyi karıştırin ve yazdırin
    // 3'er sağa kaydirin ve yazdırin
    //  maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıların yerine minimum sayıyi yazdir
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen sayi giriniz");
            arrList.add(input.nextInt());
        }


        arrList.sort(Collections.reverseOrder());
        System.out.println("tersten arraylist " + arrList);

        Collections.shuffle(arrList);// shuffle() random olarak elemanlarin yerlerini karistirir
        System.out.println("arrList = " + arrList);

        // uc saga kaydirip yazdiracagiz
        Collections.rotate(arrList, 3);
        System.out.println("arrList rotate = " + arrList);//3. sayidan itibaren yazar bastaki sayilari sona ekler 5'7'8'9'4 ==> 8,9,4,5,7 olur


        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        Collections.replaceAll(arrList, max, min);
        System.out.println("max deger yerine min degerleri yer degistirlince arrList " + arrList);

    }

}
