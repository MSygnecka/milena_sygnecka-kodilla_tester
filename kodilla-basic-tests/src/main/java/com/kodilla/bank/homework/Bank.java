package com.kodilla.bank.homework;

public class Bank {
    private CashMachine [] cashMachines;
    int size = 0;

    public Bank() {

        this.cashMachines = new CashMachine[0];
    }
    public void add(CashMachine cashMachine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }
    public CashMachine[] getCashMachines(){
        return cashMachines;
    }
    public int totalBalanceOfAllCashMachine() {
        int balance = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            balance = balance + this.cashMachines[i].balanceDepositCashMachine() + this.cashMachines[i].balanceWithdrawalCashMachine();
        }
            return balance;
    }
    public int totalBalanceDeposit() {
        int balance = 0;
        for (int i = 0; i <  this.size; i++) {
            balance = balance + this.cashMachines[i].balanceDepositCashMachine();
        }
        return balance;
    }
    public int totalBalanceWithdrawal() {
        int balance = 0;
        for (int i = 0; i <  this.size; i++) {
            balance = balance + this.cashMachines[i].balanceWithdrawalCashMachine();
        }
        return balance;
    }

    public int totalCashDeposit() {
        int deposit = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
                deposit = deposit + this.cashMachines[i].cashDepositCount();
        }
        return deposit;
    }
    public int totalCashWithdrawal() {
        int withdrawal = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {

                withdrawal = withdrawal + this.cashMachines[i].cashWithdrawalCount();
        }
        return withdrawal;
    }
    public double getAverageDeposit() {
        double average = 0;
        average = totalBalanceDeposit()/totalCashDeposit();

        return  average;
    }
    public double getAverageWithdrawal() {
        double average = 0;
        average = totalBalanceWithdrawal()/totalCashWithdrawal();

        return average;
    }
}
