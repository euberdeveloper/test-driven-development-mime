package com.euberdeveloper;

class Dollar {
    int amount;

    Dollar(int amount) {
        this.amount = amount;
    }

    Dollar times(int multiplier) {
        this.amount *= 2;
        return null;
    }
}
