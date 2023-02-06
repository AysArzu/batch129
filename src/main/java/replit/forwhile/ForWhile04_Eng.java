package replit.forwhile;

public class ForWhile04_Eng {
    /*
    Write a return method that accepts an integer as input and calculates factorial and prints like output.

    Input : 6


     */
    public static void main(String[] args) {
        factorial_print(6);
    }
    public static void factorial_print(int n) {
        int result = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(n).append("!=");
        for (int i = n; i > 0; i--) {
            result *= i;
            sb.append(i).append("*");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("=").append(result);
        System.out.println(sb.toString());//Output: 6!=6*5*4*3*2*1=720
    }
}