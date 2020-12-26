package com.javareview.innnerclass;

public class InnerTest {

    public static void run() {
        OutClass outClass = new OutClass();
        outClass.usingInnerClass();

        System.out.println();

        /* 문법적으로 가능하지만, 내부클래스를 외부에서 직접 인스턴스 생성을 해야할 일이 있다면,
        내부클래스가 아닌, 외부 클래스로 빼는 것이 맞다.*/
//        OutClass.InClass inClass = outClass.new InClass();
//        inClass.inTest();

        OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
        OutClass.InStaticClass.sTest();

        System.out.println();

        System.out.println(inStaticClass.inNum);
        inStaticClass.inTest();

        System.out.println("===");
        inStaticClass.sTest();
        System.out.println(inStaticClass.sInNum);
    }
}

class OutClass {
    private int num = 10;
    private static int sNum = 20;
    private InClass inClass;

    public OutClass() {
        this.inClass = new InClass();
    }

    private class InClass {
        int iNum = 100;
//        static int sInNum = 200;  outclass 생성 이후에 접근할 수 있기 때문에 에러가 남

        void inTest() {
            System.out.println(num);
            System.out.println(sNum);
        }
    }

    public void usingInnerClass() {
        inClass.inTest();
    }

    static class InStaticClass {
        int inNum = 100;
        static int sInNum = 200;

        void inTest() {
            System.out.println(inNum);
            System.out.println(sInNum);
            System.out.println(sNum);
        }

        static void sTest() {
//            System.out.println(inNum);      //인스턴스 생성이 되어야 사용 가능하다.
            System.out.println(sInNum);
            System.out.println(sNum);
        }
    }

}
