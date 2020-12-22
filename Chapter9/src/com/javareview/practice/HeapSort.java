package com.javareview.practice;

public class HeapSort implements Sort{
    @Override
    public void ascending(int[] arr) {
        System.out.println("HeapSort ascending...");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("HeapSort descending...");
    }

    @Override
    public void description() {
        System.out.println("숫자를 정렬하는 알고리즘입니다. : HeapSort 입니다.");
    }
}
