package com.javareview.inputstream;

import java.io.IOException;

public class SystemInTest {

    public static void run() {
        /* -1반환 : end of stream */
        System.out.println("입력 : ");

        try {
            int i = System.in.read();
            System.out.println(i);
            System.out.println((char)i);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
