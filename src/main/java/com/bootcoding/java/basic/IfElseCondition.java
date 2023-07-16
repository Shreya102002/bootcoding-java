package com.bootcoding.java.basic;
import java.util.Scanner;
public class IfElseCondition {
    public static void main(String[] args) {
        System.out.println("taking input from user");

        int age ;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age");
        age= sc.nextInt();


       if(age >56) {
            System.out.println("you are experienced");
        }
        else if(age>46) {
            System.out.println("you are semi experienced");
        }
        else if(age>36){
            System.out.println("you are littl bit experienced");
        }
        else
            System.out.println("you are not experienced");
    }
}
