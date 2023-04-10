package com.bootcoding.java.basic;

public class ForLoopEx5 {
    public static void main(String args[]) {
        System.out.println("using For loop");
        //nested for loop
        for (int i = 0; i <= 5; i++) {
            for (int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
    }
}

	  