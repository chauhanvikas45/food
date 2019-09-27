package com.qualteco.food.exception;

public class Merchant404Exception extends Exception {
    private static final Integer statusCode=404;

    public Merchant404Exception(String msg) {
        super(msg);
    }
}
