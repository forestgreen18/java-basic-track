package com.illiakornyk.stringoperations;


import java.util.*;

public class StringOperations {

    private int studentId;
    private StringBuffer sfText;

    public StringOperations(int studentId, String inputText) {
        this.studentId = studentId;
        this.sfText = new StringBuffer(inputText);
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void performTextOperation(char targetLetter) {
        int C17 = studentId % 17;

        System.out.println("C3 (studentId % 3): " + (studentId % 3));
        System.out.println("C17 (studentId % 17): " + C17);

        try {
            if (C17 == 8) {
                sortWordsByLetterFrequency(targetLetter);
            } else {
                System.out.println("No specific operation defined for C17: " + C17);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
    private void sortWordsByLetterFrequency(char targetLetter) {
        String[] words = sfText.toString().split("\\s+");
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        for (String word : words) {
            int frequency = countOccurrences(word, targetLetter);
            wordFrequencyMap.put(word, frequency);
        }

        List<String> sortedWords = new ArrayList<>(wordFrequencyMap.keySet());
        sortedWords.sort(Comparator.comparingInt(wordFrequencyMap::get));

        System.out.println("Words sorted by frequency of letter '" + targetLetter + "':");
        for (String word : sortedWords) {
            System.out.println(word + " (Frequency: " + wordFrequencyMap.get(word) + ")");
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
