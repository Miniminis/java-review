package com.javareview;

public class Main {

    public static void main(String[] args) {
        runComputerExample();
    }

    private static void runComputerExample() {
//        Computer computer = new Computer();
//        Computer computer = new NoteBook();
        Computer desktop = new Desktop();
        desktop.turnOn();
        desktop.display();

        Computer computer = new MyLaptop();
        computer.turnOn();
        computer.display();
    }


}
