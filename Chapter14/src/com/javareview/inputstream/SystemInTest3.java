package com.javareview.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest3 {

    public static void run() {
        System.out.println("입력 후 끝이라고 써 주세요!: ");

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in);
            while((i = isr.read()) != '끝') {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
