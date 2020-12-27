package com.javareview.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest {
    public static void run() throws IOException {
        /* 방법 1 : FileReader 를 써서 문자 기반으로 파일을 읽는다. */
//        FileReader fis = new FileReader("test5.txt");

        /* 방법 2 : 보조 스트림을 중간에 껴서 문자로 변환시켜준다. */
        FileInputStream fis = new FileInputStream("test5.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        int i;
//        while ((i = fis.read()) != -1) {
        while ((i = isr.read()) != -1) {
            System.out.print((char) i);
        }

//        fis.close();
        isr.close();

        //ìëíì¸ì, ì´ê²ì íê¸ìëë¤. ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ
        //안녕하세요, 이것은 한글입니다. ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ
    }
}
