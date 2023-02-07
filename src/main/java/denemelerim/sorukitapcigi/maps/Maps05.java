package denemelerim.sorukitapcigi.maps;

import java.util.HashMap;
import java.util.Map;

public class Maps05 {
    /*
     Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
     (Büyük/küçük harfe duyarlı değil)
     */
    public static void main(String[] args) {
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
       s=s.replaceAll("\\p{Punct}","").toLowerCase();
        String[]arr=s.split(" ");
        Map<String ,Integer> wordOfOccurance= new HashMap<>();
     for (String w:arr){
         Integer numOfOccurance=wordOfOccurance.get(w);
         if(numOfOccurance==null){
             wordOfOccurance.put(w,1);
         }else
             wordOfOccurance.put(w,numOfOccurance+1);

     }
        System.out.println(wordOfOccurance);
    }
}
