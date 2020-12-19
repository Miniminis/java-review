package com.javareview;

public class BreakAndContinue {
    public static void init() {
        /*break
         * - 자기 자신을 감싸고 있는 블록을 빠져나오는 현상
         * */

        /*continue
         * - 반복문의 수행 중, 조건문과 조건이 맞는 경우 이후 블록 내부의 다른 수행문을 수행하지 않음
         * */

//        runBreak();
//        runContinue();
        runMultiplication();
    }

    private static void runMultiplication() {
        /*구구단 응용
         * - 짝수단만 출력
         * - 단보다 곱하는 수가 작거나 같을 때까지만 출력
         * */

//        for (int i = 2; i < 10; i++) {
//            if (i % 2 != 0) continue;
//            for (int j = 2; j <= i; j++) {
//                System.out.println(i + "*" + j + "=" + i * j);
//            }
//        }
        for (int i = 2; i < 10; i++) {
            if (i % 2 != 0) continue;
            for (int j = 1; j <10; j++) {
                if (j>i) break;
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    private static void runContinue() {
        /*3의 배수만 출력*/
        int num = 1;

        while (num <= 100) {
            if (num % 3 != 0) {
                num++;
                continue;
            }
            System.out.println(num);
            num++;
//            if (num % 3 == 0) {
//                System.out.println(num);
//            }
//            num++;
        }
    }

    private static void runBreak() {

        int sum = 0;
        int i;
        for (i = 1; ; i++) {
            sum += i;
            if (sum >= 100) {
                break;
            }
        }

        System.out.println(sum);
        System.out.println(i);
    }
}
