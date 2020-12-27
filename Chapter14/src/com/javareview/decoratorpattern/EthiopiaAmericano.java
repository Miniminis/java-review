package com.javareview.decoratorpattern;

public class EthiopiaAmericano extends Coffee{     //Concete Component

    @Override
    public void brewing() {
        System.out.print("Ethiopia Americano brewing...");
    }
}
