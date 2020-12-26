package com.javareview;

public class ExceptionTest1 {

    public static void run() {
        int[] arr = {1, 2, 3, 4, 5};
//        for (int i=0; i<=arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        /*
        * Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
        at com.javareview.ExceptionTest1.run(ExceptionTest1.java:8)
        at com.javareview.Main.main(Main.java:6)*/

        try {
            for (int i=0; i<=arr.length; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("예외가 발생하였습니다!");
        }
        System.out.println("프로그램이 종료됩니다.");
    }
}
