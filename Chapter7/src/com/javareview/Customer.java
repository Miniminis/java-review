package com.javareview;

public class Customer {

    private int serialNum = 1;
    private int customerID;
    private String customerName;
    private char customerGrade;     //S, G, V
    protected double bonusPoint;
    protected double bonusRatio;

    Customer(String customerName, char customerGrade) {
        this.customerID = serialNum;
        serialNum++;
        this.customerName = customerName;
        this.customerGrade = customerGrade;
        this.bonusPoint = 0;
        this.bonusRatio = 0.01;
    }

    public void buy(double price) {
        this.bonusPoint += price * bonusRatio;
    }

    public void showCustomerInto() {
        System.out.println("============"+this.customerName+"님의 정보============");
        System.out.println(customerID);
        System.out.println(customerGrade);
        System.out.println(bonusPoint);
        System.out.println(bonusRatio);
        System.out.println("===================================");
    }
}
