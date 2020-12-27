package com.javareview.inputstream;

import java.io.IOException;

public class SystemInTest2 {

    public static void run() {
        /* -1반환 : end of stream */
        System.out.println("입력 : ");

        try {
            int i;
            while((i = System.in.read()) != '\n') {
                System.out.println((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
