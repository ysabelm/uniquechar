package com.simplon.lifelibrary;


import java.util.Objects;

public class Dvd extends Cd{
    private Movie kind;
    private boolean threeD;

    public Dvd(String title, Movie kind, int time, boolean threeD){
        super(title, time);
        this.kind = kind;
        this.threeD = threeD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if(!super.equals(o)) return false;
        Dvd dvd = (Dvd) o;
        return kind == dvd.kind && threeD == dvd.threeD;
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), kind, threeD);
    }
    @Override
    public String toString() {
        return "Dvd{" +
                "title='" + title + '\'' +
                ", kind=" + kind +
                ", time=" + time +
                ", threeD=" + threeD +
                '}';
    }

}
