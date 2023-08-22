package com.bootcoding.java.array;

public class SubstractionOfArray {
    public static void main(String[] args) {
        int a[]={5,55,12,7,89,46,100};
        int sub=a[0];
        for(int i=1;i <a.length;i++){
            sub=sub-a[i];
        }
        System.out.println(sub);
    }
}
