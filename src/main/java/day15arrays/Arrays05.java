package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {
        //Example: String array elemanlarını uzunluklarına göre küçükten büyüğe sıralayınız.
                 //   ["Michael", "Ajda", "Thomas","Tom"]
        String[] arr={"Michael", "Ajda", "Thomas","Tom"};
        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));
        //Example: String array elemanlarını uzunluklarına göre büyükten küçüğe sıralayınız.
        //["Michael", "Ajda", "Thomas","Tom","Cuneyt"]
        String brr[]={"Michael", "Ajda", "Thomas","Tom","Cuneyt"};
        Arrays.sort(brr,Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(brr));
        //Example: String array elemanlarını uzunluklarına göre büyükten küçüğe sıralayınız.
        // aynı karakter sayısında olanları da alfabetik sıraya koyunuz.
       // ["Michael", "Ajda", "Thomas","Tom","Cuneyt","Reyhane","Gabriel","Cem", "Cim","Ali"]
        String[] crr={"Michael", "Ajda", "Thomas","Tom","Cuneyt","Reyhane","Gabriel","Cem", "Cim","Ali"};
        Arrays.sort(crr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));

    }
}
