package com.javareview;

public class MultiplicationTableExample {

    public static void init() {
//        runFor();
        runWhile();
    }

    private static void runWhile() {
        int i = 1;

        while (i < 10) {
            int j = 1;
            while (j < 10) {
                System.out.println(i + "*" + j + "=" + i * j);
                j++;
            }
            i++;
        }
    }

    private static void runFor() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }
}
