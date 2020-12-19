package com.javareview;

import java.util.Scanner;

public class While {

    public static void init() {
//        sum1to10();
//        infiniteLoop();
//        runDoWhile();
        runWhile();
    }

    private static void runWhile() {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum = 0;

        while (input != 0) {
            sum += input;
            input = scan.nextInt();
        }

        System.out.println(sum);
    }

    private static void runDoWhile() {
        Scanner scan = new Scanner(System.in);

        int input;
        int sum = 0;

        do {
            input = scan.nextInt();
            sum += input;
        } while (input != 0);

        System.out.println(sum);
    }

    private static void infiniteLoop() {
        int num = 1;
        int sum = 0;
        while (true) {
            sum += num;
            num++;
        }
    }

    private static void sum1to10() {
        int num = 1;
        int sum = 0;
        while (num<=10) {
            sum += num;
            num++;
        }
        System.out.println("sum : "+sum);
        System.out.println("num : "+num);
    }
}
