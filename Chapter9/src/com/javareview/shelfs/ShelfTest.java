package com.javareview.shelfs;

public class ShelfTest {

    /*Shelf 와 Queue 의 속성을 모두 가진, BookShelf */
    public static void run() {
        BookShelf shelf = new BookShelf();
        
        shelf.enQueue("태백산맥");
        shelf.enQueue("남한산성");
        shelf.enQueue("북한산");

        System.out.println(shelf.deQueue());
        System.out.println(shelf.deQueue());
        System.out.println(shelf.deQueue());
    }
}
