package com.euberdeveloper;

public class Franc extends Money {
    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }

    public boolean equals(Object object) {
        Money franc = (Money) object;
        return this.amount == franc.amount;
    }

}
