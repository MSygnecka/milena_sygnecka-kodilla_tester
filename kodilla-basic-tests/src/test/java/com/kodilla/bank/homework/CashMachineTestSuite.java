package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static com.kodilla.inheritance.basic_assertion.ResultChecker.assertEquals;

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
    public void shouldCalculateTheCashMachineBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(20);
        cashMachine.add(30);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(60, transactions.length);
    }
    @Test
    public void shouldCalculateTheNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(20);
        cashMachine.add(30);

        int[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
    }
}
