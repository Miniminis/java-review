package com.javareview;

public class InterruptTest extends Thread{

    @Override
    public void run() {
        int i;
        for(i=0; i<100; i++) {
            System.out.println(i);
        }

        try {
            sleep(5000);
            System.out.println(1000000);
        } catch (InterruptedException e) {
            System.out.println(e);
            System.out.println("WAKE!");
        }
    }

    public static void main() {

        InterruptTest interruptTest = new InterruptTest();
        interruptTest.start();
        interruptTest.interrupt();      //java.lang.InterruptedException: sleep interrupted

        System.out.println("END");

    }
}
