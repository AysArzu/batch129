package day36lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
/*

            AnyMath: Vereceğimiz şarta bağlı olarak Stream içerisinde gezinir ve
                     herhangi bir elemanla eşleşme durumunda true dönecektir.


            AllMatch: Verilen şarta göre Stream içerisindeki tüm elemanların
                      bu şarta uyması durumunda true dönecektir.


            NoneMatch: Sarta göre Stream içindeki hiç bir
                       elemanın şartı sağlamaması durumunda true dönecektir.
 */

public class Lambda02 {
    public static void main(String[] args) throws IOException {
        //1)LambdaTextFile dosyasi icindeki metni console'a yazdiran kodu yaziniz.
//lines() ==> verdiğiniz adresteki dosyaya gidip ordaki satirlari stream() olarak veriyor
        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).forEach(System.out::println);

        //LambdaTextFile dosyasi icindeki her karakteri uppercase yapiniz
        Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(String::toUpperCase).
                forEach(System.out::println);
        //3)LambdaTextFile dosyasi icinde herhangi bir kelimenin var olup olmadigini gosteren kodu yaziniz
     boolean result=  Files.
                lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).//array i kir dumduz yap der stream gibi alt alta dizer
                 anyMatch(t->t.contains("Java"));// herhangi biri Java ise sonuc true olur
        System.out.println(result);//true

    //4LambdaTextFile dosyasi icindeki her kelimenin "a" icerip icermedigini gosteren kodu yaziniz
        boolean result2=  Files.
                lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).
                flatMap(Arrays::stream).//array i kir dumduz yap der stream gibi alt alta dizer
                       allMatch(t->t.contains("a"));//
        System.out.println(result2);//Her kelime a harfini iceriyorsa sonuc true olur aksi halde false olur. false cikti

//5)LambdaTextFile dosyasi icindeki her kelimenin "x"  icermedigini dosteren dodu yaziniz

        boolean result3=Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).flatMap(Arrays::stream).
                noneMatch(t->t.contains("x"));
        System.out.println(result3);

       //6)LambdaTextFile dosyasi icinde "r" ile biten kelimeleri sayan kodu yaziniz

     long result4= Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).flatMap(Arrays::stream).
                    filter(t->t.endsWith("r")).count();

        System.out.println(result4);
//2. yol tavsiye edilmez
     int result5= Files.lines(Paths.get("src/main/java/day36lambda/LambdaTextFile.txt")).
                map(t->t.split(" ")).flatMap(Arrays::stream).
                filter(t->t.endsWith("r")).collect(Collectors.toList()).size();

        System.out.println(result5);

}}
