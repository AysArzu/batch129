package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    private int accountNumber;

    private int pinNumber;
    //This shows the checking amount(account money)
    private double checkingBalance;

    //This shows the saving amount (account money
    private double savingBalance;

    Scanner input = new Scanner(System.in);

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    //***************************************************************

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }//Calculate the checking balance after the withdraw


    public double calculateCheckingBalanceAfterWithdraw(double amount) {
        //1000
        checkingBalance = checkingBalance - amount;

        return checkingBalance;
    }

    //calculate the checking balance after deposit
    public double calculateCheckingBalanceAfterDeposit(double amount) {

        checkingBalance = checkingBalance + amount;
        return checkingBalance;
    }

    //Calculate the saving balance after withdraw
    public double calculateSavingBalanceAfterwithdraw(double amount) {
        savingBalance = savingBalance - amount;
        return savingBalance;
    }

    public double calculateSavingBalanceAfterDeposit(double amonunt) {
        savingBalance = savingBalance - amonunt;
        return savingBalance;
    }

    //Interact with customer to withdraw money from checking
    public void getCheckingWithdraw() {
        System.out.println("your checing balance is : " + moneyFormat.format(checkingBalance));
        System.out.println("Enter the amount you would like to withdraw");
        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println(" Negative or zero is zero amount is not acceptable");
            getCheckingWithdraw();
        } else if (checkingBalance >= amount) {
            calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println("Your checking balance is  = " + moneyFormat.format(checkingBalance));
        } else {
            System.out.println("you do not have enough money on your account!");

        }
    }//Interact woth customer to deposite money to checking account

    public void getCheckingDeposit() {

        System.out.println("your checking balance is : " + moneyFormat.format(checkingBalance));
        System.out.println("enter the amount you would like to deposit!");

        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println(" Negative  or zero is zero amount is not acceptable");
            getCheckingWithdraw();
        } else {
            calculateCheckingBalanceAfterDeposit(amount);

            System.out.println("Your checking balance is  = " + moneyFormat.format(checkingBalance));
        }
    }      //Interact with customer to withdraw money from saving account

    public void getSavingWithdraw() {
        System.out.println("Your saving balance is : " + moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would lide to wothdraw!");

        double amount = input.nextDouble();

        if (amount <= 0) {
            System.out.println("Negative  or zero is zero amount is not acceptable");
            getSavingWithdraw();
        } else if (savingBalance >= amount) {
            calculateSavingBalanceAfterwithdraw(amount);
            System.out.println("Your saving balance is : " + moneyFormat.format(savingBalance));
        }


    }//Interact woth customer to deposite money to their saving account

    public void getSavingDeposit() {

        //before transaction we show user their current balance for saving account
        System.out.println("your saving bvalance is : " + moneyFormat.format(savingBalance));
        System.out.println("Enter the amount you would like to deposite!");
        double amount = input.nextDouble();


        if (amount <= 0) {
            System.out.println("Negative  or zero is zero amount is not acceptable");
            getSavingDeposit();
        } else {
            calculateSavingBalanceAfterDeposit(amount);
            System.out.println("your saving bvalance is : " + moneyFormat.format(savingBalance));
        }
    }
}