package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        Messages messages = new Messages(System.out);
        messages.welcomeMessage();

        ArrayList<Book> book = new ArrayList<Book>();

        book.add(new Book(1, "Harry Potter"));
        book.add(new Book(2, "Clean code"));
        book.add(new Book(3, "Java beginners"));

        messages.printBookList(book);
    }
}
