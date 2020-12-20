package com.javareview;

public class Main {

    public static void main(String[] args) {
//        runArrayTest();
//        runBookTest();
//        runArrayCopyTest();
        runRefArrayCopyTest();
    }

    private static void runRefArrayCopyTest() {
        Book[] books1 = new Book[3];
        Book[] copiedBook = new Book[3];
        Book[] deepCopiedBook = new Book[3];

        for (int i = 0; i < books1.length; i++) {
            books1[i] = new Book("태백산맥" + i, "조정래" + i);
            books1[i].showBookInfo();
        }
        System.out.println("===");

        System.arraycopy(books1, 0, copiedBook, 0, books1.length);

        /*얕은 복사*/
        for (int i = 0; i < copiedBook.length; i++) {
            copiedBook[i].showBookInfo();
        }

        System.out.println("===");
        /*깊은 복사*/
        for (int i = 0; i < deepCopiedBook.length; i++) {
            deepCopiedBook[i] = new Book();
            deepCopiedBook[i].setType(books1[i].getType());
            deepCopiedBook[i].setTitle(books1[i].getTitle());
            deepCopiedBook[i].showBookInfo();
        }

        System.out.println("===");

        books1[0].setTitle("희말라야");
        books1[0].setType("docu");


        for (int i = 0; i < books1.length; i++) {
            books1[i].showBookInfo();
        }
        System.out.println("===");
        for (int i = 0; i < copiedBook.length; i++) {
            copiedBook[i].showBookInfo();
        }

        System.out.println("===");
        for (int i = 0; i < deepCopiedBook.length; i++) {
            deepCopiedBook[i].showBookInfo();
        }

        /*
        * copy 된 arr 도 같이 값이 바뀌는 것을 확인 가능! --> 같은 instance 값을 참조하고 있기 때문임.
        * ===
        희말라야::docu
        태백산맥1::조정래1
        태백산맥2::조정래2
        ===
        희말라야::docu
        태백산맥1::조정래1
        태백산맥2::조정래2
        * */

        /*
태백산맥0::조정래0
태백산맥1::조정래1
태백산맥2::조정래2
===
태백산맥0::조정래0
태백산맥1::조정래1
태백산맥2::조정래2
===
태백산맥0::조정래0
태백산맥1::조정래1
태백산맥2::조정래2
=== 원본
희말라야::docu
태백산맥1::조정래1
태백산맥2::조정래2
=== 얕은 복사
희말라야::docu
태백산맥1::조정래1
태백산맥2::조정래2
=== 깊은 복사
태백산맥0::조정래0
태백산맥1::조정래1
태백산맥2::조정래2
        * */

    }

    private static void runArrayCopyTest() {
        /*
         * 기본 자료형의 복사
         * */
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.arraycopy(arr1, 1, arr2, 0, 3);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    private static void runBookTest() {
        Book[] books = new Book[5];

        books[0] = new Book("title1", "novel");
        books[1] = new Book("title2", "essay");

        for (int i = 0; i < books.length; i++) {
            books[i].showBookInfo();
        }
    }

    private static void runArrayTest() {
//        ArrayTest.runArrayTest();
//        ArrayTest.runDoubleArrayTest();
//        ArrayTest.runCharArrayTest();
    }
}
