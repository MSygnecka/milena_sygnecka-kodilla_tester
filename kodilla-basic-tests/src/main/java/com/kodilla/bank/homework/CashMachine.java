package com.kodilla.bank.homework;

public class CashMachine {
    private int size;
    private int[] transactions;

    public CashMachine() {
        this.transactions = new int[0];
        this.size = 0;
    }

    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int[] getTransactions() {

        return transactions;
    }

    public int balanceDepositCashMachine() {

        int sumDeposit = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                sumDeposit = sumDeposit + this.transactions[i];
            }
        }
            return sumDeposit;
    }
    public int balanceWithdrawalCashMachine() {

        int sumWithdrawal = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                sumWithdrawal = sumWithdrawal + this.transactions[i];
            }
        }
        return sumWithdrawal;
    }
    public int getTransactionsCount() {

        return this.transactions.length;
    }

    public int cashDepositCount() {
        int deposit = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                deposit++;
            }
        }
        return deposit;
    }
    public int cashWithdrawalCount() {
        int withdrawal = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                withdrawal++;
            }
        }
        return withdrawal;
    }
    public double getAverageCashDeposit() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double averageDeposit = 0;
        averageDeposit = balanceDepositCashMachine() / cashDepositCount();

            return averageDeposit;
    }
    public double getAverageCashWithdrawal() {
            if (this.transactions.length == 0) {
                return 0;
            }
        double averageWithdrawal = 0;
        averageWithdrawal = balanceWithdrawalCashMachine() / cashWithdrawalCount();

        return averageWithdrawal;
    }
}