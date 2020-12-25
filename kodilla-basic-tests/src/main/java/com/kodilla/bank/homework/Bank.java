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
            if (machines[i].depositSize == 0) {
                return 0;
            } else {
                totalDeposits += machines[i].getDepositSize();
            }
        }
        return totalDeposits;
    }

    public int totalWithdrawals() {
        for (int i = 0; i < machines.length; i++) {
            if (machines[i].withdrawalSize == 0) {
                return 0;
            }
        }
        return totalWithdrawals;
    }

    public double totalDepositAverage() {
        if (totalDeposits == 0) {
            return 0;
        } else {
            depositAverage = 0;
            int sum = 0;
            for (int i = 0; i < machines.length; i++) {
                sum += machines[i].depositSum;
            }
            depositAverage = sum / totalDeposits;
            return depositAverage;
        }
    }

    public double totalWithdrawalAverage() {
        if (totalWithdrawals == 0) {
            return 0;
        } else {
            withdrawalAverage = 0;
            int sum = 0;
            for (int i = 0; i < machines.length; i++) {
                sum += machines[i].withdrawalSum;
            }
            withdrawalAverage = sum / withdrawalAverage;
            return withdrawalAverage;
        }
    }
}