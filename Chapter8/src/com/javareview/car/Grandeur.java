package com.javareview.car;

public class Grandeur extends Car {
    @Override
    public void start() {
        System.out.println("Grandeur Start");
    }

    @Override
    public void drive() {
        System.out.println("Grandeur Drive");
    }

    @Override
    public void stop() {
        System.out.println("Grandeur Stop");
    }

    @Override
    public void turnOff() {
        System.out.println("Grandeur TurnOff");
    }

    @Override
    public void wash() {
        System.out.println("Grandeur Washing...");
    }
}
