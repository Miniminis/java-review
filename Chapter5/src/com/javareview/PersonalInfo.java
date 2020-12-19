package com.javareview;

public class PersonalInfo {
    int age;
    String name;
    Boolean isMarried;
    int numOfChildren;

    public void showInfo() {
        System.out.println("====================");
        System.out.println("나이: "+age);
        System.out.println("이름: "+name);
        System.out.println("결혼여부: "+isMarried);
        System.out.println("자녀 수: "+numOfChildren);
        System.out.println("====================");
    }
}
