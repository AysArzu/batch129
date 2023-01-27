package day16multidimansionalarray;

public class Star {
    public static void main(String[] args) {
         /*
         Aşağıdaki şekli çizdiren kodu yazınız.

                           *
                          * *
                         *   *
                        *     *
                       * * * * *
          */
        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int k = row-1; k >=i; k--) {
                System.out.print(" ");
            }
            for (int m = 1; m < 2 * i; m++) {
                if (i == row || m == 1 || m == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
