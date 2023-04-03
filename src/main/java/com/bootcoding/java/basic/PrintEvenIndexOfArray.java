package com.bootcoding.java.basic;

public class PrintEvenIndexOfArray {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 33, 43, 50};
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
