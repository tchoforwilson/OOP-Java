package com.codewithdev;

public class TaxCalculator {
    private double taxableIncome;

    public TaxCalculator(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public double calculateTax() {
        double taxRate = 0.3;
        return taxableIncome * taxRate;
    }

}
