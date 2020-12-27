package com.javareview;

import java.io.IOException;

public class ThreadEndTest extends  Thread{

    private boolean flag = false;
    int i;

    public ThreadEndTest(String name) {
        super(name);
    }

    public void run() {
        System.out.println("START");
        while(!flag) {
            try {
                sleep(100);
//                System.out.println("WAKE!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName()+"  ENDDDDD");
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main() throws IOException {
        ThreadEndTest threadA = new ThreadEndTest("ThreadA");
        ThreadEndTest threadB = new ThreadEndTest("ThreadB");

        threadA.start();
        threadB.start();

        int in;
        while (true) {
            in = System.in.read();
            if (in == 'A') {
                threadA.setFlag(true);
            } else if (in == 'B') {
                threadB.setFlag(true);
            } else if (in == 'M') {
                threadA.setFlag(true);
                threadB.setFlag(true);
                break;
            } else {
                System.out.println("Try Again!");
            }
        }
    }
}
