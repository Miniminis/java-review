package com.javareview.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void run() {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("test2.txt");

            int i;
            while((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.print("Programme END");
    }
}
