package com.simplon.lifelibrary;


import java.util.Objects;

public class Cd {
    protected String title;
    protected int time;

    public Cd(String title, int time){
        this.title = title;
        this.time = time;
    }
    public String getTitle(){
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cd cd = (Cd) o;
        return time == cd.time &&
                Objects.equals(title, cd.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, time);
    }

    @Override
    public String toString(){
        return "Cd{" + "title=" + title + ", numMin=" + time + '}';
    }
}
