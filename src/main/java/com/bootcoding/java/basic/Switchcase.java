package com.bootcoding.java.basic;
import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        System.out.println("taking input from user");

        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("you are an adult");
                break;

        }
        switch (age) {
            case 23:
                System.out.println("you are going to get an job");
                break;
        }
        switch (age) {
            case 60:
                System.out.println("you are going to get retired");
                break;
        }
    }
}