package com.javareview.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void run() throws IOException {
        FileWriter fw = new FileWriter("writer.txt");

        char[] chars = {'B', 'C', 'D', 'E'};
        fw.write(97);
        fw.write(chars);
        fw.write("얄루");
        fw.write(chars, 1, 3);

        fw.close();
    }
}
