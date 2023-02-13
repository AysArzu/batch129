package Lambdapractice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class P2 {
    public static void main(String[] args) throws IOException {

        //How to read text from the file
        Files.lines(Paths.get("src/main/java/Lambdapractice/TextFile")).forEach(System.out::println);

//How to convert all characters in the file to upper case
        Files.lines(Paths.get("src/main/java/Lambdapractice/TextFile")).
                map(t -> t.toUpperCase()).
                forEach(System.out::println);

        //How to check if a specific word(Lambda) exists in the text
        boolean result = Files.lines(Paths.get("src/main/java/Lambdapractice/TextFile")).
                map(t -> t.split(" ")).
                flatMap(Arrays::stream).
                anyMatch(t -> t.contains("Lambda"));
        System.out.println(result);

        //Print distinct words on the console in the file
        Files.lines(Paths.get("src/main/java/Lambdapractice/TextFile")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).
                distinct().forEach(t-> System.out.print(t+" "));
        System.out.println();
        System.out.println("**************************************");

        //Get the words which end with "e" and print them on the console
        Files.lines(Paths.get("src/main/java/Lambdapractice/TextFile")).
        map(t->t.split(" ")).
        flatMap(Arrays::stream).filter(t->t.endsWith("e")).forEach(t-> System.out.print(t+ " "));

    }
}





