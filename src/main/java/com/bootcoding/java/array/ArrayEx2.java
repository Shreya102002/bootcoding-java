package com.bootcoding.java.array;

public class ArrayEx2 {
    public static void main(String[] args) {
        int a[] ={1,2,4,7,8,9};
        int b[]=new int[7];
        int i=0;
        for ( i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println(a[i] + " ");
            }
        }
    }
}
