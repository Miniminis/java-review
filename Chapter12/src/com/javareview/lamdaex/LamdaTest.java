package com.javareview.lamdaex;

public class LamdaTest {

    public static void run() {
        MyMaxNumber maxNumber = (x, y) -> (x >= y) ? x : y;
        System.out.println(maxNumber.getMaxNumber(1, 100));
    }

    /* lamda식 원리를 알아보자 */

    public static void run2() {
        StringConcat oldConcat = new StringConcatImpl();
        oldConcat.makeString("hello", "java1");

        StringConcat newConcat = (str1, str2) -> System.out.println(str1+", "+str2);
        newConcat.makeString("hello", "java2");

        StringConcat newConcat2 = new StringConcat() {
            @Override
            public void makeString(String str1, String str2) {
                System.out.println(str1+", "+str2);
            }
        };
        newConcat2.makeString("hello", "java3");
    }
}
