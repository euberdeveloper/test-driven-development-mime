package com.euberdeveloper;

public class Money {
    protected int amount;
    
    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }
}
