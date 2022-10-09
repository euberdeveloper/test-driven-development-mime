package com.euberdeveloper;

import java.util.Hashtable;

public class Bank {
    public Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public int rate(String from, String to) {
        return from.equals(to) ? 1 : rates.get(new Pair(from, to));

    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }
}
