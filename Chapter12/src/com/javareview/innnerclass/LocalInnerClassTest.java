package com.javareview.innnerclass;

class Outer {

    int outNum = 1000;
    static int sNum = 2000;

    Runnable getRunnable(final int i) {

        final int num = 1234;

        class MyRunnable implements Runnable {      //지역 내부 클래스
            @Override
            public void run() {

                /*java: local variables referenced from an inner class must be final or effectively final
                * run method 자체는 인스턴스가 생성되고 난 뒤에 언제든지 불릴 수 있으나
                * i 나 num 은 지역변수라서 그 생명주기가 짧아서 없어짐 */
//                num += 100;
//                i++;

                System.out.println(i);
                System.out.println(num);

                System.out.println(outNum);
                System.out.println(sNum);
            }
        }

        return new MyRunnable();
    }
}
public class LocalInnerClassTest {
    public static void run() {

        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable(0);
        runnable.run();
    }
}
