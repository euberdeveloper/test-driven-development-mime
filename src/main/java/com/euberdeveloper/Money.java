package com.euberdeveloper;

public class Money {
    protected int amount;

    public boolean equals(Object object) {
        Money dollar = (Money) object;
        return this.amount == dollar.amount;
    }
}
