package com.codewithdev;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox();
        var textBox2 = textBox1;
        textBox2.setText("Hello, world");
        System.out.println(textBox1.text);
    }
}