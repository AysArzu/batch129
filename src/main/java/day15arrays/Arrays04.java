package day15arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //Example: Bir Arrrayin içinde herhangi bir elemanın olup olmadığını
        //kontrol edenve kaç kere tekrarlandığını gösteren kodu yazınız.
        int[] a = {0, 2, 3, 0, 12, 0};

        int num= 0;
        int counter=0;
        for (int w:a) {
            if(w==num){
                counter++;
            }
        }if(counter>0){
            System.out.println(num + " arrayde "+counter+" defa var");
        }else System.out.println(num+ "arrayda yoktur");
    }
}
