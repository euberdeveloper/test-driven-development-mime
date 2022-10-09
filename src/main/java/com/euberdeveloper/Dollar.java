package com.euberdeveloper;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Dollar(this.amount * multiplier, "USD");
    }

}
