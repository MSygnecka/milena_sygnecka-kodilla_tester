package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void testGrtOrder_withException() {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        // then
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("5555"));
    }
    @Test
    public void testGetOrder() throws OrderDoesntExistException {

        Warehouse warehouse = new Warehouse();

        Order order = new Order("0021");
        warehouse.addOrder(order);

        Order orderApproved = warehouse.getOrder("0021");

        assertEquals(orderApproved, order);
    }
}