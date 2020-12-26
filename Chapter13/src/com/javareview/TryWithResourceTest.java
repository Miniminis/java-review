package com.javareview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceTest {

    public static void run() {
        try (AutoCloseObj obj = new AutoCloseObj()){

        } catch (Exception e) {
            System.out.println(e);
        }

        //자동 종료 되었습니다.
    }

    public static void run2() {

        try (FileInputStream fis = new FileInputStream("a.txt")){

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("프로그램 종료!");
    }
}
