package com.javareview;

public class ArrayTest {
    public static void runArrayTest() {
        int [] arr = new int[10];
        int [] arr2 = {1, 2, 3};

        int sum = 0;

        for (int i=0; i<arr.length; i++) {
            arr[i] = i+1;
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void runDoubleArrayTest() {
        double [] arr = new double[5];
        int cnt = 0;

        arr[0] = 1.0; cnt++;
        arr[1] = 1.1; cnt++;
        arr[2] = 1.2; cnt++;

        double mTotal = 1;
//        for (int i=0; i<arr.length; i++) {        //0.0
        for (int i=0; i<cnt; i++) {                 //1.32
            mTotal *= arr[i];
        }
        System.out.println(mTotal);
    }

    public static void runCharArrayTest() {
        char [] arr = new char[26];
//        int index = 65;
//
//        for (int i=0; i<arr.length; i++) {
//            arr[i] = (char) (index + i);
//            System.out.print(arr[i]+" ");
//        }
        char ch = 'A';

        for (int i=0; i<arr.length; i++) {
//            arr[i] = ++ch;
            arr[i] = ch++;
            System.out.print(arr[i]+" ");
        }
    }
}
