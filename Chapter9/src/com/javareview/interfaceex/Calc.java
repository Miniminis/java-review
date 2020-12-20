package com.javareview.interfaceex;

public interface Calc {
    double PI = 3.14;
    int ERROR = -999999;

    int add(int a, int b);
    int substract(int a, int b);
    int times(int a, int b);
    int divide(int a, int b);
    
    /*
    * interface 는 구현코드가 없기 때문에 타입상속이라고 함
    * */
}
