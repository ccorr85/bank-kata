package com.kata.bank.account;

public interface BankAccount {

    /**
     * Returns the current balance of the account
     * @return int that represents the balance of the account
     */
    public double getBalance();

    /**
     * Credits the bank account. Any valid integer that is passed in is added to the account's balance
     * @param money - money to be added to the account's balance
     */
    double credit(double money);
}
