package org.arkAcademy.week2.Day7.Ch2;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(double initialBalance) {

        super(initialBalance);
    }
    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account Balance: $" + balance);
    }
}
