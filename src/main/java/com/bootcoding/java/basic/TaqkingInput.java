package com.bootcoding.java.basic;

import java.util.Scanner;

public class TaqkingInput {
    public static void main(String[] args) {
        System.out.println("taking input from thr user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int a= sc.nextInt();
        System.out.println("enter num 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of these numbers is");
        System.out.println(sum);

    }
}
