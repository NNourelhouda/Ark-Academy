package org.arkAcademy.week2.Day7.Ch2;

import java.util.List;
public class CheckingAccount extends BankAccount{
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void displayAccountDetails() {
        System.out.println("Checking Account Balance: $" + balance);
    }
}
