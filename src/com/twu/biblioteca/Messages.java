package com.twu.biblioteca;

import java.io.PrintStream;

public class Messages {

    private PrintStream printStream;

    public Messages(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void welcomeMessage() {
        printStream.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }

}
