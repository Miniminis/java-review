package com.javareview.practice;

import java.io.IOException;

public class PracticeTest {
    public static void run() throws IOException {
        Sort sortingType;

        System.out.println("정렬방식을 선택해주세요.");
        System.out.println("B : BubbleSorting");
        System.out.println("H : HeapSorting");
        System.out.println("Q : QuickSorting");

        int ch = System.in.read();

        if(ch == 'B' || ch == 'b') {
            sortingType = new BubbleSort();
        } else if (ch == 'H' || ch == 'h') {
            sortingType = new HeapSort();
        } else if (ch == 'Q' || ch == 'q') {
            sortingType = new QuickSort();
        } else {
            System.out.println("지원하지 않는 형식입니다!");
            return;
        }

        int[] arr = {1, 22, 333};
        sortingType.ascending(arr);
        sortingType.descending(arr);
        sortingType.description();
    }
}
