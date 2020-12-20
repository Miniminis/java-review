package com.javareview.player;

public class IntermediateLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("빠르게 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("점프!");
    }

    @Override
    public void turn() {
        System.out.println("돌기 불가!");
    }

    @Override
    public void showLevel() {
        System.out.println("==============중급자==============");
    }
}
