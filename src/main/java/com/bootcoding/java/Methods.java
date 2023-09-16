package com.bootcoding.java;

public class Methods {
    static int logic(int x,int y){
        int z;
        if (x>y) {
            z =(x+y);
        }
        else{
             z= (x+y)*5;
        }
        return z;
    }


    public static void main(String[] args) {
        logic(5,6);
        int a=8;
        int b=7;
        int c;
        if(a>b){
            c=(a+b);
        }
        else{
           c = (a+b)*5;
        }
        int a1=5;
        int b1=7;
        int c1;
        if (a1 > b1){
            c1=a1+b1;
        }
        else{
           c1= (a1+b1)*5;
        }
        System.out.println(c);
        System.out.println(c1);
        System.out.println( logic(5,6));
        }

    }