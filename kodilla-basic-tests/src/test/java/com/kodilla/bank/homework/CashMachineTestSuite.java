package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();

        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }
    @Test
    public void shouldAddThreeElementsToTab() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(20);
        cashMachine.add(30);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
        assertEquals(10, transactions[0]);
        assertEquals(20,transactions[1]);
        assertEquals(30,transactions[2]);
    }
    @Test
    public void shouldCalculateTheCashMachineBalanceDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(20);
        cashMachine.add(30);

        int balanceDeposit = cashMachine.balanceDepositCashMachine();
        assertEquals(60, balanceDeposit);
    }
    @Test
    public void shouldCalculateTheCashMachineBalanceWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-10);
        cashMachine.add(-20);
        cashMachine.add(-30);

        int balanceWithdrawal = cashMachine.balanceWithdrawalCashMachine();
        assertEquals(-60, balanceWithdrawal);
    }
    @Test
    public void shouldCountTheNumberOfCashDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(20);
        cashMachine.add(30);
        cashMachine.add(0);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(4, transactions.length);
    }
    @Test
    public void shouldReturnZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();

        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }
    @Test
    public void shouldCalculateAverageCashDeposit() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(70);
        cashMachine.add(100);

        assertEquals(73.0, cashMachine.getAverageCashDeposit());
    }
    @Test
    public void shouldCalculateAverageCashWithdrawal() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-20);
        cashMachine.add(-50);
        cashMachine.add(-80);

        assertEquals(-50.0, cashMachine.getAverageCashWithdrawal(), 0.001);
    }
    @Test
    public  void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine();

        assertEquals(0, cashMachine.getAverageCashWithdrawal(), 0.001);
    }
}
