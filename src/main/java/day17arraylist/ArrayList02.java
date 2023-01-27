package day17arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {

        //ArrayList oluşturulurken sğ tarafa (constructor) ArrayList yazmak zorundasınız
        //Ama sol tarafa ister "ArrayList" yazın isterseniz de "List" yazın, ikisi de çalışır.
        List<Character> initials = new ArrayList<>();
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');

        //Bir List'te kaç eleman olduğunu nasıl anlarız?
        int numOfElement = initials.size();
        System.out.println(numOfElement);//4

        //Note: Array'lerden bahsederken "length" kullanılır, "List'lerden bahsederken "size" kullanılır.

        //Bir list'ten istenen bir eleman nasıl alınır?
        char u = initials.get(2);
        System.out.println(u);//M

//Example: Verilen bir String List'teki elemanların toplam karakter sayısını bulan kodu yazınız
        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.Yol
        int sum = 0;
        for (String w : cities) {
          sum+=  w.length();
        }
        System.out.println(sum);//26

        //2.Yol
        int toplam=0;
        for (int i = 0; i <cities.size() ; i++) {
          toplam+=  cities.get(i).length();
        }
        System.out.println(toplam);//26

        //Bir List'teki istenen elemanı nasıl değiştirebiliriz
        cities.set(0,"New York");
        System.out.println(cities);//[New York, Istanbul, Kayseri, Almaty]

        //Example :Maas List'i oluşturunuz ve maaşlara %20 zam yapınız
        List<Double> salary=new ArrayList<>();
        salary.add(19500.25);
        salary.add(8500.75);
        salary.add(32500.50);

        //1.Yol:
       int idx=0;
        for (Double w:salary ) {
           salary.set(idx,w*1.20);
           idx++;
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]

        //2.Yol:
        for (int i = 0; i < salary.size(); i++) {
            salary.set(i, salary.get(i)*1.2);
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]
    }
}
/*    37-----
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.
    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0
    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m
    İpucu harfleri değiştirin ve ekrana yazdırın.

    Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir şifre giriniz");
                String[] ceviri = input.nextLine().toLowerCase().split("");
                for (String w : ceviri) {
                switch (w) {
                case "a":

                case "e":
                case "i":
                case "o":
                case "u":


                System.out.println(ceviri);*/