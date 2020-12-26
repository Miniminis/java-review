package com.javareview.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest3 {

    public static void run() {
        TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
        treeSet.add("산타할아버지");
        treeSet.add("루돌프");
        treeSet.add("과자소년");
        treeSet.add("우이천");

        for (String str : treeSet) {
            System.out.println(str);
        }

        /* Comparable 과 Comparator 를 같이 구현하여, 정렬의 정의를 다르게 할 수 있다. */

        /*과자소년
        루돌프
        산타할아버지
        우이천*/

        /*우이천
        산타할아버지
        루돌프
        과자소년*/

    }
}

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2) * (-1);
    }
}
