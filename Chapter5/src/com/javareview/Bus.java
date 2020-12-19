package com.javareview;

public class Bus {
    int busNum;
    int money;
    int numOfPeople;
    final int BUS_FEE = 1000;

    Bus(int busNum) {
        this.busNum = busNum;
        this.money = 0;
        this.numOfPeople = 0;
    }

    public void takeBus() {
        this.money += BUS_FEE;
        this.numOfPeople++;
    }

    public void showBusInfo() {
        System.out.println("버스 : "+busNum+"의 수익: "+money+" 승객 수: "+numOfPeople);
    }
}
