package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists01 {
    public static void main(String[] args) {
        //Example : Verilen list'teki elemanları tekrarsız olarak yazdırınız.
        // [2,3,2,3,2,5]==>>[2,3,5]
        List<Integer> myList = new ArrayList<>();
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(3);
        myList.add(5);
        List<Integer> newList = new ArrayList<>();
        for (Integer w : myList) {
            if (!newList.contains(w)) {
                newList.add(w);
            }
        }
        System.out.println(newList);//[2, 3, 5]

        /*Example: Musteriden urun ismi alınız
                   Musterinin ismini verdiği urun listede varsa urunun ismini yazdırınız
                   Musterinin ismini verdiği urun listede yoksa "Out of Stock" yazdırınız

         */
        Scanner input = new Scanner(System.in);

        List<String> products = new ArrayList<>();
        products.add("TV");
        products.add("Radio");
        products.add("iPad");
        products.add("Notebook");
        products.add("Mobile Phone");

            //for loop kurup products lisstindeki  herbir elemanın tüm karakterlerini set methodu kullanarak küçük harfe çeviriniz
        //KUlllanıcıdan gelen yeri de küçük harfe çeviriniz
        for (int i=0; i<products.size(); i++); {

        }


        System.out.println("Ürün arama sistemine hoşgeldiniz");
        System.out.println("Ürün aramayı sonlandırmak için Q'ya basın");
        do {
            System.out.println("Aradığınız urunun ismini giriniz");

            String product = input.nextLine().toLowerCase();
            if (product.equalsIgnoreCase("q")) {
                break;
            } else if (products.contains(product)) {
                System.out.println(product+ "Stokta vardır.");
            } else {
                System.out.println(product+ " is Out of Stock");
            }
        } while (true);
        System.out.println("Sitemizi kullandığınız için teşekkür ederiz.Tekrar bekleyiniz");
    }
}
