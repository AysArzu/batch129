package day15arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 1:öğretmenin öğrenci listesini sisteme kaydetme programı
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç öğrenci ismi gireceksiniz");
        System.out.println("Girişi sonlandırmak için Q tuşuna basınız.");
        int numOfElements = input.nextInt();
        String[] stdNames = new String[numOfElements];
        for (int i = 1; i <= numOfElements; i++) {
            System.out.println("Lütfen " + i + ". öğrencinin adını giriniz");

            String stdName = input.next();
            if (stdName.equalsIgnoreCase("q")) {
                break;
            }
            stdNames[i - 1] = stdName;
        }
        System.out.println(Arrays.toString(stdNames));
    }
}
