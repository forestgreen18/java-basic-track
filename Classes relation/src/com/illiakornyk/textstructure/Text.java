package com.illiakornyk.textstructure;

import java.util.ArrayList;
import java.util.List;

public class Text {
    private List<Sentence> sentences;

    public Text(String text) {
        this.sentences = new ArrayList<>();
        String[] sentenceArray = text.split("(?<=\\.|!|\\?)\\s+");
        for (String sentence : sentenceArray) {
            sentences.add(new Sentence(sentence));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}
