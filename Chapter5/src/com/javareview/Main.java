package com.javareview;

public class Main {

    public static void main(String[] args) {
        runStudentExample();
//        runCalculator();
//        runStudentInstanceExample();
//        runPersonalInfo();
    }

    private static void runPersonalInfo() {
        PersonalInfo pInfo = new PersonalInfo();
        pInfo.age = 35;
        pInfo.name = "Peter";
        pInfo.isMarried = false;
        pInfo.numOfChildren = 3;
        pInfo.showInfo();
    }

    private static void runStudentInstanceExample() {
        Student james = new Student();
        james.studentNum = 1;
        james.studentName = "James Oh";

        Student kelly = new Student();
        kelly.studentNum = 2;
        kelly.studentName = "Kelly Son";

        james.showStudentInfo();
        kelly.showStudentInfo();

        System.out.println(james);
        System.out.println(kelly);

        /*result
        학번 : 1
        이름 : James Oh
        학번 : 2
        이름 : Kelly Son
        com.javareview.Student@74a14482     //jvm 이 준 hashcode 값. 32비트.
        com.javareview.Student@1540e19d
        * */
    }

    private static void runCalculator() {
        Calculator calculator = new Calculator();

        calculator.sayHello("인삿말입니다.");
        int result = calculator.addNum(100, 5);
        System.out.println(result);

        int sum = calculator.calSum(100);
        System.out.println(sum);
    }

    private static void runStudentExample() {
        Student james = new Student();
        james.studentNum = 1;
        james.studentName = "James Oh";

        james.showStudentInfo();

        Student mark = new Student(12, "mark");
        mark.showStudentInfo();
    }
}
