package com.example.wallet.controller.businessObject;

public enum Currency {
    DOLLAR(74.85f), RUPEE(1f);

    private final float currencyValue;


    Currency(float currencyValue) {
        this.currencyValue = currencyValue;
    }

    public float getCurrencyValue() {
        return currencyValue;
    }
}