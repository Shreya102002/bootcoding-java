package com.bootcoding.java.Example;

public class ArrayCopy {
        public static void main (String []args){
    int a[]={10,20,30,40,50};
    int[] NewArray= new int[5];
    for (int j=0;j<a.length;j++){
        NewArray[j] = a[j];
        System.out.println(NewArray[j]);
    }
}
}

