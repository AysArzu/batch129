package day28exceptions;

public class C05_Exceptions {
    public static void main(String[] args) {
        /*
        5)AritmetikExceptions
         */
        //
       divide2(6, 0);
        divide2(0, 6);
      //  divide(6, 2);//3
      //  divide(0, 6);//0
      //  divide(6, 0);//ArithmeticException
      //  divide(5, 0);
    }

    private static void divide2(int a, int b) {
        try {
            System.out.println(a / b);
            System.out.println("try kısmı çalıştı");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Bir sayı sıfıra bölünemez " + e.getMessage());
            System.out.println(e);
            System.out.println("bura");
        }
    }

    private static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Bir sayı sıfır ile bölünemez");
        } else {
            System.out.println(a / b);

        }


    }
}