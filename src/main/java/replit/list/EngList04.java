package replit.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EngList04 {
    /*
    Write a program that deletes the letters 'a' from the names in the list given as input.
         INPUT :
         list1={"Ali","Veli","Ayse","Fatma","Omer"}
         OUTPUT :
         [Veli,Omer]
     */
    public static void main(String[] args) {
        String[] list1 = {"Ali", "Veli", "Ayse", "Fatma", "Omer"};
        List<String> list= new ArrayList<>(Arrays.asList(list1));
        for (String w:list1) {
            if(w.contains("a")||w.contains("A")){
                list.remove(w);
            }
        }
        System.out.println(list);
    }
}
