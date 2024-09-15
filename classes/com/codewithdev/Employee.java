package com.codewithdev;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return this.baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlRate() {
        return this.hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

}