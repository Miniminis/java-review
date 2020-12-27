package com.javareview.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {
    public static void run() {

        try (FileOutputStream fos = new FileOutputStream("test3.txt", true)){
            fos.write(79);
            fos.write(78);
            fos.write(77);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("Test4 for OutputStream END");
    }
}
