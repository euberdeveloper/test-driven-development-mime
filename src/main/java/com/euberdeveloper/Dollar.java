package com.euberdeveloper;

public class Dollar extends Money {
    private String currency;

    public Dollar(int amount) {
        this.amount = amount;
        this.currency = "USD";
    }

    public Money times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    @Override
    String currency() {
        return this.currency;
    }

}
