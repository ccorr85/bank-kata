package com.kata.bank;

import com.kata.bank.account.BankAccount;
import com.kata.bank.account.CurrentAccount;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CurrentAccountTest {

    private BankAccount currentAccount;

    @Before
    public void setup() {
        currentAccount = new CurrentAccount();
    }

    @Test
    public void test_positiveCreditAccountIncreasesBalance() {
        currentAccount.credit(10);

        int balance = currentAccount.getBalance();
        assertEquals("The account balance should be 10", balance, 10);
    }

    @Test
    public void test_zeroCreditAccountDoesNotIncreaseBalance() {
        currentAccount.credit(0);
        int balance = currentAccount.getBalance();
        assertEquals("The account balance should be 0", balance, 0);
    }

    @Test
    public void test_negativeCreditAccountDoesNotDecreaseBalance() {
        currentAccount.credit(-10);
        int balance = currentAccount.getBalance();
        assertEquals("The account balance should be 0", balance, 0);
    }
}
