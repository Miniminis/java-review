package com.javareview.decoratorpattern;

public class MochaLatte extends Decorator{

    MochaLatte(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("Add Mocha Syrup");
    }
}
