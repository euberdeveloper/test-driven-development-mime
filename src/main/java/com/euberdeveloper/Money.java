package com.euberdeveloper;

abstract public class Money {
    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    abstract Money times(int multiplier);

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && getClass().equals(money.getClass());
    }

    public String currency() {
        return this.currency;
    }

}
