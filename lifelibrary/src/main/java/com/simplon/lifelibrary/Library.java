package com.simplon.lifelibrary;

import java.util.ArrayList;
import java.util.HashSet;
import com.simplon.lifelibrary.Dvd;
import com.simplon.lifelibrary.Cd;
import com.simplon.lifelibrary.Book;


public class Library implements ILibrary {
    private final int CLOSE = 7;
    private final int OPEN = 1;
    private final int STOCK_MAX = 3;

    private ArrayList<Book> books = new ArrayList();
    private ArrayList<Cd> cds = new ArrayList();
    private ArrayList<Dvd> dvds = new ArrayList();


    public Library(ArrayList<Book> books, ArrayList<Cd> cds, ArrayList<Dvd> dvds){
        this.books = books;
        this.cds = cds;
        this.dvds = dvds;
    }
    @Override
    public boolean isOpen(int hour) {
        return hour >= OPEN && hour <= CLOSE;
    }
    @Override
    public ArrayList<Book> putBooks(ArrayList<Book> books) {
        this.books.addAll(books);
        return this.books;
    }
    @Override
    public ArrayList<Cd> putCds(ArrayList<Cd> cds){
        this.cds.addAll(cds);
        return this.cds;
    }
    @Override
    public ArrayList<Dvd> putDvds(ArrayList<Dvd> dvds) {
        int sizeTotal = dvds.size() + this.dvds.size();
        if (sizeTotal <= STOCK_MAX && !checkDuplicationOtherDvds(dvds)){
            this.dvds.addAll(dvds);
            if (checkDuplicationPresentDvds()){
                for (Dvd dvd : dvds){
                    this.dvds.remove(dvd);
                }
            }
        }
        return dvds;
    }
    private boolean checkDuplicationPresentDvds(){
        boolean hasDuplication = false;
        for(Dvd dvd : dvds){
            if(this.dvds.contains(dvd)){
                hasDuplication = true;
            }
        }
        return hasDuplication;
    }


}
