package denemelerim.sorukitapcigi.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class List09 {
    /*
    String bir listede verilen tüm fiyatların toplamını bulunuz.
    Örnek: List<String> myList = new List<String>{'$12.99', '$23.60', '$54.45'}; ==> 91.04

     */
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$54.45");

        double sum = 0;
        for (String w : myList) {
//replaceAll() methodunu ayri yazdim kabul etmedi bu sekilde kabul etti
            Double price = Double.valueOf(w.replace("$", ""));
            sum += price;
        }
        System.out.println(sum);


    }
}
