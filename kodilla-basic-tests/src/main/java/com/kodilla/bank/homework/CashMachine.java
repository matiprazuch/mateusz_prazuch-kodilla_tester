package com.kodilla.bank.homework;

public class CashMachine {

    public int[] transactions;
    public int balance;
    public int size;
    public int depositSize;
    public int withdrawalSize;
    public int depositSum;
    public int withdrawalSum;

    public CashMachine(int balance) {

        this.transactions = new int[0];
        this.size = 0;
        this.balance = balance;
    }

    public void addTransaction(int value) {
        if (value == 0) {
            return;
        } else {
            this.size++;
            int[] newTransactions = new int[this.size];
            System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
            newTransactions[this.size - 1] = value;
            this.transactions = newTransactions;

            if (value > 0) {
                this.depositSize++;
                balance += value;
                System.out.println("Wpłacono " + value);
            } else if (value < 0) {
                if (balance < value * -1) {
                    System.out.println("Brak wystarczajacych środkow");
                } else {
                    this.withdrawalSize++;
                    balance += value;
                    System.out.println("Wypłacono: " + value);
                }
            } else {
                System.out.println("stan konta nie zmieniony");
            }
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getDepositSum() {
        depositSum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] > 0) {
                depositSum += transactions[i];
            }
        }
        return depositSum;
    }

    public int getWithdrawalSum() {
        withdrawalSum = 0;
        for (int i = 0; i < transactions.length; i++) {
            if (transactions[i] < 0) {
                withdrawalSum += transactions[i];
            }
        }
        return withdrawalSum;
    }

    public int getDepositSize() {
        return depositSize;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getWithdrawalSize() {
        return withdrawalSize;
    }
}