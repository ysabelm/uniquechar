package com.simplon.lifelibrary;

import junit.framework.Test;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void isOpen() {
    Library library = new Library();
    boolean result = library.isOpen(17);
    assertEquals(true, result);
    }
    @Test
    public void putBooks() {
        Library library = new Library();
        Book book1 = new Book("Le rouge et le noir", 950);
        Book book2 = new Book("Accident nocturne", 110);
        Book book3 = new Book("Nous étions les Mulvaney", 730);
        ArrayList<Book> newBooks = new ArrayList<Book>();
        newBooks.add(book1);
        newBooks.add(book2);
        newBooks.add(book3);

        ArrayList<Book> output = library.putBooks(newBooks, 14);
        assertEquals(newBooks, output);
    }
    @Test
    public void putCds() {
        Library library = new Library();
        Cd cd1 = new Cd("Scary monsters", 110);
        Cd cd2 = new Cd("Serious moonlight", 95);
        ArrayList<Cd> newCds = new ArrayList<Cd>();
        newCds.add(cd1);
        newCds.add(cd2);
        ArrayList<Cd> output = library.putCds(newCds, 14);
        assertEquals(newCds, output);
    }
    @Test
    public void putDvds() {
        Library library = new Library();
        Dvd dvd1 = new Dvd("Sur quel pied danser", Kind.MUSICAL, 95,false);
        Dvd dvd2 = new Dvd("L'arme fatale", Kind.ACTION, 100, true);
        Dvd dvd3 = new Dvd("L'exorciste", Kind.HORROR, 90, false);
        Dvd dvd4 = new Dvd("Quand Harry rencontre Sally", Kind.FUN, 125, false);

        ArrayList<Dvd> newDvds = new ArrayList<Dvd>();
        newDvds.add(dvd1);
        newDvds.add(dvd2);
        newDvds.add(dvd3);
        newDvds.add(dvd4);

        ArrayList<Dvd> expectedDvds = new ArrayList<Dvd>();
        expectedDvds.add(dvd1);
        expectedDvds.add(dvd2);
        expectedDvds.add(dvd3);
        ArrayList<Dvd> result = library.putDvds(newDvds,17);
        assertEquals(expectedDvds,result);
        }


}
