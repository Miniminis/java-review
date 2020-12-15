package com.javareview;

public class Main {

    public static void main(String[] args) {

        /*단락 논리 회로*/
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1+10) < 10) && ((i = i+2)<10);
        System.out.println(num1);
        System.out.println(i);

        System.out.println(value);
        /*
        * num1 의 값은 계산을 하고
        * 그 결과과 false 이므로 
        * 그 뒤의 i 와 관련된 연산을 처리하지 않은 것임!!!
        * */
        
        
        /*삼항연산자*/
        int num2 = 10;
        int num3 = 20;
        int max = (num2>num3)?num2:num3;
        System.out.println(max);

        System.out.println("============비트연산자===========");

        /*bit 연산자*/
        int num4 = 0B00001010; //10
        int num5 = 0B00000101; //5

        System.out.println(num4 & num5);    //00000000
        System.out.println(num4 | num5);    //00001111
        System.out.println(num4 ^ num5);    //00001111

        System.out.println(num5 << 3);      //40
        System.out.println(num5 <<= 3);     //40
        System.out.println(num5 >> 1);      //20
        System.out.println(num5);           //40
    }
}
