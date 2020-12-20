package com.javareview;

import java.util.ArrayList;

public class Student {

    private int studentNum;
    private String studentName;
    private ArrayList<Subject> subjects;

    Student(int studentNum, String studentName) {
        this.studentNum = studentNum;
        this.studentName = studentName;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subjectName, int subjectScore) {
        Subject subject = new Subject(subjectName, subjectScore);
        subjects.add(subject);
    }

    public void showStudentInfo() {
        System.out.println("====학생 "+studentName+"의 정보 START =========");
        System.out.println("학생번호 "+studentNum);

        for(Subject subj : subjects) {
            System.out.println(subj.getSubjectName()+"과목 점수 : "+subj.getSubjectScore());
        }

        System.out.println("====학생 "+studentName+"의 정보 END =========");
    }
}
