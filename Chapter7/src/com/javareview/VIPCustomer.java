package com.javareview;

public class VIPCustomer extends Customer{

    private double salesPercent;
    private String privateManager;

    VIPCustomer(String customerName, char customerGrade, String privateManager) {
        super(customerName, customerGrade);     //this - 자기자신, super - 상위클래스의 default constructor
        this.bonusRatio = 0.05;
        this.salesPercent = 0.9;
        this.privateManager = privateManager;
    }

    @Override
    public void buy(double price) {
        price = price * salesPercent;
        super.buy(price);
    }
}
