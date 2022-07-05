package com.kodilla.bank.homework;

public class Bank {
    private CashMachine [] cashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[5];
    }
    public int totalBalanceOfAllCashMachine() {
        int balance = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            balance = balance + this.cashMachines[i].balanceDepositCashMachine() + this.cashMachines[i].balanceWithdrawalCashMachine();
        }
            return balance;
    }
    public int totalCashDeposit() {
        int deposit = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            if (this.cashMachines[i].cashDepositCount() > 0 ) {
                deposit = deposit + this.cashMachines[i].cashDepositCount();
            }
        }
        return deposit;
    }
    public int totalCashWithdrawal() {
        int withdrawal = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            if (this.cashMachines[i].cashWithdrawalCount() < 0 ) {
                withdrawal = withdrawal + this.cashMachines[i].cashWithdrawalCount();
            }
        }
        return withdrawal;
    }

}
