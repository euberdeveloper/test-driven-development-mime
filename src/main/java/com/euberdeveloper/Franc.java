package com.euberdeveloper;

public class Franc extends Money {
    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
