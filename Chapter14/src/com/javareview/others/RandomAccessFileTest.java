package com.javareview.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

    public static void run() throws IOException {

        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.write(123);
        rf.writeInt(123);
        rf.writeUTF("안녕");
        
        rf.seek(0);     //처음 위치로 이동
        System.out.println(rf.read());
        System.out.println(rf.readInt());
        System.out.println(rf.readUTF());

    }
}
