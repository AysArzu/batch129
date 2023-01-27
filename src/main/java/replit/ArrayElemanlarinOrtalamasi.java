package replit;

public class ArrayElemanlarinOrtalamasi {
    public static void main(String[] args) {
        /*
        Write a java program that calculates the average value of array elements
           input[]= {1,2,3,4,5,6,7}
            Output : 4
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0;

        for (int i : arr) {
            sum += i;

        }
        int average = sum / arr.length;
        System.out.println(average);
    }
}
