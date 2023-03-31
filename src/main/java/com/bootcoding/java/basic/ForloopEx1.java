package com.bootcoding.java.basic;

public class ForloopEx1 {
    public static void main(String args[]) {
        System.out.println("using for loop");
//nested for loops
        for (int i = 0; i <= 10; i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("  ");
        }
    }
}
 
 
