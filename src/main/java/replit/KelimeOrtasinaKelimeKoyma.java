package replit;

import java.util.Scanner;

public class KelimeOrtasinaKelimeKoyma {
    /*  Create 2 words : name1 and name2
        if the name1 has even numbers of characters,
        then insert the second word in the middle of the first name
        if the first word has odd numbers
        Then print the “Name2 cannot be inserted in the name1”
        e.g:
        name1= mehmet
        name2= ahmet
        Print ==> mehahmetmet*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first word");
        String name1 = input.nextLine();
        System.out.println("Enter a second word");
        String name2 = input.nextLine();

        if (name1.length() % 2 == 0) {
            String concat = name1.substring(0, name1.length() / 2) + name2 + name1.substring(name1.length() / 2);
            System.out.println(concat);
        } else {
            System.out.println("Name2 cannot be inserted in the name1");
        }
    }


}
