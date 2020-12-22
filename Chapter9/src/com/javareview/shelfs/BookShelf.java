package com.javareview.shelfs;

public class BookShelf extends Shelf implements Queue{
    @Override
    public void enQueue(String title) {
        books.add(title);
    }

    @Override
    public String deQueue() {
        return books.remove(0);
    }

    @Override
    public int getSize() {
        return getCnt();
    }
}
