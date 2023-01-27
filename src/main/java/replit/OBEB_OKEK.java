package replit;

import advancepractice.practice08.Matematik;
import advancepractice.practice7.Matrix;

import java.math.MathContext;
import java.util.Scanner;

public class OBEB_OKEK {/*
Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
Input : 30 and 40
Expected OutPut: GCD for 30 and 40 = 10
	             LCM for 30 and 40 = 120*/

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter two number");
        int x=input.nextInt();
        int y=input.nextInt();
        int a = x, b = y;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }System.out.println(a);
        System.out.println(b);
        int gcd = a;
        int lcm = (x * y) / gcd;
        System.out.println("GCD for " + x + " and " + y + " = " + gcd);
        System.out.println("LCM for " + x + " and " + y + " = " + lcm);



    }}

