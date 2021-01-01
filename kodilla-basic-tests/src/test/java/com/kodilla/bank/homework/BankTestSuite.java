package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    Bank theBank = new Bank();

    CashMachine machine1 = new CashMachine(5000);
    CashMachine machine2 = new CashMachine(6000);
    CashMachine machine3 = new CashMachine(7000);

    @Test
    public void shouldAddMachines() {
        theBank.addMachine(machine1);
        assertEquals(5000, machine1.getBalance());
        theBank.addMachine(machine2);
        assertEquals(6000, machine2.getBalance());
        theBank.addMachine(machine3);
        assertEquals(7000, machine3.getBalance());
        assertEquals(3, theBank.getNumberOfMachines());
    }

    @Test
    public void shouldHaveZeroMachines() {
        assertEquals(0, theBank.getNumberOfMachines());
    }

    @Test
    public void shouldReturnNumberOfMachines() {
        theBank.addMachine(machine1);
        theBank.addMachine(machine2);
        assertEquals(2, theBank.getNumberOfMachines());
    }

    @Test
    public void shouldReturnTotalBalance() {
        theBank.addMachine(machine1);
        theBank.addMachine(machine2);
        theBank.addMachine(machine3);
        machine1.addTransaction(3000);
        machine3.addTransaction(-2000);
        machine2.addTransaction(3000);
        machine1.addTransaction(2000);
        machine3.addTransaction(-4000);
        assertEquals(20000, theBank.totalBalance());
    }

    @Test
    public void shouldReturnZeroWhenTotalBalanceIsZero() {
        theBank.addMachine(machine1);
        theBank.addMachine(machine2);
        theBank.addMachine(machine3);
        machine1.addTransaction(-5000);
        machine2.addTransaction(-6000);
        machine3.addTransaction(-7000);
        assertEquals(0, theBank.totalBalance());
    }

    @Test
    public void shouldReturnTotalDeposits() {
        theBank.addMachine(machine3);
        theBank.addMachine(machine2);
        theBank.addMachine(machine1);
        machine3.addTransaction(1000);
        machine2.addTransaction(-5000);
        machine1.addTransaction(3000);
        machine2.addTransaction(2000);
        assertEquals(3, theBank.totalDeposits());
    }

    @Test
    public void shouldReturnTotalWithdrawals() {
        theBank.addMachine(machine1);
        theBank.addMachine(machine2);
        theBank.addMachine(machine3);
        machine2.addTransaction(-2000);
        machine1.addTransaction(-5000);
        machine3.addTransaction(1000);
        machine2.addTransaction(-40000);
        assertEquals(2, theBank.totalWithdrawals());
    }

    @Test
    public void shouldReturnTotalDepositAverage() {
        theBank.addMachine(machine1);
        theBank.addMachine(machine2);
        theBank.addMachine(machine3);
        machine2.addTransaction(3000);
        machine3.addTransaction(-2000);
        machine1.addTransaction(3000);
        machine2.addTransaction(1500);
        assertEquals(2500, theBank.totalDepositAverage());
    }

    @Test
    public void shouldReturnTotalWithdrawalAverage() {
        theBank.addMachine(machine1);
        theBank.addMachine(machine2);
        theBank.addMachine(machine3);
        machine2.addTransaction(2000);
        machine1.addTransaction(-1000);
        machine3.addTransaction(-3000);
        machine3.addTransaction(-2000);
        assertEquals(-2000, theBank.totalWithdrawalAverage());
    }

    @Test
    public void shouldReturnZeroAverageWhenNoDeposits() {
        theBank.addMachine(machine1);
        theBank.addMachine(machine2);
        theBank.addMachine(machine3);
        machine2.addTransaction(-3000);
        machine3.addTransaction(-2000);
        machine1.addTransaction(-3000);
        machine2.addTransaction(-1500);
        assertEquals(0, theBank.totalDepositAverage());
    }

    @Test
    public void shouldReturnZeroAverageWhenNoWithdrawals() {
        theBank.addMachine(machine1);
        theBank.addMachine(machine2);
        theBank.addMachine(machine3);
        machine2.addTransaction(3000);
        machine3.addTransaction(2000);
        machine1.addTransaction(3000);
        machine2.addTransaction(1500);
        assertEquals(0, theBank.totalWithdrawalAverage());
    }
}
