package com.simplon.lifelibrary;

import junit.framework.Test;
import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;



public class LibraryTest {

    @Test
    public void putBooks_with_two_books(){
        //Set
        Library library = new Library();
        Book book1 = new Book("Le rouge et le noir", 950);
        Book book2 = new Book("Accident nocturne", 110);
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        //Test
        ArrayList<Book> output = library.putBooks(books);
        //Assert
        assertEquals(2, output.size());
    }
    public void putCds_with_two_cds(){
        //Set
        Library library = new Library();
        Cd cd1 = new Cd("Scary monsters", 110);
        Cd cd2 = new Cd("Serious moonlight", 95);
        ArrayList<Cd> cds = new ArrayList<Cd>();
        cds.add(cd1);
        cds.add(cd2);
        //Test
        ArrayList<Cd> output = library.putCds(cds);
        //Assert
        assertEquals(2, output.size());
    }
    public void putDvds_with_four_dvds(){
        //Set
        Library library = new Library();
        Dvd dvd1 = new Dvd("Sur quel pied danser", Movie.MUSICAL, 95,false);
        Dvd dvd2 = new Dvd("L'arme fatale", Movie.ACTION, 100, true);
        Dvd dvd3 = new Dvd("L'exorciste", Movie.HORROR, 90, false);
        Dvd dvd4 = new Dvd("Quand Harry rencontre Sally", Movie.FUN, 125, false);
        ArrayList<Dvd> dvds = new ArrayList<Dvd>();
        dvds.add(dvd1);
        dvds.add(dvd2);
        dvds.add(dvd3);
        dvds.add(dvd4);
        //Test
        ArrayList<Dvd> output = library.putDvds(dvds);
        //Assert
        assertEquals(0, output.size());
    }
    @Test
    public void putDvds_with_one_present_in_library_and_one_duplicated_input(){
        //Set
        Library library = new Library();
        Dvd dvd1 = new Dvd("Sur quel pied danser", Movie.MUSICAL, 95,false);
        ArrayList<Dvd> dvds = new ArrayList<Dvd>();
        dvds.add(dvd1);
        library.putDvds(dvds);

        Dvd dvd2 = new Dvd("L'arme fatale", Movie.ACTION, 100, true);
        ArrayList<Dvd> newDvds = new ArrayList<Dvd>();
        newDvds.add(dvd2);
        newDvds.add(dvd1);
        //test
        ArrayList<Dvd> output = library.putDvds(newDvds);
        //Assert
        assertEquals(1, output.size());
        Dvd dvdActual = output.get(0);
        assertEquals("dvd1", dvdActual.getTitle());
    }
    @Test
    public void putDvds_with_two_duplicated_inputs(){
        //Set
        Library library = new Library();
        Dvd dvd1 = new Dvd("Sur quel pied danser", Movie.MUSICAL, 95,false);
        Dvd dvd2 = new Dvd("Sur quel pied danser", Movie.MUSICAL, 95,false);
        ArrayList<Dvd> dvds = new ArrayList<Dvd>();
        dvds.add(dvd1);
        dvds.add(dvd2);
        //Test
        ArrayList<Dvd> output = library.putDvds(dvds);
        //Assert
        assertEquals(0, output.size());
    }


    @Test
    public void isOpen_at_three() {
    Library library = new Library();
    boolean output = library.isOpen(3);
    assertEquals(true, result);
    }
    @Test
    public void isOpen_at_ten() {
        Library library = new Library();
        boolean output = library.isOpen(10);
        assertEquals(false, result);
    }


}
