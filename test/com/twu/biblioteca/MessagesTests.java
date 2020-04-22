package com.twu.biblioteca;

import org.junit.Test;

import java.io.PrintStream;

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
}
