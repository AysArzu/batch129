package mentoring;

import java.util.Scanner;

public class proje1 {
     /*
The program starts by prompting the user to select which type of coffee they would like (Turkish, Filter or Espresso).
Then it uses an if-else statement to check the user's input and respond accordingly.
The program then asks the user if they would like milk or sugar in their coffee and uses the input to add those ingredients accordingly.
The program also asks the user what size the coffee should be,
and uses another if-else statement to check the user's input and prepare the coffee in the selected size.
Finally, the program prints a message to inform the user that their coffee is ready.
 */

    static Scanner sc = new Scanner(System.in);
    static String whichCoffee;
    static String size;

    public static void main(String[] args) {

        prepareCoffee();
        addMilk();
        addSugar();
        choiceSize();

        System.out.println(whichCoffee + " is " + size + " ready. Enjoy your meal !!!");
    }

    public static void prepareCoffee() {
        System.out.println("Which Coffee would you like? 1. Turkish Coffee 2. Filter Coffee 3. Espresso:");
        whichCoffee = sc.nextLine();
        whichCoffee = whichCoffee.toLowerCase(); // make the input case-insensitive

        if (whichCoffee.equals("turkish coffee")) {
            System.out.println("Turkish coffee is being prepared.");
        } else if (whichCoffee.equals("filter coffee")) {
            System.out.println("Filter coffee is being prepared.");
        } else if (whichCoffee.equals("espresso")) {
            System.out.println("Preparing Espresso...");
        } else {
            System.out.println("You have entered the wrong key.");
            prepareCoffee();
        }
    }

    public static void addMilk() {

        // Create string to store milk choice
        String milk;
        System.out.print("Would you like milk? (Answer yes or no): ");
        milk = sc.nextLine();
        // Condition to check for milk choice
        if (milk.equalsIgnoreCase("yes")) {
            System.out.println("Adding milk...");
        } else if (milk.equalsIgnoreCase("no")) {
            System.out.println("No milk added.");
        } else {
            System.out.println("You have entered the wrong key.");
            addMilk();
        }
    }

    public static void addSugar() {
        // Create string to store sugar choice
        String sugar;
        System.out.print("Would you like sugar? (Answer yes or no): ");
        sugar = sc.nextLine();

        // Condition to check for sugar choice
        if (sugar.equalsIgnoreCase("yes")) {
            System.out.print("How many sugars? ");
            int howManySugar = sc.nextInt();

            System.out.println("Adding " + howManySugar + " sugars.");
            String blankCode = sc.nextLine();
        } else if (sugar.equalsIgnoreCase("no")) {
            System.out.println("No sugar added.");
        } else {
            System.out.println("You have entered the wrong key.");
            addSugar();
        }
    }

    public static void choiceSize() {
        // Create string to store size choice

        System.out.print("What size should it be? (Enter large size - medium size - small size.) : ");
        size = sc.nextLine().toLowerCase();

        // Condition to check for size choice
        if (size.equals("large size")) {
            System.out.println("Your coffee is preparing in large size.");
        } else if (size.equals("medium size")) {
            System.out.println("Your coffee is being prepared in medium size.");
        } else if (size.equals("small size")) {
            System.out.println("Your coffee is being prepared in small size.");
        } else {
            System.out.println("You have entered the wrong key.");
            choiceSize();
        }
    }
}