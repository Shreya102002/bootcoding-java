package com.bootcoding.java.basic;

public class WhileEx1 {
    public static void main(String args[]) {
        int n = 1234;
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10;
            n = n / 10;
        }
        System.out.println("r");
    }
}