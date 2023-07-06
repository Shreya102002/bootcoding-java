package com.bootcoding.java.basic;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        //scanner class in order to read data from th use keywboard we use scanner class
        System.out.println("taking input from th user");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter  marks in subject 1");
        int a =sc.nextInt();
        System.out.println("enter marks in subject 2 ");
        int b =sc.nextInt();
        System.out.println("enter marks in subject 3");
        int c = sc.nextInt();
        System.out.println("enter marks in subject 4");
        int d = sc.nextInt();
        System.out.println("enter marks in subject 5");
        int e =sc.nextInt();
        int sum =a+b+c+d+e;
        double average= sum/5.00;
        double percentage= sum/100.00*100.00;
        System.out.println("average"  + average);
        System.out.println("percentage"  + percentage);


    }
}
