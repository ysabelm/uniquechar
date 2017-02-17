package com.simplon.lifelibrary;


public class Cd extends item {
    private String title;
    private int time;

    public Cd(String title, int time){
        this.title = title;
        this.time = time;
    }

    @Override
    public String toString(){
        return "Cd{" + "title=" + title + ", numMin=" + time + '}';
    }
}
