package com.javareview.decorator;

import java.io.*;
import java.net.Socket;

public class SupportStreamTest2 {

    public static void run() throws IOException {
        Socket socket = new Socket();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        bufferedReader.readLine();
    }
}
