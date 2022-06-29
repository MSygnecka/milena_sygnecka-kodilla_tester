package com.kodilla.inheritance.basic_assertion;

public class Calculator {
        int a;
        int b;
        int c;
        int d;

        public int sum(int a, int b) {
            int sum = a + b;
            return sum;
        }
        public int subtract(int a, int b) {
            int subtract = a - b;
            return subtract;
        }
        public double power(int c, int d) {
            double power = Math.pow(c, d);
            return power;
        }
}
