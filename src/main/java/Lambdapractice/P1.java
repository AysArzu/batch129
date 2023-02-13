package Lambdapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P1 {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();
        myList.add("Ayse");
        myList.add("Arzu");
        myList.add("Azra");
        myList.add("Ebubekir");
        myList.add("Fatih");

     toUpper(myList);

    }public static void toUpper( List<String> myList){
         System.out.println(myList.stream().
                filter(t->t.startsWith("A")&&t.length()<5).
                map(String::toUpperCase).
                collect(Collectors.toList()));

    }
}