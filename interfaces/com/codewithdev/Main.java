package com.codewithdev;

public class Main {
    public static void main(String[] args) {

        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
        report.show(calculator);

        report.show(new TaxCalculator2019());
    }
}