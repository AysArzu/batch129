package Lambdapractice;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;

public class P3 {
    public static void main(String[] args) {
        //Arrays cannot be used in Lambda directly but after converting list you can use it
        int[] arr = {3, 5, 8, 3, 7};
        List<int[]>myList=Arrays.asList(arr);
        myList.stream().forEach(t-> System.out.println(Arrays.toString(t)));


        //How to print integers from 3 to 10 on the console
        IntStream.rangeClosed(3,10).forEach(t-> System.out.print(t+" "));
        System.out.println();

        //How to find sum of the integers from 3 to 10
        System.out.println(IntStream.rangeClosed(3, 10).sum());//52

        //How to find 9 factorial
        System.out.println(IntStream.rangeClosed(1, 9).
                reduce(1, Math::multiplyExact));//362880


        //How to find the sum of odd integers from 6 to 100
        System.out.println(IntStream.rangeClosed(6, 100).
                filter(t -> t % 2 != 0).sum());//2491

        //How to find the multiplication of first 5 even counting numbers

        System.out.println(IntStream.rangeClosed(1, 11).
                filter(t -> t % 2 == 0).
                reduce(1, Math::multiplyExact));//3840

          int result=  IntStream.iterate(2,t->t+2).
                  limit(5).
                  reduce(1,Math::multiplyExact);
        System.out.println(result);//3840


        //How to find the multiplication of 6 odd integers greater than 4
        System.out.println(IntStream.iterate(5, t -> t + 2).
                limit(6).
                reduce(1, Math::multiplyExact));//675675


    }
}
