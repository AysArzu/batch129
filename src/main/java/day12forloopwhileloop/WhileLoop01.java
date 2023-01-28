package day12forloopwhileloop;

public class WhileLoop01 {
    public static void main(String[] args) {
        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz

        //1.Yol: for-loop
        for(int i=3; i<7; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //2.Yol: while-loop
        int i=3;

        while(i<7){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz
        int k = 23;

        while(k>11){
            if(k%2==0){
                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();

        //Example 3: Verilen bir tamsayinin rakamlari toplamini console'a yazdiran kodu yaziniz
        int num = -578;

        num = Math.abs(num);
        int sum = 0;

        while(num>0){
            sum = sum + num%10;
            num/=10;
        }
        System.out.println(sum);
    }
    }

