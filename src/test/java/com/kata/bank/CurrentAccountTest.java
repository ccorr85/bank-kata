package com.kata.bank;

import com.kata.bank.account.BankAccount;
import com.kata.bank.account.CurrentAccount;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CurrentAccountTest {

    private BankAccount currentAccount;
    private double balance;

    @Before
    public void setup() {
        currentAccount = new CurrentAccount();
    }

    @Test
    public void test_positiveCreditAccountIncreasesBalance() {
        balance = currentAccount.credit(10.0);
        assertEquals("The account balance should be 10", 10.0, balance);
    }

    @Test
    public void test_zeroCreditAccountDoesNotIncreaseBalance() {
        balance = currentAccount.credit(0.00);
        assertEquals("The account balance should be 0", 0.0, balance);
    }

    @Test
    public void test_negativeCreditAccountDoesNotDecreaseBalance() {
        balance = currentAccount.credit(-10);
        assertEquals("The account balance should be 0", 0.0, balance);
    }

    @Test
    public void test_doubleAmountCredit_AccountBalanceIncreased() {
        balance = currentAccount.credit(10.50);
        assertEquals("The account balance should be 10.50", balance, 10.50);
    }
}
