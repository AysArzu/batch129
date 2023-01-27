package day15arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Exampl:e Bir Stringteki sesli harflerin sayısını bulan kodu yazınız
        //a - e - i - o - u - A - E - I - O -U
        //1. Yol : replaceAll()
        String s="Java insani mutlu eder";
        int vowels=s.replaceAll("[^aeiouAEIOU]","").length();
        System.out.println(vowels); //9

        //2. Yol:Array - Loop
        String [] letters=s.toLowerCase().split("");
        int counter=0;
        for (String w:letters) {
            switch (w){
                case "a": case "e": case "i":case "o": case"u":
                    counter++;
            }
        }
        System.out.println(counter);
    }
}
