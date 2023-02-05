package replit.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EngList02 {
    /*
            Create a 10-element list. Swap the 8th element with the 3rd element.
            INPUT :
            String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
            Output:
            [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali]
     */
    public static void main(String[] args) {
        //1.yol:
       /* List <String>names= new ArrayList<>(Arrays.asList("Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));
        System.out.println(names);
        Collections.swap(names,2,7);
        System.out.println(names);*/

        //2.yol
        String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
       String temp= names[2];
       names[2]=names[7];
       names[7]=temp;


        List <String>namesList= new ArrayList<>(Arrays.asList(names));
        System.out.println(namesList);

    }
}
