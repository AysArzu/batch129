package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lists02 {
    public static void main(String[] args) {
        /*Rastgele kullanıcı adı oluşturan JAVA kodu yazınız
        1. Kullanıcıdan ismini isteyin
        2. Kullanıcı adındaki baştaki ve sondaki boşlukları silelim
        3. Kullanıcı adının alınabilir olup olmadığına bakalım
        4.Eğer bizim listemizde öyle bir kullanıcı adı yoksa adı, kullanıcının girdiği isim olsun
        5.Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim ve gösterelim.
         */
        List<String > database=new ArrayList<>();
        database.add("AYSE");
        database.add("AHMET");
        database.add("SERDAR");
        database.add("OKAN");
        database.add("BETUL");

        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen kullanıcı isminizi giriniz");
        String userName=input.nextLine().trim().toUpperCase();

        //1.Yol:Random tam sayı bulmak için
        //int random= (int)(Math.random()*100);

        int random=new Random().nextInt(100);

        while (database.contains(userName+random)){
            random=(int)(Math.random()*100);
        }
        if(database.contains(userName) ){
            System.out.println("Bu username database'de var, tekrar kullanılamaz");
            database.add(userName+random);

        }else{
            System.out.println("BU username kullanılabilir");
            database.add(userName);

        }
        System.out.println(database);


    }
}
