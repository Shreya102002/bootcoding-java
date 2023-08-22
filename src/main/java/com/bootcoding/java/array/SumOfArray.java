package com.bootcoding.java.array;

public class SumOfArray {
    public static void main(String[] args) {
        int a[]={1,45,7,8,56,49};
        int sum=0;
        for(int i=0;i<a.length;i++){
             sum=sum+a[i];
        }
        System.out.println(sum);
    }
}
