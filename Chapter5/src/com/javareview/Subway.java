package com.javareview;

public class Subway {
    int lineNum;
    int money;
    int numOfPeople;
    final int SUBWAY_FEE = 1200;

    Subway(int lineNum) {
        this.lineNum = lineNum;
        this.money = 0;
        this.numOfPeople = 0;
    }

    public void takeSubway() {
        this.money += SUBWAY_FEE;
        this.numOfPeople ++;
    }

    public void showSubwayInfo() {
        System.out.println("버스 : "+lineNum+"의 수익: "+money+" 승객 수: "+numOfPeople);
    }
}
