package com.javareview.car;

public class Genesis extends Car {
    @Override
    public void start() {
        System.out.println("Genesis Start");
    }

    @Override
    public void drive() {
        System.out.println("Genesis Drive");
    }

    @Override
    public void stop() {
        System.out.println("Genesis Stop");
    }

    @Override
    public void turnOff() {
        System.out.println("Genesis TurnOff");
    }

    @Override
    public void wash() {
        System.out.println("Genesis Auto Washing...");
    }
}
