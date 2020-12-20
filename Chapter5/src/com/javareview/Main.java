package com.javareview;

public class Main {

    public static void main(String[] args) {
//        runStudentExample();
//        runCalculator();
//        runStudentInstanceExample();
//        runPersonalInfo();
//        runPersonExample();
//        runGoToCompanyExample();
//        runStaticExample();
//        runSingletonExample();

        runCardPractice();
    }

    private static void runCardPractice() {
        CardCompany company = CardCompany.getInstance();
        System.out.println(Card.getSerialNum());

        Card myCard = company.createCard();
        System.out.println(myCard.getCardNumber());
        System.out.println(Card.getSerialNum());

        Card yourCard= company.createCard();
        System.out.println(yourCard.getCardNumber());
        System.out.println(Card.getSerialNum());
    }

    private static void runSingletonExample() {
//        Company company = new Company();    //singleton 에 의해서 instance 생성 안됨.
        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();
        Company company3 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);
        System.out.println(company3);

        /*
        com.javareview.Company@74a14482
        com.javareview.Company@74a14482
        com.javareview.Company@74a14482
        * */
    }

    private static void runStaticExample() {

        System.out.println(Student2.getSerialNum());

        Student2 jenny = new Student2("Jenny");
        jenny.showStudentInfo();

        Student2 tom = new Student2("Tom");
        tom.showStudentInfo();

        jenny.showStudentInfo();

        /*
        1000

        시리얼넘버 : 1001
        학번 : 1001
        이름 : Jenny

        시리얼넘버 : 1002
        학번 : 1002
        이름 : Tom

        시리얼넘버 : 1002
        학번 : 1001
        이름 : Jenny
        * */
    }

    private static void runGoToCompanyExample() {
        /*
        * employee 들의 출근길
        * - 버스
        * - 지하철
        * */
        Employee kim = new Employee("kim", 10000);
        Employee son = new Employee("son", 9000);

        Bus bus123 = new Bus(123);
        Bus bus140 = new Bus(140);

        Subway line2 = new Subway(2);
        Subway line4 = new Subway(4);

        kim.takeBus(bus140);
        son.takeSubway(line4);

        kim.showEmployeeInfo();
        son.showEmployeeInfo();

        bus123.showBusInfo();
        bus140.showBusInfo();

        line2.showSubwayInfo();
        line4.showSubwayInfo();
    }

    private static void runPersonExample() {
        /*정보은닉*/
        /*public
        * 문제점: 유효하지 않은 값이 들어왔을때, 처리가 어려움.
        * */
//        Date today = new Date();
//        today.year = 1993;
//        today.month = 1234;
//        today.day = 19;

//        today.showDate();

        /*private
        * 1. getter 만 허용하여 readOnly 데이터로 만들 수 있음
        * 2. 유효하지 않은 값에 대하여 처리할 수 있음
        * */
        Date today = new Date();
        today.setYear(1993);
        today.setMonth(12);
        today.setDay(19);

        today.showDate();
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
