package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda001 {
    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);
        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");

        List<Double> half = getHalfOfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println(half);//[19.2, 13.4, 6.0, 3.5]
        prinAllAlphabeticallyUpperDistinct(list);//AJDA ANGELINA CUNEYT BRAD TOM
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);
        System.out.println();
        printAllSortWithLastChar1(list);
        System.out.println();
        printAllSortWithLastChar2(list);
        System.out.println();

        printAllSortWithLengthUpperDistinctSameLengthInAlphabeticalOrder(list);
        System.out.println();
        // System.out.println(removeElementIfTheLengthGreaterThanFive(list));
        System.out.println();
        System.out.println(removeElementIfStartWithAorEndsWithd(list));
        System.out.println();
        System.out.println(printLengthSquare(list));
        System.out.println(printElementsLengthEven(list));
    }
    //Example 1: Create a method to find the half of the elements greater than 5, distinct, in reverse order, in a list.

    public static List<Double> getHalfOfElementsGraterThanFiveDistinctReversed(List<Double> myList) {
        return myList.stream().distinct().filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//(t -> t > 5) lambda expression olarak adlandirilir.

    }// Tum list elemanlarini buyuk harfle alfabetik sirada tekrarsiz olarak yazdiriniz

    public static void prinAllAlphabeticallyUpperDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toUpperCase()).sorted().forEach(t -> System.out.print(t + " "));
        //AJDA ANGELINA BRAD CUNEYT JOHN TOM
    }

    // Tum list elemanlarini kucuk harfle alfabetik siranin tersinde ve tekrarsiz olarak yazdiriniz
    public static void printAllAlphabeticallyLowerDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
        //tom john cuneyt brad angelina ajda
    }//4)Tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada ve tekrarsiz olarak yazdiriniz

    public static void printAllSortWithLengthUpperDistinct(List<String> list) {
        list.stream().distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));//TOM JOHN AJDA BRAD CUNEYT ANGELINA

    }//5)Tum list elemanlarini buyuk harfle son harflerine gore artan sirada ve tekrarsiz olarak yazdiriniz

    public static void printAllSortWithLastChar1(List<String> list) {

        list.stream().
                distinct().
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                map(t -> t.toUpperCase()).
                forEach(t -> System.out.print(t + " "));//AJDA ANGELINA BRAD TOM JOHN CUNEYT
    }
    public static void printAllSortWithLastChar2(List<String> list) {

        list.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).
                        reversed()).
                        forEach(Utils::printInTheSameLineWithSpace); //CUNEYT  JOHN  TOM  BRAD  AJDA  *ANGELINA
    }//6)Tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada ve tekrarsiz olarak yazdiriniz
    //Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void printAllSortWithLengthUpperDistinctSameLengthInAlphabeticalOrder(List<String> list) {
        list.stream().
                distinct().
                map(String::toUpperCase).//bu yapiya "method reference" denir.
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);

    }//7)Karakter sayisi 5 ten fazla olan elemanlari siliniz.
    //   public static List<String> removeElementIfTheLengthGreaterThanFive(List<String> list){

    //    list.removeIf(t->t.length()>5);// stream kullanmadik
    // return list;}//[Tom, John, Ajda, Tom, Brad]

    //"A" ile baslayan veya "d" ile biten elemanlari siliniz
    public static List<String> removeElementIfStartWithAorEndsWithd(List<String> list) {
        list.removeIf(t -> t.startsWith("A") || t.endsWith("d"));
        //Bazen stream()"methodu bize lazim olan methodlara ulasmamiza engel olur bu yuzden stream methodunu kullanmayiz
        //removeif() methodunda oldugu gibi

        //Fakar stream() methodunu daha sonradan kullanmamiz gerekebilir. Bu durumda stream() methodunu kullanarak
        // istedigimiz methodlara ulasiriz, distinct() methoduna ulastigimiz gibi.
        //Sonuc bize list olarak lazimsa "collect(Collectors.toList())" ile sonucu List"e ceviririz.


        return list.stream().distinct().collect(Collectors.toList());//[Tom, John,  Cuneyt]
    }//LIsr elemanlarinin karakter sayilarinin karelerini aliniz ve bir list  olarak ekrana yazdiriniz
    public static List<Integer>printLengthSquare(List<String>list){
        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());//[9, 16, 9, 36]
//kendi methoduumuzu Utils classinda olusturduk.

    }
    //List elemanlarindan character sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> printElementsLengthEven(List<String>list){

      return   list.stream().filter(Utils::isEven).collect(Collectors.toList());
    }


}