package com.bridgelabz;

public class MaximumData {
   public static <T extends Comparable>T maximum(T a, T b, T c) {
      T max = a;
      if(b.compareTo(max)>0){
         max = b;
      }
      if(c.compareTo(max)>0){
         max = c;
      }
      return max;
   }

   public static void main(String[] args) {
      Integer resultOne = MaximumData.maximum(10, 5, 8);
      Float resultTwo = MaximumData.maximum(10.7f, 5.4f, 18.6f);
      String resultThree = MaximumData.maximum("apple", "peach", "orange");
      System.out.println("maximum integer number is:" +resultOne);
      System.out.println("maximum float number is:" +resultTwo);
      System.out.println("maximum string name is:" +resultThree);
   }
}