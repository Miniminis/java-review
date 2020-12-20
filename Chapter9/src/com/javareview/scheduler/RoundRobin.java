package com.javareview.scheduler;

public class RoundRobin implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("대기 순서대로 연결됩니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("공평하게 통화량이 분배됩니다.");
    }
}
