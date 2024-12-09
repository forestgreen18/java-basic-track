package com.illiakornyk.stringoperations;

import com.illiakornyk.textstructure.Letter;
import com.illiakornyk.textstructure.Sentence;
import com.illiakornyk.textstructure.Text;
import com.illiakornyk.textstructure.Word;

import java.util.*;

public class StringOperations {
    private final int studentId;
    private final Text text;
    private final char targetLetter;

    public StringOperations(int studentId, String rawText, char targetLetter) {
        this.studentId = studentId;
        this.targetLetter = targetLetter;

        // Clean up raw text: replace multiple spaces/tabs with a single space
        String cleanedText = rawText.replaceAll("\\s+", " ");
        this.text = new Text(cleanedText);
    }

    /**
     * Performs a text operation based on the student's ID modulo calculations.
     * <p>
     * If the conditions (C3 == 2 and C17 == 8) are met, it checks if the text is empty.
     * If the text is non-empty, it proceeds to sort the words in the text by the frequency
     * of the target letter. If the conditions are not met, or if an error occurs, an appropriate
     * message is printed.
     * <p>
     * This method relies on the studentId and text fields of the class.
     */
    public void performTextOperation() {
        int C3 = studentId % 3;
        int C17 = studentId % 17;

        System.out.println("C3 (studentId % 3): " + C3);
        System.out.println("C17 (studentId % 17): " + C17);

        if (C3 == 2 && C17 == 8) {
            try {
                if (text.getSentences().isEmpty()) {
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

    /**
     * Sorts all words in the given text by frequency of the target letter.
     * Prints out the sorted words in descending order of frequency, with the frequency of each word.
     * If no words contain the target letter, prints a message to that effect.
     */
    private void sortWordsByLetterFrequency() {
        List<Word> allWords = new ArrayList<>();
        for (Sentence sentence : text.getSentences()) {
            for (Object element : sentence.getElements()) {
                if (element instanceof Word) {
                    allWords.add((Word) element);
                }
            }
        }

        Map<Word, Integer> wordFrequencyMap = new HashMap<>();
        for (Word word : allWords) {
            int frequency = countOccurrences(word, targetLetter);
            wordFrequencyMap.put(word, frequency);
        }

        List<Word> sortedWords = new ArrayList<>(wordFrequencyMap.keySet());
        sortedWords.sort(Comparator.comparingInt(wordFrequencyMap::get));

        boolean hasTargetLetter = sortedWords.stream().anyMatch(word -> wordFrequencyMap.get(word) > 0);

        if (!hasTargetLetter) {
            System.out.println("No words contain the letter '" + targetLetter + "'.");
            return;
        }

        System.out.println("Words sorted by letter frequency '" + targetLetter + "':");
        for (Word word : sortedWords) {
            System.out.println(word + " (Frequency: " + wordFrequencyMap.get(word) + ")");
        }
    }

    private int countOccurrences(Word word, char targetLetter) {
        int count = 0;
        char lowerCaseTarget = Character.toLowerCase(targetLetter);
        for (Letter letter : word.getLetters()) {
            if (Character.toLowerCase(letter.getCharacter()) == lowerCaseTarget) {
                count++;
            }
        }
        return count;
    }
}
