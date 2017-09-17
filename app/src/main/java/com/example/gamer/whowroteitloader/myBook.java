package com.example.gamer.whowroteitloader;

/**
 * Created by Gamer on 9/17/2017.
 */

public class myBook {
    String title;
    String author;

    public myBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}