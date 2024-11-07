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
