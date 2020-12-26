package com.javareview.lamdaex;

public class LamdaTest2 {

    public static void run() {
//        PrintString printString = System.out::println;
        /* 자료형에 기반하여 선언하고,*/
        PrintString printString = s -> System.out.println(s);
        printString.showString("python1");

        /* 매개변수로 전달하고,*/
        showMyString(printString);

        /*매서드의 반환값으로 사용할 수 있다.*/
        PrintString printString1 = returnMyString();
        printString1.showString("python3");
    }

    private static void showMyString(PrintString pstr) {
        pstr.showString("python2");
    }

    private static PrintString returnMyString() {
        return s -> System.out.println(s);
    }
}

interface PrintString {

    void showString(String s);
}
