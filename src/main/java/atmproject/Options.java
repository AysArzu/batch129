package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Options extends Account {
    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    boolean flag=true;

    public void getAccountTypes(){
        System.out.println("Select the account you want to access!");
        System.out.println("1: Checking Account" +
                "\n2: Saving Account" +
                "\n3: Quit");

        int option=input.nextInt();
        switch (option){
            case 1:
                System.out.println("You are in checking account");
                checkingOperations();
                break;
            case 2:
                System.out.println("You are in saving account");
                savingOperations();
                break;
            case 3:
                flag=false;
                break; default:
                System.out.println("Invalid choise please select 1, 2 or 3");
                getAccountTypes();
        }
    }














    public void checkingOperations() {

        do {
            optionMessages();
            int option = input.nextInt();
            if (option == 4) {
                break;
            }
            switch (option) {

                case 1:
                    System.out.println("yourchecking balance is : " + moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Invalid option, please select 1, 2, 3, 4");
            }


        } while (true);


    }public void savingOperations() {

        do {
            optionMessages();
            int option = input.nextInt();
            if (option == 4) {
                break;
            }
            switch (option) {

                case 1:
                    System.out.println("your saving balance is : " + moneyFormat.format(getSavingBalance()));
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("Invalid option, please select 1, 2, 3, 4");


            }


        }
        while (true);

    }public void optionMessages(){

        System.out.println("Select Options: ");
        System.out.println("1:View the balance\n2:Withdraw\3:Deposit\n4:Exit");

    }
}
