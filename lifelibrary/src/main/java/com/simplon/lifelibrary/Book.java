package com.simplon.lifelibrary;


public class Book {
    private String title;
    private int numPages;

    public Book(String title, int numPages){
        this.title = title;
        this.numPages = numPages;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", numPages=" + numPages + '}';
    }
}


