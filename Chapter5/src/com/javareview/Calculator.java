package com.javareview;

public class Calculator {

    public int addNum(int a, int b) {
        int result = a + b;
        return result;
    }

    public void sayHello(String msg) {
        System.out.println(msg);
    }

    public int calSum(int num) {
        int sum = 0;
        for (int i = 0; i<num; i++) {
            sum += i;
        }
        return sum;
    }
}
