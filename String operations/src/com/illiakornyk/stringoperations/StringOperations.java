package com.illiakornyk.stringoperations;

import java.util.*;

public class StringOperations {

    private int studentId;
    private StringBuffer textBuffer;
    private char targetLetter;

    public StringOperations(int studentId, StringBuffer textBuffer, char targetLetter) {
        this.studentId = studentId;
        this.textBuffer = textBuffer;
        this.targetLetter = targetLetter;
    }

    public void performTextOperation() {
        int C3 = studentId % 3;
        int C17 = studentId % 17;

        System.out.println("C3 (studentId % 3): " + C3);
        System.out.println("C17 (studentId % 17): " + C17);

        if (C3 == 2 && C17 == 8) {
            try {
                if (textBuffer == null || textBuffer.length() == 0) {
                    System.out.println("Text is empty. No operation performed.");
                    return;
                }
                sortWordsByLetterFrequency();
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        } else {
            System.out.println("The values C3 and C17 do not meet the required conditions for the operation.");
        }
    }

    private void sortWordsByLetterFrequency() {
        String text = textBuffer.toString();
        String[] words = text.split("\\s+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            int frequency = countOccurrences(word, targetLetter);
            wordFrequencyMap.put(word, frequency);
        }

        List<String> sortedWords = new ArrayList<>(wordFrequencyMap.keySet());
        sortedWords.sort(Comparator.comparingInt(wordFrequencyMap::get));

        boolean hasTargetLetter = sortedWords.stream().anyMatch(word -> wordFrequencyMap.get(word) > 0);

        if (!hasTargetLetter) {
            System.out.println("No words contain the letter '" + targetLetter + "'.");
            return;
        }

        System.out.println("Words sorted by letter frequency '" + targetLetter + "':");
        for (String word : sortedWords) {
            System.out.println(word + " (Frequency: " + wordFrequencyMap.get(word) + ")");
        }
    }

    private int countOccurrences(String word, char targetLetter) {
        int count = 0;
        char lowerCaseTarget = Character.toLowerCase(targetLetter);
        for (char c : word.toLowerCase().toCharArray()) {
            if (c == lowerCaseTarget) {
                count++;
            }
        }
        return count;
    }
}
