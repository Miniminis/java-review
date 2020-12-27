package com.javareview.decorator;

import java.io.*;

public class DataStreamTest {
    public static void run() throws FileNotFoundException {

        try (FileOutputStream fos = new FileOutputStream("data.txt");
             DataOutputStream dos = new DataOutputStream(fos);
             FileInputStream fis = new FileInputStream("data.txt");
             DataInputStream dis = new DataInputStream(fis)) {

            dos.writeByte(100);
            dos.writeChar('T');
            dos.writeUTF("Corona, go away");

            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("ENDDD");

    }
}
