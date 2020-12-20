package com.javareview.car;

public class Avante extends Car {
    @Override
    public void start() {
        System.out.println("Avante Start");
    }

    @Override
    public void drive() {
        System.out.println("Avante Drive");
    }

    @Override
    public void stop() {
        System.out.println("Avante Stop");
    }

    @Override
    public void turnOff() {
        System.out.println("Avante TurnOff");
    }

}
