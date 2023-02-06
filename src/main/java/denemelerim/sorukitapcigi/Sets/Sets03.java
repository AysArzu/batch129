package denemelerim.sorukitapcigi.Sets;

import java.util.*;

public class Sets03 {
    /*
          Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.
          Örnek: ‘Mississippi’ ´ Misp
     */
    public static void main(String[] args) {
        String s = "Mississippi";
        String[]arr= s.split("");
       /** Set<String >mySet= new HashSet<>(List.of(arr));
        System.out.println(mySet);
        Bu daoldu ama kitapta su sekilde cozulmus
        */
List<String >characters= new ArrayList<>(Arrays.asList(arr));
Set<String>mySet= new HashSet<>(characters);
        System.out.println(mySet);

    }
}
