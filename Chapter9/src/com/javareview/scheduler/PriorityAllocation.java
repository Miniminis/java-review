package com.javareview.scheduler;

public class PriorityAllocation implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("고객 우선순위 등급대로 통화가 연결됩니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("가장 숙련된 상담사에게 연결됩니다.");
    }
}
