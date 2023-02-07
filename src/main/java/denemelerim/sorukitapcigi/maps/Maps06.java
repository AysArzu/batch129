package denemelerim.sorukitapcigi.maps;

import java.util.*;

public class Maps06 {
    /*
//    Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
     */
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer ,Integer>myMap = new HashMap<>();

        for (Integer w:myList  ) {
            Integer numOfOccurence=myMap.get(w);
            if(numOfOccurence==null){
                myMap.put(w,1);

            }else {
                myMap.put(w,numOfOccurence+1);
            }
        }
        System.out.println(myMap);//{35=1, 21=2, 12=3, 13=1}

        Collection<Integer> myValues= myMap.values();
        Integer counter=0;
        for(Integer w:myValues){
            if(w>1){
                counter++;
            }
        }System.out.println("Tekrarlanan oge sayisi " + counter + " adettir");
    }
}
