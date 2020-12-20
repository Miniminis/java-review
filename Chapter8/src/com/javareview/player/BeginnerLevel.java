package com.javareview.player;

public class BeginnerLevel extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프 불가!");
    }

    @Override
    public void turn() {
        System.out.println("돌기 불가!");
    }

    @Override
    public void showLevel() {
        System.out.println("==============초보자==============");
    }
}
