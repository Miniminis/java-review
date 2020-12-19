package com.javareview;

public class ForLoop {

    public static void init() {
//        runForLoop();
        runWhileLoop();
//        runInfiniteLoop();
    }

    private static void runInfiniteLoop() {

        for(;;) {

        }

        while (true) {

        }

    }

    private static void runWhileLoop() {
        int num = 1;
        int sum = 0;

        while (num <=10) {
            sum += num;
            num++;
        }

        System.out.println(sum);
    }

    private static void runForLoop() {
        /* 1 - 10까지 더하기*/
        int sum = 0;

        for (int num=1; num<=10; num++) {
            sum += num;
        }

        System.out.println(sum);
    }

}
