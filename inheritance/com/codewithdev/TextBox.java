package com.codewithdev;

public class TextBox extends UIControl {
    private String text = ""; // Field

    public TextBox() {
        super(true);
        System.out.println("TextBox");
    }

    public void setText(String text) {
        this.text = text;
    }

    public void clear() {
        this.text = "";
    }
}