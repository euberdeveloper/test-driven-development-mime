package com.euberdeveloper;

import java.util.Hashtable;

public class Bank {
    public Hashtable<String, Pair> rates = new Hashtable<String, Pair>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public int rate(String from, String to) {
        return (from.equals("CHF") && to.equals("USD")) ? 2 : 1;
    }
}
