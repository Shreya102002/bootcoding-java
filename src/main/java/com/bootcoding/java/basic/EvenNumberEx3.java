package com.bootcoding.java.basic;

public class EvenNumberEx3 {
    public static void main(String args[]) {
        int number = 100;


        System.out.println("list of even numbers from 1 to" + number + ":");
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }
    }
}