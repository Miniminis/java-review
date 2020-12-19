package com.javareview;

public class Employee {
    String name;
    int money;

    Employee(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void showEmployeeInfo() {
        System.out.println("현재 "+name+"님의 잔액은 "+money+"원 입니다.");
    }

    public void takeBus(Bus bus) {
        this.money -= bus.BUS_FEE;
        bus.takeBus();
    }

    public void takeSubway(Subway subway) {
        this.money -= subway.SUBWAY_FEE;
        subway.takeSubway();
    }
}
