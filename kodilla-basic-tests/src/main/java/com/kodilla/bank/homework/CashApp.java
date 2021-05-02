package com.kodilla.bank.homework;

public class CashApp {
    public static void main(String[] args) {

        CashMachine cashMachine = new CashMachine(0);
        CashMachine cashMachine2 = new CashMachine(0);
        Bank bank = new Bank();

        cashMachine.addTransaction(300);
        cashMachine2.addTransaction(-200);
        bank.addMachine(cashMachine);

    }
}
