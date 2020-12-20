package com.javareview;

public class TwoDimention {
    public static void runTest() {
        int[][] arr = { {1, 6, 4, 2}, {123, 544, 222}};
        for(int i = 0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
