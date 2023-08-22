package com.bootcoding.java.array;

public class MaxNum {
    public static void main(String[] args) {
     int a[]={2,5,4,6,9,7,8,};
     int max=a[0];
     for(int i = 0; i <a.length; i++){
         if (max < a[i]){
             max = a[i];
         }
     }
        System.out.println(max);
    }
}
