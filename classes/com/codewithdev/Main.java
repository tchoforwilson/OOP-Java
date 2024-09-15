package com.codewithdev;

public class Main {
    public static void main(String[] args) {
        var emp = new Employee(10_000);
        var employee = new Employee(50_000, 20);

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }

}