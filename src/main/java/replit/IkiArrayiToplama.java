package replit;

import java.util.Arrays;

public class IkiArrayiToplama {
    public static void main(String[] args) {
        /*Write a return method that accepts 2 integer Arrays as parameters
        And adds 2 array into a new Array and prints it.
        Input1={1,2,3,4}
        Input2={5,6}
        Output={1,2,3,4,5,6}*/
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6};
        int newArrayLength = arr1.length + arr2.length;
        int[] newArray = new int[newArrayLength];
        int idx=0;
        for (int i = 0; i < arr1.length; i++) {
            newArray[idx]+=arr1[i];
            idx++;
        }
        for (int i = 0; i < arr2.length; i++) {
            newArray [idx]+=arr2[i];
            idx++;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
