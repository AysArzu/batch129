package day18List;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {
        //Example: Bir Integer Listte 7 hariç tüm elemanların değerlerini 3 arttırınız.

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(11);

        //1.YOL:
        for (Integer w : nums) {
            if (w == 7) {
                continue;
            }
            nums.set(nums.indexOf(w), w + 3);
        }
        System.out.println(nums);//[15, 16, 7, 14, 15]

       // 2.YOL:
        for (int i = 0; i <nums.size() ; i++) {
            int element=nums.get(i);
            if(element==7){
                continue;
            }nums.set(i,  element+3);
        }
        System.out.println(nums);//[18, 19, 7, 17]

        /*
        nums.indexof(w) ilk görünümün indexini verir. List tekrarlı elemana sahip ise
         nums.indexof(w) kullanımı risk oluşturabilir. Bu yüzden bu soruda en güvenli yol "for-loop"tur.
         */
    }
}
