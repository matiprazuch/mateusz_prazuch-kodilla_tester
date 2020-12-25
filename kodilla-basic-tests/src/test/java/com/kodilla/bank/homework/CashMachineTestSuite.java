package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine(5000);

    @Test
    public void shouldHaveZeroLength() {

        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTransaction() {

        cashMachine.addTransaction(400);
        assertEquals(5400, cashMachine.getBalance());
        cashMachine.addTransaction(-200);
        assertEquals(5200, cashMachine.getBalance());
    }

    @Test
    public void shouldNotWithdrawWhenNotEnoughMoney() {
        cashMachine.addTransaction(-6000);
        assertEquals(5000, cashMachine.getBalance());
        cashMachine.addTransaction(500);
        cashMachine.addTransaction(-5550);
        assertEquals(5500, cashMachine.getBalance());
        assertEquals(1, cashMachine.getDepositSize());
    }

    @Test
    public void shouldDoNothingWhenTransactionValueIsZero() {
        cashMachine.addTransaction(0);
        assertEquals(5000, cashMachine.getBalance());
        assertEquals(0, cashMachine.getDepositSize());
    }

    @Test
    public void shouldReturnWithdrawalSum() {
        cashMachine.addTransaction(300);
        cashMachine.addTransaction(-2000);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-10000);
        assertEquals(-12000, cashMachine.getWithdrawalSum());
    }

    @Test
    public void shouldReturnDepositSum() {
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-700);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-10000);
        assertEquals(600, cashMachine.getDepositSum());
    }

    @Test
    public void shouldReturnWithdrawalSize() {
        cashMachine.addTransaction(400);
        cashMachine.addTransaction(-200);
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(100);
        cashMachine.addTransaction(-10000);
        cashMachine.addTransaction(-20000);
        assertEquals(2, cashMachine.getWithdrawalSize());
    }

    @Test
    public void shouldReturnDepositSize() {
        cashMachine.addTransaction(-300);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-400);
        assertEquals(1, cashMachine.getDepositSize());
    }

    @Test
    public void shouldReturnBalance() {
        cashMachine.addTransaction(4000);
        cashMachine.addTransaction(-2000);
        cashMachine.addTransaction(3000);
        cashMachine.addTransaction(-1000);
        assertEquals(9000, cashMachine.getBalance());
    }

    @Test
    public void shouldNotMixDepositsWithWithdrawalsSizes() {
        cashMachine.addTransaction(4000);
        cashMachine.addTransaction(-1000);
        cashMachine.addTransaction(-2000);
        cashMachine.addTransaction(3000);
        cashMachine.addTransaction(-2000);
        assertEquals(2,cashMachine.getDepositSize());
        assertEquals(3, cashMachine.getWithdrawalSize());
    }

    @Test
    public void shouldNotMixDepositSumWithWithdrawalSum() {
        cashMachine.addTransaction(4000);
        cashMachine.addTransaction(-2000);
        cashMachine.addTransaction(3000);
        cashMachine.addTransaction(-1000);
        assertEquals(7000, cashMachine.getDepositSum());
        assertEquals(-3000, cashMachine.getWithdrawalSum());
    }
}
