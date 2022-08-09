package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("0001"));
        warehouse.addOrder(new Order("0021"));
        warehouse.addOrder(new Order("0100"));
        warehouse.addOrder(new Order("1020"));

        try {
            Order isThereAnOrder5555 = warehouse.getOrder("5555");
            System.out.println("Order 5555" + isThereAnOrder5555);
        } catch (OrderDoesntExistException e) {
            System.out.println("There is no order 5555");
        } finally {
            System.out.println("Thank you for using our services");
        }
    }
}
