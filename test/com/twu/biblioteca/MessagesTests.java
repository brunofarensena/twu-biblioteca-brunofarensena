package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MessagesTests {

    @Test
    public void shouldPrintWelcomeMessage() {
        PrintStream printStream = mock(PrintStream.class);
        Messages messages = new Messages(printStream);
        messages.welcomeMessage();
        String welcomeMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        verify(printStream).println(welcomeMessage);
    }

    @Test
    public void shouldPrintBookList() {
        PrintStream printStream = mock(PrintStream.class);
        Messages messages = new Messages(printStream);
        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book(1, "Harry Potter", "Jk rolling", 2000));
        books.add(new Book(2, "Clean code", "Martin Fowler", 2002));

        messages.printBookList(books);
        verify(printStream).println("1. Harry Potter|Jk rolling|2000\n2. Clean code|Martin Fowler|2002\n");
    }
}
