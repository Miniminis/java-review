package com.javareview.stream;

import java.util.Arrays;

public class StreamTest {

    public static void run() {
        int[] arr = {6, 94, -1, 8, 100};

        Arrays.stream(arr).forEach(i -> System.out.print(i + ", "));
        System.out.println();
        Arrays.stream(arr).sorted().forEach(i -> System.out.print(i+" "));
        System.out.println();
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.stream(arr).count());
    }
}
