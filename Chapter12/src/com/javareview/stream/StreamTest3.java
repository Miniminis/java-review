package com.javareview.stream;

import java.util.Arrays;

public class StreamTest3 {

    public static void run() {
        /*reduce 연산 연습 1*/
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.stream(arr).reduce(0, (a, b)->a+b));
    }
}
