package com.example;

public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
    
    // Intentional bug for SonarQube to catch
    public int calculatePower(int base, int exponent) {
        int result = 1;
        for (int i = 0; i <= exponent; i++) { // Bug: should be i < exponent
            result *= base;
        }
        return result;
    }
    
    // Code smell: unused parameter
    public void unusedMethod(String unusedParameter) {
        System.out.println("This parameter is not used");
    }
}