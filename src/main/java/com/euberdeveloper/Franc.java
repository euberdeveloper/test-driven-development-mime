package com.euberdeveloper;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
        this.currency = "CHF";
    }

    public Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}
