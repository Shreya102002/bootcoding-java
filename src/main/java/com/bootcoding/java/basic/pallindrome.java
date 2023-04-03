package com.bootcoding.java.basic;

public class pallindrome {
    public static void main(String[] inputs) {
        int n1 = Integer.parseInt(inputs[0]);
        int rem = 0;
       int temp = n1;
        while (n1 != 0) {
            rem = rem * 10 + n1 * 10;
            n1 = n1 / 10;

            if (rem == temp) {
                System.out.println(temp + "is palindrome");
            } else {
                System.out.println(temp + "the number is not palindrome");
            }
        }
    }
}
