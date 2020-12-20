package com.javareview;

public class Card {

    private static int serialNum = 10000;
    private int cardNumber;

    Card() {
        serialNum++;
        cardNumber = serialNum;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}
