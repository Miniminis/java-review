package com.javareview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest2 {

    public static void run() {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
//            return;
        } finally {
            try {
                fis.close();    //resource 해제
                System.out.println("finally");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        System.out.println("프로그램 종료");
    }
}
