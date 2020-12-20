package com.javareview.computer;

public abstract class Computer {
    
    /*
    * 상위 클래스 용을 생성
    * */

    public abstract void display();
    public abstract void typing();       //추상매서드 - 책임을 하위 클래스에 위임한다.

    public void turnOn() {
        System.out.println("컴퓨터 전원 ON");
    }

    public void turnOff() {
        System.out.println("컴퓨터 전원 OFF");
    }
}
