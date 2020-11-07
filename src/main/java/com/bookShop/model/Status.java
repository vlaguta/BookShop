package com.bookShop.model;

public enum Status {

    PAID(1),
    NOTPAID(0);

    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
