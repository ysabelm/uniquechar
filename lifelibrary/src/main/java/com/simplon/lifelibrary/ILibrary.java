package com.simplon.lifelibrary;

import java.util.ArrayList;

public interface ILibrary {
    ArrayList<Book> putBooks(ArrayList<Book> books);
    ArrayList<Cd> putCds(ArrayList<Cd> cds);
    ArrayList<Dvd> putDvds(ArrayList<Dvd> dvds);

    Boolean isOpen (int hour);
}
