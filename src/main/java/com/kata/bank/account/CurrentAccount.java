package com.kata.bank.account;

public class CurrentAccount implements BankAccount {

    int balance = 0;

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void credit(int money) {
        if (money > 0) {
            balance += money;
        }
    }
}
