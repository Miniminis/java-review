package com.javareview;

public class Student {

//    private int studentNum;
    public int studentNum;
    public String studentName;

    Student () { }

    Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    public void showStudentInfo() {
        System.out.println("학번 : "+studentNum);
        System.out.println("이름 : "+studentName);
    }

}
