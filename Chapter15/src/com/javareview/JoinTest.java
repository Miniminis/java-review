package com.javareview;

public class JoinTest extends Thread {

    int start;
    int end;
    int total;

    JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
        this.total = 0;
    }

    public void run() {
        int i;
        for(i = start; i<=end; i++) {
            total += i;
        }
    }

    public static void main() {
        JoinTest jt1 = new JoinTest(1, 50);
        JoinTest jt2 = new JoinTest(51, 100);

        jt1.start();
        jt2.start();

        try {
            jt1.join();
            jt2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(jt1.total);
        System.out.println(jt2.total);
        System.out.println(jt1.total + jt2.total);

        /*
        * 1275
        3775
        5050
        * */

    }
}
