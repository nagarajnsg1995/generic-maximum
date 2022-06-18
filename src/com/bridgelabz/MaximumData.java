package com.bridgelabz;

import java.util.Arrays;

public class MaximumData<T> {
    public T maximum(T... a) {
        Arrays.sort(a);
        T max = a[a.length - 1];
        printMax(max);
        return max;
    }
    private void printMax(T max){
        System.out.println(max);
    }

    public static void main(String[] args) {
      MaximumData<Integer> integermaximumData = new MaximumData<>();
      MaximumData<Float>floatMaximumData = new MaximumData<>();
      MaximumData<String>stringMaximumData = new MaximumData<>();
      integermaximumData.maximum(2,5,7,3,1);
      floatMaximumData.maximum(1.4f,2.5f,3.5f,1.2f);
      stringMaximumData.maximum("apple","banana","coconut","dates","grape","orange");
    }
}