package com.bootcoding.java.basic;

public class MethodEx1 {
    public static void main(String[] args) {

        add(10, 20);
        add(100, -20);
        add(17, 23);
        add(-10, -200);
        add(12, -13);
    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }
}
