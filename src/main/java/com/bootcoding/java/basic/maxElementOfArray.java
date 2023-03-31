package com.bootcoding.java.basic;

class maxElementOfArray {
    public static void main(String args[]) {
        int a[] = {20, 24, 40, 50, 70, 60};
        int max = a[0];
        for (int k = 0; k < a.length; k++) {
            if (max < a[k]) {
                max = a[k];
            }
        }
        System.out.println(max);
    }
}
