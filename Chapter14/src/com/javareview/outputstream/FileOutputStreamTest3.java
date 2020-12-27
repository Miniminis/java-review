package com.javareview.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
    public static void run() {

        byte[] bs = new byte[26];
        byte num = 65;
        for (int i = 0; i<bs.length; i++) {
            bs[i] = num;
            num++;
        }

        try (FileOutputStream fos = new FileOutputStream("test5.txt", true);
             FileInputStream fis = new FileInputStream("test5.txt")){

            fos.write(bs);

            int ch;
            while((ch  = fis.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println();
        System.out.println("Test5 for OutputStream END");
    }
}
