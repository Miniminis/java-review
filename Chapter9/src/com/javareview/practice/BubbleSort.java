package com.javareview.practice;

public class BubbleSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        System.out.println("BubbleSort ascending...");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("BubbleSort descending...");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다. : BubbleSort 입니다.");
    }
}
