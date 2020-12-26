package com.javareview.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamPractice {


    public static void run() {

        List<Traveler> travelers = new ArrayList<>();
        travelers.add(new Traveler(1, "이순신", 40, 100));
        travelers.add(new Traveler(2, "김유신", 20, 100));
        travelers.add(new Traveler(3, "홍길동", 13, 50));

        System.out.println(travelers);
        System.out.println();

        travelers.stream().map(c->c.getCustomerName()).forEach(s->System.out.println(s));
        System.out.println();


        System.out.println(
                travelers.stream().mapToInt(c->c.getPrice()).sum()
        );
        System.out.println();


        travelers.stream().filter(c->c.getCustomerAge()>=20).map(c->c.getCustomerName()).sorted().forEach(s->System.out.println(s));
        System.out.println();

    }
}
