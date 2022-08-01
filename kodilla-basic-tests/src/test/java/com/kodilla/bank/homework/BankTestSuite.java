package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        Bank bank = new Bank();

        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(0, cashMachines.length);
    }
    @Test
    public void shouldAddFourElementsToTab() {
        Bank bank = new Bank();

        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());
        bank.add(new CashMachine());


        CashMachine[] cashMachines = bank.getCashMachines();
        assertEquals(4, cashMachines.length);
    }
    @Test
    public void shouldHaveZeroBalanceDeposit() {
        Bank bank = new Bank();

        int balanceDeposit = bank.totalBalanceDeposit();
        assertEquals(0, balanceDeposit);
    }
    @Test
    public  void shouldCalculateTotalBalanceOfAllCashMachines() {
        Bank bank = new Bank();
        CashMachine cashMachines = new CashMachine();

        cashMachines.add(1000);
        cashMachines.add(-1000);
        cashMachines.add(-500);
        cashMachines.add(2200);
        cashMachines.add(5000);
        cashMachines.add(0);
        bank.add(cashMachines);

        assertEquals(6700, bank.totalBalanceOfAllCashMachine());
    }
    @Test
    public void shouldCalculateTotalBalanceDeposit() {
        Bank bank = new Bank();
        CashMachine cashMachines = new CashMachine();

        cashMachines.add(1000);
        cashMachines.add(2200);
        cashMachines.add(5000);
        cashMachines.add(0);
        bank.add(cashMachines);

        assertEquals(3, bank.totalCashDeposit());
        assertEquals(8200, bank.totalBalanceDeposit());
    }
    @Test
    public void shouldCalculateTotalBalanceWithdrawal() {
        Bank bank = new Bank();
        CashMachine cashMachines = new CashMachine();

        cashMachines.add(-500);
        cashMachines.add(-100);
        cashMachines.add(-1000);
        cashMachines.add(-200);
        bank.add(cashMachines);

        assertEquals(-1800, bank.totalBalanceWithdrawal());
        assertEquals(4, bank.totalCashWithdrawal());
    }
    @Test
    public void shouldCalculateTotalAverageDeposit() {
        Bank bank = new Bank();
        CashMachine cashMachines = new CashMachine();

        cashMachines.add(200);
        cashMachines.add(0);
        cashMachines.add(300);
        cashMachines.add(150);
        bank.add(cashMachines);

        assertEquals(216.0, bank.getAverageDeposit(), 0.001);
    }
    @Test
    public void shouldCalculateTotalAverageWithdrawal() {
        Bank bank = new Bank();
        CashMachine cashMachines = new CashMachine();

        cashMachines.add(-200);
        cashMachines.add(0);
        cashMachines.add(-350);
        bank.add(cashMachines);

        assertEquals(-275.0, bank.getAverageWithdrawal(), 0.001);
    }
}
