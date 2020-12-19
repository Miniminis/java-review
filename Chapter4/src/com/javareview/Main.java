package com.javareview;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String keyword = scanner.nextLine();

        if(keyword.equals("gender")) {
            runGender();
        } else if(keyword.equals("fee")) {
            runFee();
        } else if(keyword.equals("grade")) {
            runGrade();
        } else {
            //조건연산자
            runIf();
        }
    }

    private static void runIf() {
        int a = 10;
        int b = 20;
        int max;

        //삼항 연산자
        max = (a>b) ? a : b;
        System.out.println(max);
    }

    private static void runFee() {
        int age = 126;
        int fee = 0;

        if(age<8) {
            //young
            fee = 0;
        } else if(age<14) {
            //초딩
            fee = 1000;
        } else if(age<20) {
            //중고딩
            fee = 2000;
        } else {
            //성인
            fee = 3000;
        }

        System.out.println("나이 : "+age);
        System.out.println("요금 : "+fee);
    }

    private static void runGender() {
        char gender = 'F';

        if (gender=='F') {
            System.out.println("여성입니다!");
        } else if(gender=='M') {
            System.out.println("남성입니다!");
        } else {
            System.out.println("여성도, 남성도 아닙니다!");
        }
    }

    private static void runGrade() {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        String grade = "";

        if(score>=90) {
            grade = "A";
        } else if(score>=80) {
            grade = "B";
        } else if(score>=70) {
            grade = "C";
        } else if(score>=60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("당신의 점수는 : "+score);
        System.out.println("당신의 학점은 : "+grade);
    }
}
