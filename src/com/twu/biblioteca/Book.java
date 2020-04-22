package com.twu.biblioteca;

public class Book {

    private int id;
    private String name;
    private String author;
    private int publicationYear;

    public Book(int id, String name, String author, int publicationYear) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return this.getId() + ". " + this.getName() + "|" + this.getAuthor() + "|" + this.getPublicationYear();
    }

}


