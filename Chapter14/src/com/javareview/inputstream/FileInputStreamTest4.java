package com.javareview.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

    public static void run() {
        try (FileInputStream fis = new FileInputStream("test2.txt")){
            int i;
            byte[] bytes = new byte[10];

            while((i = fis.read(bytes)) != -1) {
                System.out.println("-=====");
                System.out.println(i);
                System.out.println("-=====");

                for(int k = 0; k<i; k++) {
                    System.out.print((char) bytes[k]);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Test4 END");
    }
}
