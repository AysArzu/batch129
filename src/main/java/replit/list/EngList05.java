package replit.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EngList05 {
    /*
        Write a program that accepts an integer as input and prints
        first 10 prime numbers greater than input
        Check numbers if they are even or not in a return method.
        Input : 5
        Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */

    public static List<Integer> getPrimes(int input) {
        List<Integer> primes = new ArrayList<>();
        int num = input + 1;
        while (primes.size() < 10) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int input = 5;
        System.out.println(getPrimes(input));
    }
}
