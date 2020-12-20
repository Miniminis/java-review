package com.javareview.computer;

public class ComputerTest {

    public static void run() {
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
