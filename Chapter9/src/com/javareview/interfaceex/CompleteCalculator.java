package com.javareview.interfaceex;

public class CompleteCalculator extends Calculator {

    @Override
    public int times(int a, int b) {
        return a * b;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) {
            return ERROR;
        }
        return a / b;
    }

    public void showInfo() {
        System.out.println("계산기이 완료되었습니다.");
    }
}
