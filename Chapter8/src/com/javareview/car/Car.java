package com.javareview.car;

public abstract class Car {
    public abstract void start();
    public abstract void drive();
    public abstract void stop();
    public abstract void turnOff();
    public void wash(){};

    public void run() {
        start();
        drive();
        stop();
        turnOff();
        wash();
    }
}
