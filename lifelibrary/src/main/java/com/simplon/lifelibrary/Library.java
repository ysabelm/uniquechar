package com.simplon.lifelibrary;

import java.util.ArrayList;



public class Library {
    private ArrayList<Book> books = new ArrayList(Book);
    private ArrayList<Cd> cds = new ArrayList(Cd);
    private ArrayList<Dvd> dvds = new ArrayList(Dvd);


    public Library(ArrayList<Book> books, ArrayList<Cd> cds, ArrayList<Dvd> dvds){
        this.books = books;
        this.cds = cds;
        this.dvds = dvds;
    }
    public boolean isOpen(int hour) {
        return hour >= 13 && hour <= 19;
        }
    public ArrayList<Book> putBooks(ArrayList<Book> books, int hour) {
        if (isOpen(hour)) {
            books.addAll(books);
        }
        return books;
    }
    public ArrayList<Cd> putCds(ArrayList<Cd> cds, int hour){
        if(isOpen(hour)) {
            cds.addAll(cds);
        }
        return cds;
    }
    public ArrayList<Dvd> putDvds(ArrayList<Dvd> dvds, int hour) {
        if (isOpen(hour)) {
            for (Dvd dvd : dvds) {
                if (dvds.size() < 3) {
                    if (!dvds.contains(dvd)) {
                        dvds.add(dvd);
                    }
                }
            }
        }
        return dvds;
    }


}
