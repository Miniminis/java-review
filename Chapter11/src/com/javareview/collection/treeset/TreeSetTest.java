package com.javareview.collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

    public static void run() {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("강감찬");
        treeSet.add("홍길동");
        treeSet.add("염라대왕");
        treeSet.add("나재수");

        for (String str : treeSet) {
            System.out.println(str);
        }

        /* 결과 : 정렬된 상태! - String 내부에서 Comparable 인터페이스를 구현했기 때문.
        * 강감찬
        나재수
        염라대왕
        홍길동
        * */
    }
}
