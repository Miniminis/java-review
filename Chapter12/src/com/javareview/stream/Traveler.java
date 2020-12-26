package com.javareview.stream;

public class Traveler {

    private int customerNum;
    private String customerName;
    private int customerAge;
    private int price;

    Traveler(int customerNum, String customerName, int customerAge, int price) {
        this.customerNum = customerNum;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.price = price;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return customerNum + ": "+ customerName+": "+customerAge+": "+price;
    }
}
