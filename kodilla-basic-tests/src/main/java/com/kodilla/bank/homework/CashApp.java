package com.kodilla.bank.homework;

public class CashApp {
    public static void main(String[] args) {

        CashMachine cashMachine = new CashMachine(0);
        CashMachine cashMachine2 = new CashMachine(0);
        Bank bank = new Bank();

        cashMachine.addTransaction(40);
        cashMachine2.addTransaction(60);
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-30);
        cashMachine2.addTransaction(-400);
        cashMachine.addTransaction(400);

        bank.addMachine(cashMachine);
        bank.addMachine(cashMachine2);
        bank.totalDepositAverage();
        System.out.println(cashMachine2.getBalance());
        System.out.println(cashMachine.getBalance());
        System.out.println(cashMachine.getDepositSize());
        System.out.println(cashMachine.getWithdrawalSum());
        System.out.println(cashMachine.getDepositSum());
        System.out.println(bank.totalDepositAverage());
        System.out.println(bank.totalDeposits());
        System.out.println(bank.totalWithdrawals());
    }
}
