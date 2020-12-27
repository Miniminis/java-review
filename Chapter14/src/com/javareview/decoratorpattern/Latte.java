package com.javareview.decoratorpattern;

public class Latte extends Decorator {

    Latte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Add Milk");
    }
}
