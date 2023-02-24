package mini_projects;

import java.util.Scanner;

public class Dummy {
    public static void main(String[] args) {

        System.out.println("deriz");
        int ans;
        try{
            int num=10;
            int div=0;
            ans=num/div;
        }catch (ArithmeticException ae){
            ans=0;
        }catch (Exception e){
            System.out.println("invalid");
        }
        //System.out.println("answer =" + ans);





    }
}
