package com.javareview.scheduler;

public class LeastConnection implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("대기 순서대로 연결됩니다.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("가장 통화량이 적은 상담원에 연결됩니다.");
    }
}
