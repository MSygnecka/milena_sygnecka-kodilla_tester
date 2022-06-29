package com.kodilla.inheritance.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 4;
        int d = 2;
        int sumResult = calculator.sum(a, b);
        int subtractResult = calculator.subtract(a, b);
        double powerResult = calculator.power(c, d);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean right = ResultChecker.assertEquals(-3, subtractResult);
        if(right) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }
        boolean good = ResultChecker.assertEquals(16, powerResult);
        if (good) {
            System.out.println("Metoda power działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda power nie działa poprawnie dla liczb " + c + " i " + d);
        }
    }
}
