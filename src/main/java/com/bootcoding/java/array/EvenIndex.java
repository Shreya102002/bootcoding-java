package com.bootcoding.java.array;

public class EvenIndex {
    public static void main(String[] args) {
        int a[]= {2,5,8,9,6,3};
        for (int i=0;i< a.length;i++){
            if ( i%2==0){
                System.out.println(i +" ") ;
            }
        }
    }
}
