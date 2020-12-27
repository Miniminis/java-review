package com.javareview;

import java.util.ArrayList;

public class Library {

    public static MapoLibrary mapoLibrary = new MapoLibrary();

    public static void main() {
        Student lee = new Student();
        Student park = new Student();
        Student son = new Student();
        Student lee2 = new Student();
        Student park2 = new Student();
        Student son2 = new Student();

        lee.start();
        park.start();
        son.start();
        lee2.start();
        park2.start();
        son2.start();

    }
}

class MapoLibrary {
    private ArrayList<String> shelf;

    MapoLibrary() {
        this.shelf = new ArrayList<>();
        shelf.add("태백산맥 1");
        shelf.add("태백산맥 2");
        shelf.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException {
        Thread thread = Thread.currentThread();

        while (shelf.size() == 0) {
            System.out.println(thread.getName() + "이용할 수 있는 책이 없습니다. 반납을 기다립니다...");
            wait();
            System.out.println(thread.getName() + "이제 책을 이용할 수 있습니다.");
        }

        String title = shelf.remove(0);
        System.out.println(thread.getName() + " : "+title + " lend book");

        return title;
    }

    public synchronized void returnBook(String title) {
        Thread thread = Thread.currentThread();
        shelf.add(title);
        notifyAll();
        System.out.println(thread.getName() + " : "+title + " return book");
    }
}

class Student extends Thread {
    @Override
    public void run() {
        try {
            String title = Library.mapoLibrary.lendBook();
            if (title == null) return;
            sleep(3000);
            Library.mapoLibrary.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
