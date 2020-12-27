package com.javareview.decoratorpattern;

public abstract class Decorator extends Coffee{     //decorator

    Coffee coffee;

    Decorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
