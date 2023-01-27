package replit;

import java.util.*;

public class VucutKitleEndexi {
    public static void main(String[] args) {
   /*   Ask user to their weight and height and type a program with calculates mass index
* HINT : Body Mass Index = Weight (kg) / Square of height (m)
Then give a message to user as following:
If BMI is less than 18.5 , you are weak
If BMI is between 18.5 and 25 , your weight is ideal
If BMI is between 25 and 30, you are fat
If BMI is more than or equal to 30, obese
EXAMPLE : INPUT:
Weight : 71
Height : 1.72
OUTPUT : Your BMI is  : 23.99945916711736
          Your weight is ideal

*/
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your weight?");
        double weight = scan.nextDouble();
        System.out.println("What is your height?");
        double height = scan.nextDouble();
        double BMI = weight / (height * height);
        System.out.println(BMI);
        if (BMI>=30) {
            System.out.println("obese");
        } else if (BMI> 25) {
            System.out.println("you are fat");
        } else if (BMI>18.5) {
            System.out.println("your weight is ideal");
        } else {
            System.out.println(" you are weak");
        }
    }
}