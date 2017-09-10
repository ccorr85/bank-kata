package com.kata.bank.account;

public class CurrentAccount implements BankAccount {

    double balance = 0;

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double credit(double money) {
        if (money > 0) {
            balance += money;
        }
        return balance;
    }
}
