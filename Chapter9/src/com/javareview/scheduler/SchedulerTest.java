package com.javareview.scheduler;

import java.io.IOException;

public class SchedulerTest {

    public static void run() throws IOException {
        /*
        * 상담원 연결 방식 선택
        * - R
        * - L
        * - P
        *
        * 각 연결방식에 대한 안내문구 출력
        * */

        Scheduler scheduler;

        System.out.println("상담원 연결 방식을 선택해주세요.");
        System.out.println("Press R : Round Robin");
        System.out.println("Press L : Least Connection");
        System.out.println("Press P : Priority Allocation");

        int ch = System.in.read();

        if(ch == 'R' || ch == 'r') {
            scheduler = new RoundRobin();
        } else if (ch == 'L' || ch == 'l') {
            scheduler = new LeastConnection();
        } else if (ch == 'P' || ch == 'p') {
            scheduler = new PriorityAllocation();
        } else {
            System.out.println("지원하지 않는 방식입니다!");
            return;
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
