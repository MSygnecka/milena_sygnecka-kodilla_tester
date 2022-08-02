package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookManager {
    public static Book createBook(String title, String author) {
        Book book = new Book (title, author);

        for (Book b : books) {
            if (b.equals(book)){
                return b;
            }
        }
        books.add(book);

        return book;
    }
    static List<Book> books = new ArrayList<>();

}
