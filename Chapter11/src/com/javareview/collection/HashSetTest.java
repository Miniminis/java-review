package com.javareview.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void run() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("이순신");
        hashSet.add("강감찬");
        hashSet.add("세종대왕");
        hashSet.add("이순신");

        System.out.println(hashSet);        //[강감찬, 이순신, 세종대왕] - 중복 안됨, 순서 없음

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}


