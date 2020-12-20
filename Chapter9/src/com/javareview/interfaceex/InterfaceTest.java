package com.javareview.interfaceex;

public class InterfaceTest {

    public static void run() {
//        Calc calculator = new CompleteCalculator();           //OK
//        Calculator calculator = new CompleteCalculator();     //OK
        CompleteCalculator calculator = new CompleteCalculator();

        System.out.println(calculator.add(100, 50));
        System.out.println(calculator.substract(100, 50));
        System.out.println(calculator.times(100, 50));
        System.out.println(calculator.divide(100, 0));
        calculator.showInfo();

    }
}
