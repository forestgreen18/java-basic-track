package com.illiakornyk.textstructure;

import java.util.Map;

public class Punctuation {
    private char symbol;

    public Punctuation(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }


}
