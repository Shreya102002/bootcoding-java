package com.bootcoding.java.basic;

class SumOfArray {
    public static void main(String args[]) {
        int i[] = {10, 23, 25, 45, 78};
        int sum = 0;
        for (int k = 0; k < i.length; k++) {
            sum = sum + i[k];
        }
        System.out.println(sum);
    }
}