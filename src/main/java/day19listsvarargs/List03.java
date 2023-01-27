package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List03 {
    public static void main(String[] args) {

        /*SAYI TAHMİN OYUNU
        Oyuncudan 1-10 arası bir sayı isteyiniz
        Elinizdeki listede oyuncunun tahmin ettiği sayı carsa varsa "BINGO" yazdırınız
        Yoksa verdiği sayıyı listeye ekleyiniz
        İlk "BINGO" yu tamamlayana  "KAZANDINIZ" yazdırınız
        [5,8,2,9] 2 ==> [5,8,BINGO, 9]
        [5,8,BINGO, 9] 3 ==> [5,8,BINGO, 9,3 ]
       [5,8,BINGO, 9,3 ] =======> [BINGO, BINGO,BINGO,BONGO, BINGO]
         */
        //NOTE: Arrays.asList() ile List oluşturulabilir.
        //Ama Listlerdeki "eleman sayısını" değiştiren hicbir method bu list için kullanılamaz.
        //Dolayısıyla bu sorunun çözümünde ihtiyacımız olan listi Arrays.asList()" kullanarak oluşturmamalısınız.
        //List<Integer> numsList= new Arrays.asList<>(5,8,2,9);

        Scanner input = new Scanner(System.in);
        List<String> numsList = new ArrayList<>();
        numsList.add("2");
        numsList.add("8");
        numsList.add("5");
        numsList.add("9");
        int counter = 0;
        String num = "";
        do {
            System.out.println("Lütfen 1 ile 10 arası bir sayı giriniz");
            num = input.next();
            if (num.equalsIgnoreCase("q")) {
                break;
            } else if (numsList.contains(num)) {
                numsList.set(numsList.indexOf(num), "BINGO");
                counter++;

            } else {
                numsList.add(num);
            }


        } while (counter != numsList.size());
        System.out.println("Kazandınız!!!");

        if (!num.equalsIgnoreCase("q")) {
            System.out.println("Kazandınız");
        }else {
            System.out.println("Oyundan isteyerek ayrıldınız. Tekrar bekleyiniz");
        }
        System.out.println("Final report "+numsList);

    }
}
