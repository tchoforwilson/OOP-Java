package com.codewithdev;

public class TaxReport {
    private TaxCalculator2018 calculator;

    public TaxReport() {
        this.calculator = new TaxCalculator2018(100_000);
    }

    public void show() {
        var tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
