package com.company.oop_constructor;

public class Main {
    public static void main(String[] args) {
        BankAccount myBankAccount = new BankAccount();
        myBankAccount.deposit(100);
        myBankAccount.withdrawFunds(100.5);
        myBankAccount.withdrawFunds(100);
    }
}
