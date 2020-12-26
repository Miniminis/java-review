package com.javareview.stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class StreamTest4 {

    public static void run() {
        String[] strings = {"Hello, Java!", "Greeting", "good morning, python", "hi"};

        System.out.println(Arrays.stream(strings).reduce(strings[0], (s1, s2) -> {
            if(s1.getBytes().length >= s2.getBytes().length) {
                return s2;
            } else {
                return s1;
            }
        }));

        /*만약에 위에 것이 너무 길다 싶으면 아래와 같이 표현할 수 있음*/

        System.out.println(
                Arrays.stream(strings).reduce(new CompareStrings()).get()
        );
    }
}

class CompareStrings implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if(s1.getBytes().length >= s2.getBytes().length) {
            return s2;
        } else {
            return s1;
        }
    }
}

