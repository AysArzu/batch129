package replit.conditionalstatement;

public class Soru09Elmas {
    /*
    Aşağıdaki elmas deseni görüntüsünü çizen java kodunu yazınız.
    Test Data:

    Yarım elmas uzunluğu : 7
    Beklenen Çıktı:

      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
```
     */
    public static void main(String[] args) {


        for (int i = 1; i < 7; i++) {
            for (int j = i; j < 7; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k < i * 2; k++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 7; i >0; i--) {
            for (int j = i; j <7; j++) {
                System.out.print(" ");
            }
            for (int j =1; j <2*i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
