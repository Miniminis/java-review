package com.javareview.stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTest2 {

    public static void run() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("thomas");
        arrayList.add("admin");
        arrayList.add("jelly");
        arrayList.add("house");
        arrayList.add("yellow");

        Stream stream = arrayList.stream();
        stream.sorted().forEach(s -> System.out.print(s+" "));
        System.out.println();

//        System.out.println(stream.count());
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

        System.out.println();
        arrayList.stream().map(s->s.length()).forEach(s -> System.out.print(s+" "));
    }
}
