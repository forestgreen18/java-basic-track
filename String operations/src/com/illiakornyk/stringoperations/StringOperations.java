package com.illiakornyk.stringoperations;


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

}
