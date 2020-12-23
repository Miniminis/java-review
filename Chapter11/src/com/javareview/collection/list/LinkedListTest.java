package com.javareview.collection.list;

import java.util.LinkedList;

public class LinkedListTest {

    public static void run() {

        LinkedList<String> strs = new LinkedList<>();
        strs.add("A");
        strs.add("B");
        strs.add("C");
        strs.add("D");

        System.out.println(strs);   //toString 지원됨

        strs.add(1, "interupt");
        System.out.println(strs);   //toString 지원됨

        strs.removeFirst();
        System.out.println(strs);   //toString 지원됨

        /* list : 중복 허용, index 가 존재 */
        for (int i=0; i<strs.size(); i++) {
            String s = strs.get(i);
            System.out.println(s);
        }
    }
}
