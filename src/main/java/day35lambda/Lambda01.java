package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

    /*1)Lambda "functional programming"dir methodlari kulllanarak kod yazma. digerleri "structured Programming"dir
      2)"functional programming" ne yapmak gerekir? (what to du) ile ilgilenir nasil yapmak gerekir(how to do) ile ilgilenmez.
      3)"functional programming" collection'lar ve Array'lerde kullanilir
      4)Lambda Java'ya Java 8'de eklendi.

        "stream()" elemanlari yukardan asagiya dizer."Lambda" list'i "stream" e cevirir öyle calisir.
        "filter()" filtrelemek icin kullanilir.
        "map()" u var olan elemani degistirmek icin kullanilir.
        "distinct()" u tekrarli elemanlari sadece bir kere gosterir ve tekrarsizlari olduklari kadar gosterir.
         Note : Distinct methodu ilk baslara konulursa "Lambda" ya daha az is yaptirmis oluruz.
        "reduce()" u  kullanildiginda cok sayidaki deger bir tane degere donusmus olur.
         Orn; reduce(0,(t,u)->t+u) ==> "t" ilk degeri "sifir" dan alir, daha sonraki degerleri toplamanin sonucundan alir.
         "u" ise degerlerini her zaman "stream" den alir
         get()==> methodu optional data type'ini Integer'a cevirir.
        sorted() methodu ==> elemanlari kucukten buyuge siralar.
     */

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        printElements1(nums);
        System.out.println();
        printElements2(nums);
        System.out.println();
        printEvenElements1(nums);
        System.out.println();
        printEvenElements2(nums);
        System.out.println();
        printSquareOfOddElements(nums);
        System.out.println();
        printCubeOfDistinctOddElements(nums);
        System.out.println();
        printSumOfSquaresOfDistinctEvenElements(nums);
        System.out.println();
        printProductOfSquareOfDistinctEvenElements(nums);

        getMaxValue(nums);
        getMaxValue2(nums);
        getMaxValue3(nums);


        getMinValue1(nums);
        getMinValue2(nums);
        getMinValue3(nums);
        getMinValue4(nums);

        getMinGreaterThanSevenEven(nums);
    }

    //1)Create a method to print the list elements
    // on the console in the same line with a space between two consecutive elements.(Structured)
    public static void printElements1(List<Integer> nums) {

        for (Integer w : nums) {
            System.out.print(w + " ");
        }
        //2)Create a method to print the list elements
        // on the console in the same line with a space between two consecutive elements.(Functional)
    }

    public static void printElements2(List<Integer> nums) {

        nums.stream().forEach(t -> System.out.print(t + " "));
    }// stream yukaridan asagiya akis demek

    //3)Create a method to print the even list elements on the console in the same line
    // with a space between two consecutive elements.(Structured) listteki cift elemanlari arasinda boslukla yazdir

    public static void printEvenElements1(List<Integer> nums) {

        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }//4)Create a method to print the even list elements on the console in the same line
        // with a space between two consecutive elements.(Functional)
        //List buydu 12 9 131 14 9 10 4 12 15
    }

    public static void printEvenElements2(List<Integer> nums) {
        nums.
                stream().
                filter(t -> t % 2 == 0).
                forEach(t -> System.out.print(t + " ")); //12 14 10 4 12  oldu

    }

    //5)Create a method to print the square of odd list elements on the console in the same
    // with a space between two consecutive elements.(tek sayilarin karesini bul arasinda boslukla yazdir)(Functional)
    public static void printSquareOfOddElements(List<Integer> nums) {
        //map() rakamlari degistirmede kullanilir
        nums.
                stream().
                filter(t -> t % 2 != 0).//tek sayilari sectik
                map(t -> t * t).//var olani degistirir
                forEach(t -> System.out.print(t + " "));
    }

    //6)Create a method to print the "cube" of "distinct" "odd" list elements on the console in the same line with a space between two consecutive elements.
//  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini tekrarsiz olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeOfDistinctOddElements(List<Integer> nums) {

        nums.
                stream().
                distinct().       //tekrarsiz sayilari aldim one yazdimki eleman sayisini azalttim
                filter(t -> t % 2 != 0).//filtreledim
                map(t -> t * t * t).    //kupunu aldim
                forEach(t -> System.out.print(t + " "));// yazdirdim
    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
//reduce() methodu cok olan rakamlari tek rakama indirirken kullanilir ingilizcede dusurmek demek, yani azalttik
    public static void printSumOfSquaresOfDistinctEvenElements(List<Integer> nums) {

        Integer sum = nums.stream().
                distinct().
                filter(t -> t % 2 == 0).
                 map(t -> t * t).
                reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }// bir degeri yazdirmak icin for each kurulmaz bir container'e koyar oyle yazdiririz.

//8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements

    public static void printProductOfSquareOfDistinctEvenElements(List<Integer> nums) {
        Integer product = nums.stream().
                distinct().
                filter(t -> t % 2 == 0).
                map(t -> t * t).
                reduce(1, (t, u) -> t * u);
        System.out.println(product);
    }

    //9)Create a method to find the "maximum value" from the list elements
    //1.YOL
    //Maximum degeri ararken Integer.MIN_VALUE kullanmak genel pratiktir.
    //Minimum degeri ararken Integer.MAX_VALUE kullanmak genel pratiktir.
    public static void getMaxValue(List<Integer> nums) {
        Integer max = nums.
                stream().
                distinct().
                reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }//2.Yol bu yol daha zorlar Javayi get(0) bulmaya ugrasir.

    public static void getMaxValue2(List<Integer> nums) {
        Integer max1 = nums.stream().
                distinct().
                reduce(nums.get(0), (t, u) -> t > u ? t : u);
        System.out.println(max1);
    }

    //3.Yol
    public static void getMaxValue3(List<Integer> nums) {
        Integer max3 = nums.stream().distinct().sorted().reduce((t, u) -> u).get();
        System.out.println(max3);
    }

    //10)Create a method to find the minimum value from the list elements
    //1.Yol
    public static void getMinValue1(List<Integer> nums) {
        Integer min = nums.stream().
                distinct().
                reduce((t, u) -> t > u ? u : t).get();
        System.out.println(min);
//2.Yol
    }

    public static void getMinValue2(List<Integer> nums) {
        Integer min2 = nums.stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                reduce((t, u) -> u).get();
        System.out.println(min2);
    }//3.Yol

    public static void getMinValue3(List<Integer> nums) {
        Integer min3 = nums.stream().distinct().sorted().reduce((t, u) -> t).get();
        System.out.println(min3);

    }//4.Yol

    public static void getMinValue4(List<Integer> nums) {
        Integer min4 = nums.stream().distinct().
                reduce((t, u) -> Math.min(t, u)).get();
        System.out.println(min4);
    }

    //11)Create a method to find the minimum value which is greater than 7 and even from the list
//   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi
    public static void getMinGreaterThanSevenEven(List<Integer> nums) {

        Integer rakam = nums.stream().filter(t -> t > 7 && t % 2 == 0).sorted().reduce((t, u) -> t).get();
        System.out.println(rakam);
    }

}//class