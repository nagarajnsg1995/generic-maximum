package com.bridgelabz;


import java.util.Arrays;

public class MaximumData {
    public static <T> T maximum(T... a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        System.out.println("maximum integer number is: " + maximum(3, 4, 8, 13, 56, 28, 22));
        System.out.println("maximum flot number is: " + maximum(1.2f, 2.6f, 8.6f, 4.2f, 4.1f));
        System.out.println("maximum string name is: " + maximum("apple", "banana", "coconut", "dates", "grape", "guava"));
    }
}