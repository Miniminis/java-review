package com.javareview.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void run() {

        try (FileInputStream fis = new FileInputStream("test2.txt")){
            int i;
            while((i = fis.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.print("Test3 END");
    }
}
