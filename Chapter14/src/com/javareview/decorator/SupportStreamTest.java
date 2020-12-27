package com.javareview.decorator;

import java.io.*;

public class SupportStreamTest {

    public static void run() {
        long millseconds = 0;

        try (FileInputStream fis = new FileInputStream("zootopia.zip");
             FileOutputStream fos = new FileOutputStream("zootopia_re_copy.zip");
             BufferedInputStream bis = new BufferedInputStream(fis);
             BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            millseconds = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }

            millseconds = System.currentTimeMillis() - millseconds;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(millseconds);        //337703 - 약 33초 정도
                                                //772
    }
}
