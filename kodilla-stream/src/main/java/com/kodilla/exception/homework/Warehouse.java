package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Warehouse {

    List<Order> orders = new ArrayList<>();
    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        Order result = orders
                .stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow (() ->new OrderDoesntExistException());

        return result;
    }
}