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
    public static Float maximumFloat(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max=c;

        }

        return max;
    }

    public static void main(String[] args) {
        Integer resultOne =  maximumInt(10, 5, 8);
        Float resultTwo = maximumFloat((float) 10.7, (float)5.4, (float)18.6);
        System.out.println("maximum integer number is: " +resultOne);
        System.out.println("maximum float number is: " +resultTwo);
    }

}
