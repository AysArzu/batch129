package replit;

public class ArraydeMinVeMaxYazma {
    public static void main(String[] args) {
        /*Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

Input : {3,2,5,4,1,6}
Output :
min: 1
max: 6*/
        int[]arr={3,2,5,4,1,6};
        int min=arr[0];
        int max=arr[1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }if(arr[i]>arr[1]){
                max=arr[i];
            }
        }
        System.out.println("min "+ min+ " max "+max);



    }
}
