package com.javareview;

public class AutoCloseObj implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("자동 종료 되었습니다.");
    }
}
