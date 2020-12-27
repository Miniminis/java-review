package com.javareview.thread;

class MyThread extends Thread {

    public void run() {
        int i;

        for (i=0; i<=200; i++) {
            System.out.println(i+" ");

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {

    public static void main() {
        System.out.println("START");
        MyThread th1 = new MyThread();
        MyThread th2 = new MyThread();

        th1.start();
        th2.start();
        System.out.println("END");

        /*
        *
        * START
            END
            0
            0
            1
            1
            2 */
    }
}
