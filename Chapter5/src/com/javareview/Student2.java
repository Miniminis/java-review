package com.javareview;

public class Student2 {

    private static int serialNum = 1000;
    private int studentNum;
    private String studentName;

    public static int getSerialNum() {
        //static 변수, static method
        return serialNum;
    }

    Student2(String studentName) {
        this.studentName = studentName;
        serialNum++;
        this.studentNum = serialNum;
    }

    public void showStudentInfo() {
        System.out.println("시리얼넘버 : "+serialNum);
        System.out.println("학번 : "+studentNum);
        System.out.println("이름 : "+studentName);
    }

}
