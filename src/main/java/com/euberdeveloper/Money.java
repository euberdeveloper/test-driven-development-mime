package com.euberdeveloper;

abstract public class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }
    public static Money franc(int amount) {
        return new Franc(amount);
    }

    abstract Money times(int multiplier);
    abstract String currency();

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }

}
