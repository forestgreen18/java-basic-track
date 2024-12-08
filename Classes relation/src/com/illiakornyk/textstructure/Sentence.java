package com.illiakornyk.textstructure;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Object> elements; // Can be Word or Punctuation

    public Sentence(String sentence) {
        this.elements = new ArrayList<>();
        String[] tokens = sentence.split("(?=[,.!?])|\\s+");
        for (String token : tokens) {
            if (token.matches("\\p{Punct}")) {
                elements.add(new Punctuation(token.charAt(0)));
            } else {
                elements.add(new Word(token));
            }
        }
    }

    public List<Object> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object element : elements) {
            sb.append(element.toString());
        }
        return sb.toString();
    }
}
