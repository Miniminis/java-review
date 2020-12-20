package com.javareview.car;

public class Sonata extends Car {
    @Override
    public void start() {
        System.out.println("Sonata Start");
    }

    @Override
    public void drive() {
        System.out.println("Sonata Drive");
    }

    @Override
    public void stop() {
        System.out.println("Sonata Stop");
    }

    @Override
    public void turnOff() {
        System.out.println("Sonata TurnOff");
    }

}
