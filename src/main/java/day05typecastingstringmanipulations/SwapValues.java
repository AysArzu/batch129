package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap: Yer degistirmek. 1.kap:Patates 2.kap:Domates ==> Swap ==> 1.kap:Domates 2.kap:Patates

    public static void main(String[] args) {

        //1.Yol:
        int a = 12;
        int b = 5; // Swap'den sonra ==> a=5 ve b=12
        int temp = 0;

        System.out.println( "a: " + a);//12
        System.out.println( "b: " + b);//5

        //I.Adim
        temp = a;

        //II.Adim
        a = b;

        //III.Adim
        b = temp;

        System.out.println( "a: " + a);//5
        System.out.println( "b: " + b);//12

        //2.Yol:
        int x = 12;
        int y = 5;

        x = x + y;
        y = x - y;
        x = x - y;

    }
}
