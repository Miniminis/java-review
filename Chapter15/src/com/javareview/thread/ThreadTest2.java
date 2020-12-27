package com.javareview.thread;

class MyThread2 implements Runnable {

    public void run() {
        int i;

        for (i=0; i<=200; i++) {
            System.out.println(i+" ");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest2 {

    public static void main() {
        System.out.println("START");

        MyThread2 r1 = new MyThread2();
        MyThread2 r2 = new MyThread2();

        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);

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
