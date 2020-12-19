package com.javareview;

import java.util.Scanner;

public class IfElse {

    public static void init() {
        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();

        if (keyword.equals("gender")) {
            rungender();
        } else if (keyword.equals("fee")) {
            runfee();
        } else if (keyword.equals("grade")) {
            rungrade();
        } else if (keyword.equals("ifelse")) {
            //조건연산자
            runif();
        } else if (keyword.equals("switch")) {
            runswitchsentence();
        } else if (keyword.equals("days")) {
            rundatecalculator();
        }
    }

    private static void rundatecalculator() {
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int numofdays;

        switch(month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numofdays = 31;
                break;
            case 2:
                numofdays = 28;
                break;
            case 4: case 6: case 9: case 11:
                numofdays = 30;
                break;
            default:
                numofdays = 0;
                System.out.println("error");
                break;
        }

        System.out.println(month+"월의 총 날짜 수는 "+numofdays+"일 입니다.");
    }

    private static void runswitchsentence() {
        //메달 색 정하기

        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        char medal;

        switch(grade) {
            case 1:
                medal = '금';
                break;
            case 2:
                medal = '은';
                break;
            case 3:
                medal = '동';
                break;
            default:
                medal = '노';
                break;
        }

        System.out.println(grade+"등은 "+medal+"메달 입니다.");
    }

    private static void runif() {
        int a = 10;
        int b = 20;
        int max;

        //삼항 연산자
        max = (a > b) ? a : b;
        System.out.println(max);
    }

    private static void runfee() {
        int age = 126;
        int fee = 0;

        if (age < 8) {
            //young
            fee = 0;
        } else if (age < 14) {
            //초딩
            fee = 1000;
        } else if (age < 20) {
            //중고딩
            fee = 2000;
        } else {
            //성인
            fee = 3000;
        }

        System.out.println("나이 : " + age);
        System.out.println("요금 : " + fee);
    }

    private static void rungender() {
        char gender = 'f';

        if (gender == 'f') {
            System.out.println("여성입니다!");
        } else if (gender == 'm') {
            System.out.println("남성입니다!");
        } else {
            System.out.println("여성도, 남성도 아닙니다!");
        }
    }

    private static void rungrade() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade = "";

        if (score >= 90) {
            grade = "a";
        } else if (score >= 80) {
            grade = "b";
        } else if (score >= 70) {
            grade = "c";
        } else if (score >= 60) {
            grade = "d";
        } else {
            grade = "f";
        }

        System.out.println("당신의 점수는 : " + score);
        System.out.println("당신의 학점은 : " + grade);
    }
}
