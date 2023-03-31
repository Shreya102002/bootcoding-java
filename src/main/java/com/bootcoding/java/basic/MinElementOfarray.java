package com.bootcoding.java.basic;

class MinElementOfarray {
    public static void main(String args[]) {
        int a[] = {23, 33, 45, 51, 66, 78};
        int min = a[0];
        for (int k = 0; k < a.length; k++) {
            if (a[k] < min) {
                min = a[k];
            }
        }
        System.out.println(min);
    }
}