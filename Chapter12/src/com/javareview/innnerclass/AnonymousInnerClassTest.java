package com.javareview.innnerclass;

class Outer2 {

    int outNum = 1000;
    static int sNum = 2000;

    Runnable getRunnable(final int i) {

        final int num = 3000;

        return new Runnable() {     //한번밖에 안쓰이는 class 의 경우, 아래와 같이 익명 내부 클래스로 정의 가능
            @Override
            public void run() {
                System.out.println(i);
                System.out.println(num);

                System.out.println(outNum);
                System.out.println(sNum);
            }
        };
    }
}

public class AnonymousInnerClassTest {
    public static void run() {

        Outer2 outer = new Outer2();
        Runnable runnable = outer.getRunnable(4000);
        runnable.run();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println();
                System.out.println("runnable 익명 클래스 테스트");
            }
        };

        runnable1.run();
    }
}
