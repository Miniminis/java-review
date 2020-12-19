package com.javareview;

public class Date {

    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public Date() {
//        this.isValid = true;
        this(9999, 99, 9);
        /*
        * this 로 다른 생성자를 초기화 할 수 있으나, 
        * 반드시 제일 첫 줄에 와야함
        * */
//        isValid = false;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.isValid = true;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            this.isValid = false;
        }
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일");
        } else {
            System.out.println("유효하지 않은 입력값입니다.");
        }
    }
}
