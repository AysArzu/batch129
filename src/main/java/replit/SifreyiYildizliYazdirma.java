package replit;

import java.util.Scanner;

public class SifreyiYildizliYazdirma {
    public static void main(String[] args) {
        /* Ask user Name, Surname and credit card numbers than convert it to special form.
         (Initials for name and surname should be uppercase)
        (Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
        Input : John White 1234234534561478
        Output : Name : J*** W****
        CCN  : **** **** **** 1478    */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your surname ");
        String surname=input.nextLine();
        System.out.println("Please enter your credit card numbers");
        String creditCard=input.next();

        String []s=surname.split(" ");
        String name=s[0].substring(0,1).toUpperCase()+s[0].substring(1).replaceAll("[a-zA-z]","*")+" "+
                    s[1].substring(0,1).toUpperCase()+s[1].substring(1).replaceAll("[a-zA-z]","*");
        String card="";
        for (int i = 1; i <creditCard.length()-3 ; i++) {
            if(i%4==0){
                card+="*"+" ";

            }else {
                card+="*";
            }
        }
        System.out.println("Name : " + name+ "\nCCN : "+card+ creditCard.substring(creditCard.length()-4));

    }
}
