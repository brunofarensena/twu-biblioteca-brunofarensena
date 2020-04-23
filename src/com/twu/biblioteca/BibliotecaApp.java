package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        Messages messages = new Messages(System.out);
        messages.welcomeMessage();

        ArrayList<Book> book = new ArrayList<Book>();

        book.add(new Book(1, "Harry Potter", "Jk rolling", 2000));
        book.add(new Book(2, "Clean code", "Martin Fowler", 2002));
        book.add(new Book(3, "Java beginners", "Test3", 1999));

        messages.printBookList(book);
    }
}
