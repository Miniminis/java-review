package com.javareview.lamdaex;

@FunctionalInterface        //함수형 인터페이스 임을 명시
public interface MyMaxNumber {

    int getMaxNumber(int x, int y);
//    void getMaxNumber2(int x, int y);     //함수형 인터페이스에서는 매서드를 1개 이상 정의하지 못한다.
}
