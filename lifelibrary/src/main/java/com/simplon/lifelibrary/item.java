package com.simplon.lifelibrary;

import java.util.Objects;


public class item {
    private String title;
    private int numPages;
    private Kind kind;
    private int time;
    private boolean threeD;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        item item = (item) o;
        return numPages == item.numPages &&
                time == item.time &&
                threeD == item.threeD &&
                Objects.equals(title, item.title) &&
                kind == item.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, numPages, kind, time, threeD);
    }

    @Override
    public String toString() {
        return "item{" +
                "title='" + title + '\'' +
                ", numPages=" + numPages +
                ", kind=" + kind +
                ", time=" + time +
                ", threeD=" + threeD +
                '}';
    }
}

