package com.javareview.shelfs;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> books;

    Shelf() {
        this.books = new ArrayList<>();
    }

    public ArrayList<String> getShelf() {
        return books;
    }

    public int getCnt() {
        return books.size();
    }

}
