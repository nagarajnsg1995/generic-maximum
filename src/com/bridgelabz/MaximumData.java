package com.bridgelabz;

public class MaximumData {
    public static Integer maximumInt(Integer a, Integer b, Integer c) {
        Integer max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;

        }

        return max;
    }

    public static Float maximumFloat(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;

        }

        return max;
    }

    public static String maximumString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;

        }

        return max;
    }


    public static void main(String[] args) {
        Integer resultOne = MaximumData.maximumInt(10, 5, 8);
        Float resultTwo = MaximumData.maximumFloat(10.7f, 5.4f, 18.6f);
        String resultThree = MaximumData.maximumString("apple", "peach", "orange");
        System.out.println("maximum integer number is: " + resultOne);
        System.out.println("maximum float number is: " + resultTwo);
        System.out.println("maximum String name is:" + resultThree);
    }

}
