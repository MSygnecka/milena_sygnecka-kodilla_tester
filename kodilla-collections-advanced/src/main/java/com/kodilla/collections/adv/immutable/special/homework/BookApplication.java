package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        Book harryPotter = BookManager.createBook("Harry Potter", "J.K. Rowling");
        Book lordOfTheRings = BookManager.createBook("Lord of the Rings", "J.R.R. Tolkien");
        Book dusk = BookManager.createBook("Dusk", "Stephenie Meyer");
        Book harryPotter1 = BookManager.createBook("Harry Potter", "J.K. Rowling");

        System.out.println(harryPotter == lordOfTheRings);
        System.out.println(lordOfTheRings == dusk);
        System.out.println(harryPotter == dusk);

        System.out.println(harryPotter == harryPotter1);


    }
}
