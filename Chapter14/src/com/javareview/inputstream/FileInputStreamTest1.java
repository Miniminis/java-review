package com.javareview.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {
    public static void run() {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("test.txt");

            int i = fis.read();
            System.out.print((char) i);
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.print("Programme END");
    }
}
