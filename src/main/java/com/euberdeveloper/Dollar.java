package com.euberdeveloper;

public class Dollar extends Money {
    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

}
