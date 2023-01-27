package day18List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists02_Interview {
    public static void main(String[] args) {
        //Example : Bir tane Integer List oluşturunuz
        //          Bu List'te en yakın iki tam sayıyı yazınız
        //          [12, 23, 9, 11, 35]==> 12,11

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(9);
        nums.add(11);
        nums.add(35);

        Collections.sort(nums);
        int minDif = nums.get(1) - nums.get(0);
        for (int i = 1; i <nums.size() ; i++) {
            minDif=Math.min(minDif,nums.get(i)-nums.get(i-1));
        }
        System.out.println("" +minDif );
        for (int i = 1; i < nums.size() ; i++) {
            if(nums.get(i)-nums.get(i-1)==minDif){
                System.out.println(nums.get(i-1)+ " and "+ nums.get(i));
            }
        }
    }
}
