package org.arkAcademy.week2.Day7.Ch2;
public class Main {
    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1000.0);
        checkingAccount.deposit(100);
        checkingAccount.withdraw(200);
        checkingAccount.displayAccountDetails();

        SavingsAccount savingsAccount = new SavingsAccount(1000.0);
        savingsAccount.deposit(200);
        savingsAccount.withdraw(50);
        savingsAccount.displayAccountDetails();

    }
}



