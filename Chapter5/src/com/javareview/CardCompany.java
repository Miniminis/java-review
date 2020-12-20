package com.javareview;

public class CardCompany {

    private static CardCompany instance;

    private CardCompany() {}

    public static CardCompany getInstance() {
        if(instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard() {
        return new Card();
    }
}
