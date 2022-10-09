package com.euberdeveloper;

public class Money implements Expression {
    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Dollar(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Franc(amount, "CHF");
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public String currency() {
        return this.currency;
    }

    public Money times(int multiplier) {
        return null;
    }

    public Expression plus(Money addend) {
        return new Sum(this,addend);
    }

    @Override
    public Money reduce(Bank bank, String to) {
        int rate = (currency.equals("CHF") && to.equals("USD")) ? 2 : 1;
        return new Money(amount / rate, to);
    }

    @Override
    public String toString() {
        return this.amount + " " + this.currency;
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount && this.currency().equals(money.currency());
    }

}
