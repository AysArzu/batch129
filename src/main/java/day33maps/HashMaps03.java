package day33maps;

import java.util.HashMap;

public class HashMaps03 {
    public static void main(String[] args) {

        //Example: Size verilen bir cumlede kullanilan harflerin gorunum sayisini gosteren kodu yaziniz
        //"Java is Java"==>J=2, a=4, v=1, i=1, s=1
        HashMap<String ,Integer> lettersMap =new HashMap<>();
        String sentence="Java is Java.";
       // sentence=sentence.replaceAll("\\p{Punct}","");
        sentence=sentence.replaceAll("[^a-zA-A]","");
        String[] lettersArray=sentence.split("");

        for (String w:lettersArray) {
            Integer numOfOccurance=lettersMap.get(w);
            if(numOfOccurance==null){
                lettersMap.put(w,1);
            }else{
                lettersMap.replace(w,numOfOccurance+1);
            }
        }
        System.out.println(lettersMap);//{a=4, s=1, v=2, i=1}

    }
}
