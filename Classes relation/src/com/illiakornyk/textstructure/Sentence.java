package com.illiakornyk.textstructure;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private final List<Object> elements; // Can be Word or Punctuation

    public Sentence(String sentence) {
        this.elements = new ArrayList<>();
        String[] tokens = sentence.split("(?=[,.!?])|\\s+"); // Split by punctuation or spaces
        for (String token : tokens) {
            if (!token.trim().isEmpty()) {
                if (token.matches("\\p{Punct}+")) {
                    for (char c : token.toCharArray()) {
                        elements.add(new Punctuation(c));
                    }
                } else { // Treat as a word
                    elements.add(new Word(token));
                }
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
