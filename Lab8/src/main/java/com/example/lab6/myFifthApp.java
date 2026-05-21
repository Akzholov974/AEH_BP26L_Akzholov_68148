package com.example.lab6;

public class myFifthApp {

    public static long calculateFactorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long calculateFactorialRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 20;

        System.out.println("Calculating factorial for N = " + number + "\n");

        long startIterative = System.nanoTime();
        long resultIterative = calculateFactorialIterative(number);
        long endIterative = System.nanoTime();
        long durationIterative = endIterative - startIterative;

        System.out.println("Iterative Result: " + resultIterative);
        System.out.println("Iterative Execution Time: " + durationIterative + " ns\n");

        long startRecursive = System.nanoTime();
        long resultRecursive = calculateFactorialRecursive(number);
        long endRecursive = System.nanoTime();
        long durationRecursive = endRecursive - startRecursive;

        System.out.println("Recursive Result: " + resultRecursive);
        System.out.println("Recursive Execution Time: " + durationRecursive + " ns\n");
    }
}
