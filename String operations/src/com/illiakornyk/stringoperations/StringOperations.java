package com.illiakornyk.stringoperations;

import java.util.*;

public class StringOperations {

    private int studentId = 8;
    private StringBuffer textBuffer = new StringBuffer("Example text with various words to sort by frequency.");
    private char targetLetter = 'e';

    public StringOperations() {}

    public void performTextOperation() {
        int C3 = studentId % 3;
        int C17 = studentId % 17;

        System.out.println("C3 (studentId % 3): " + C3);
        System.out.println("C17 (studentId % 17): " + C17);

        if (C3 == 2 && C17 == 8) {
            try {
                sortWordsByLetterFrequency();
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } else {
            System.out.println("Значення C3 і C17 не відповідають необхідним умовам для виконання операції.");
        }
    }

    private void sortWordsByLetterFrequency() {
        String[] words = textBuffer.toString().split("\\s+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            int frequency = countOccurrences(word, targetLetter);
            wordFrequencyMap.put(word, frequency);
        }

        List<String> sortedWords = new ArrayList<>(wordFrequencyMap.keySet());
        sortedWords.sort(Comparator.comparingInt(wordFrequencyMap::get));

        System.out.println("Слова, відсортовані за частотою літери '" + targetLetter + "':");
        for (String word : sortedWords) {
            System.out.println(word + " (Частота: " + wordFrequencyMap.get(word) + ")");
        }
    }

    private int countOccurrences(String word, char targetLetter) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c == targetLetter) {
                count++;
            }
        }
        return count;
    }
}
