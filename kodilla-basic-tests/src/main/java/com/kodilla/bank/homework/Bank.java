package com.kodilla.bank.homework;

public class Bank {

    private CashMachine[] machines;
    public int numberOfMachines;

    public int totalDeposits;
    public int totalWithdrawals;
    public int totalBalance;
    public double depositAverage;
    public double withdrawalAverage;

    public Bank() {
        this.machines = new CashMachine[0];
        this.numberOfMachines = 0;
    }
    public void addMachine(CashMachine balance) {
        this.numberOfMachines++;
        CashMachine[] newTab = new CashMachine[this.numberOfMachines];
        System.arraycopy(machines, 0, newTab, 0, machines.length);
        newTab[this.numberOfMachines - 1] = balance;
        this.machines = newTab;
    }

    public int getNumberOfMachines() {
        return numberOfMachines;
    }

    public int totalBalance() {
        totalBalance = 0;
        for (int i = 0; i < machines.length; i++) {
            totalBalance += machines[i].getBalance();
        }
        return totalBalance;
    }

    public int totalDeposits() {
        totalDeposits = 0;
        for (int i = 0; i < machines.length; i++) {
            totalDeposits += machines[i].getDepositSize();
        }
        return totalDeposits;
    }

    public int totalWithdrawals() {
        totalWithdrawals = 0;
        for (int i = 0; i < machines.length; i++) {
            totalWithdrawals += machines[i].getWithdrawalSize();
        }
        return totalWithdrawals;
    }

    public double totalDepositAverage() {
        if (totalDeposits == 0)
            return 0;
        else {
            depositAverage = 0;
            double sum = 0;
            for (int i = 0; i < machines.length; i++) {
                sum += machines[i].getDepositSum();
                depositAverage = sum / totalDeposits();
            }
            return depositAverage;
        }
    }

    public double totalWithdrawalAverage() {
        if (withdrawalAverage == 0)
            return 0;
        else {
            withdrawalAverage = 0;
            double sum = 0;
            for (int i = 0; i < machines.length; i++) {
                sum += machines[i].getWithdrawalSum();
                withdrawalAverage = sum / totalWithdrawals();
            }
            return withdrawalAverage;
        }
    }
}