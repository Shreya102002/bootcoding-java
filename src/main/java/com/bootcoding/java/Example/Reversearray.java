package com.bootcoding.java.Example;

public class Reversearray {
    public static void main(String[] args) {
        int a[] = {10, 12, 13, 14, 15, 16};
        int n[] = new int[a.length];
        int index = 0;
        for(int i = a.length - 1; i >= 0; i--){
            n[index++] = a[i];
        }

        for(int i = 0; i < n.length; i++){
            System.out.println(n[i]);
        }

    }
}
