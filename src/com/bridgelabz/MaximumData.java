package com.bridgelabz;

class GenericData<T extends Comparable> {
    T a, b, c;

    public GenericData(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public T maximum() {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
}


public class MaximumData {

    public static void main(String[] args) {
        GenericData<Integer> genericData = new GenericData<>(4, 9, 3);
        GenericData<Float> genericData1 = new GenericData<>(1.7f, 13.1f, 17.2f);
        GenericData<String> genericData2 = new GenericData<>("apple", "banana", "mango");
        System.out.println("maximum integer number is: " + genericData.maximum());
        System.out.println("maximum float number is: " + genericData1.maximum());
        System.out.println("maximum string name is: " + genericData2.maximum());
    }
}