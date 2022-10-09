package com.euberdeveloper;

public class Bank {
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
