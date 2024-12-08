package com.illiakornyk.textstructure;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private List<Object> elements; // Can be Word or Punctuation

    public Sentence(String sentence) {
        this.elements = new ArrayList<>();
        String[] tokens = sentence.split("(?=[,.!?])|\\s+"); // Split by punctuation or spaces
        for (String token : tokens) {
            if (token.matches("\\p{Punct}")) {
                elements.add(new Punctuation(token.charAt(0)));
            } else if (!token.trim().isEmpty()) { // Exclude empty strings
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
