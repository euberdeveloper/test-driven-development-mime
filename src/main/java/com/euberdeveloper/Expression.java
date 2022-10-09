package com.euberdeveloper;

public interface Expression {
    public Money reduce(Bank bank, String to);
}
