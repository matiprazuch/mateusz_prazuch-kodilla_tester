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
}
