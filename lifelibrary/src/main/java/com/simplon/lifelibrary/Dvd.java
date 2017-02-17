package com.simplon.lifelibrary;


public class Dvd extends item {
    private String title;
    private Kind kind;
    private int time;
    private boolean threeD;

    public Dvd(String title, Kind kind, int time, boolean threeD){
        this.title = title;
        this.kind = kind;
        this.time = time;
        this.threeD = threeD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dvd dvd = (Dvd) o;
        if (threeD != dvd.threeD) return false;
        if (time != dvd.time) return false;
        if (!title.equals(dvd.title)) return false;
        return kind == dvd.kind;
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
