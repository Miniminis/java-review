package com.javareview.decoratorpattern;

public class KenyaAmericano extends Coffee{     //Concete Component

    @Override
    public void brewing() {
        System.out.print("Kenya Americano brewing...");
    }
}
