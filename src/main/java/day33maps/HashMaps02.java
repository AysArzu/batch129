package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {
    public static void main(String[] args) {

       //Example 1: Size verilen bir cumledeki her bir kelimenin kacar kere kullanildigini gosteren kodu yaziniz.
       // "Java is easy. Java is OOP. OOP makes Java easy."

        HashMap<String,Integer> wordsMap = new HashMap<>();

        String sentence ="Java is easy. Java is OOP. OOP makes Java easy.";
        sentence=sentence.replaceAll("\\p{Punct}","");//once atama yapmak zorundasin
        System.out.println(sentence);//Java is easy Java is OOP OOP makes Java easy
       String []wordsArray=sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));

        for (String w : wordsArray) {
         Integer numOfOccurence=   wordsMap.get(w);
         if(numOfOccurence==null){
             wordsMap.put(w,1); }
             else{
                 wordsMap.replace(w,numOfOccurence+1);//put ta olur ama replace daha dogru

         }
        }
        System.out.println(wordsMap);//{Java=3, OOP=2, makes=1, is=2, easy=2}


    }
}
