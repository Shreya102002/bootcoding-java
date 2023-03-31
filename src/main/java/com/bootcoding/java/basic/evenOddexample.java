package com.bootcoding.java.basic;

public class evenOddexample {
    public static void main(String data[]) {
        String value = data[20];
        int n = Integer.parseInt(value);
        System.out.println("String value" + data[20]);

        System.out.println("list of even numbers from 1 to" + n + ":");
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "");
            }
        }
    }
}
 
 
