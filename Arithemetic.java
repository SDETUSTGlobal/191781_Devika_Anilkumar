package com.JUnitTest;

public class Arithemetic {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double max(double a, double b) {
        return Math.max(a,b);
    }
    
    public int [] reverse(int [] arr) {
    	int temp=0, n = arr.length;
    	for (int i= 0; i < n/2; i++) {
        temp = arr[i];
    	arr[i] = arr[n - i - 1];
    	arr[n - i - 1] = temp; 	
    }
    System.out.println("reverse.......");
    return arr;
    }   
    
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a/b; 
}
}