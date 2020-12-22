package com.javareview.practice;

public class QuickSort implements Sort{

    @Override
    public void ascending(int[] arr) {
        System.out.println("QuickSort ascending...");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("QuickSort descending...");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다. : QuickSort 입니다.");
    }
}
