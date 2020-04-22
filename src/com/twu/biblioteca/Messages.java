package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Messages {

    private PrintStream printStream;

    public Messages(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void welcomeMessage() {
        printStream.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

    public void printBookList(ArrayList<Book> books) {
        String booksToBePrinted = "";

        for (Book book : books) {
            booksToBePrinted += (book.toString() + "\n");
        }

        printStream.println(booksToBePrinted);
    }
}
