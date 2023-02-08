package day29exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class  C04_Exceptions {
    public static void main(String[] args) {
/*
   8) InputMisMatchExceptions

*/ //Verilen bir arrayden kullanıcıdan index isteyin verilen indexteki datayı yazdırın.

        int []arr={2,3,5,7,9,45};
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen index için sayı giriniz.");
        //
        int idx= 0;
        try {
            idx = input.nextInt();
            System.out.println("Girilen indexteki eleman : "+arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiğiniz indexteki eleman arrayde yok "+e.getMessage());
            e.printStackTrace();
        }catch (InputMismatchException e){
            System.out.println("Girdiğiniz index sayı olmalı InputMismatchException "+e.getMessage());
            e.printStackTrace();
        }

        System.out.println("Durmak yok yola devam.");

    }
}
