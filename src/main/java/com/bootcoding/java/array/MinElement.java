package com.bootcoding.java.array;

public class MinElement {
    public static void main(String[] args) {
       int a[] = {1,2,5,4,7,8,9};
        int min= a[0];
        for (int i = 0; i <a.length ;i++){
            if (min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
