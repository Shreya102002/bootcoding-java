package com.bootcoding.java.array;

public class OddIndex {
    public static void main(String[] args) {
        int a[]={2,4,6,1,7,5,4,8,};
        for(int i=0;i<a.length;i++){
            if(i%2!=0){
                System.out.print(i +" ");
            }
        }
    }
}
