package com.bridgelabz;

public class MaximumData {
    public static Integer maximumInt(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max=c;

        }

        return max;
    }

    public static void main(String[] args) {
        Integer result =  maximumInt(10, 5, 8);
        System.out.println("maximum integer is:" +result);
    }

}
