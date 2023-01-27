package day21overloadingstatic;

import java.util.List;

public class C03_StaticDepo {

    static String okulIsmi = "Emre Okullari";// static variable
    String ogrenciGul = "Gül Geçer";// instance variable
    String name = "Tom Hanks";

    public static void staticMethod() {
        System.out.println("Ben static methodum ");
    }

    public void staticOlmayanMethod() {
        System.out.println("Ben static olmayan  methodum ");
        // Ogrenci isminin ilk harflerini veren methodu oluşturunuz
    }

    public static String getInitials(String name) {

        String first = name.substring(0, 1);
        String second = name.split(" ")[1].substring(0, 1);

        return first + second;
    }//  öğrenci ismindeki sesli harfleri (a,e,i,o,u) sayan method

    public int countVowels(String name) {
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(0);
            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }

        return counter;




    }

}