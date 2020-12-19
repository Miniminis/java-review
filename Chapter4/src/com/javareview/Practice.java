package com.javareview;

import java.util.Scanner;

public class Practice {
    public static void init() {
//        runFirst();
//        runSecond();
        runThird();
    }

    private static void runThird() {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i=0; i<num; i++) {
            for (int j=0; j<num; j++) {
                if(j<num-i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void runSecond() {
        /*홀수 입력받아서 별찍기*/
        Scanner scan = new Scanner(System.in);
        int lineCnt = scan.nextInt();
        int spaceCnt = lineCnt / 2 + 1;
        int starCnt = 1;

        for (int i = 0; i < lineCnt; i++) {  //세로
            //가로
            for (int j = 0; j < spaceCnt; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < starCnt; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < spaceCnt; j++) {
                System.out.print(" ");
            }
            System.out.println();

            if (i < lineCnt/2) {
                spaceCnt -= 1;
                starCnt += 2;
            } else {
                spaceCnt += 1;
                starCnt -= 2;
            }
        }
    }

    private static void runFirst() {
        /*연산자와 두 수를 변수로 선언한 후, 사칙연산이 수행되는 프로그램 만들기*/

        Scanner scan = new Scanner(System.in);
        char calculator = scan.next().trim().charAt(0);

        int a = 500;
        int b = 200;
        int result;

        switch (calculator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            default:
                result = 0;
        }

        System.out.println(result);
    }
}
