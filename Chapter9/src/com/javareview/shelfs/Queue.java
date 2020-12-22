package com.javareview.shelfs;

public interface Queue {
    void enQueue(String title);

    String deQueue();

    int getSize();
}
