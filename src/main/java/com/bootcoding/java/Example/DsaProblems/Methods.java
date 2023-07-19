package com.bootcoding.java.Example.DsaProblems;

public class Methods {
    static int logic(int x,int y) {
         x = 9;
        y = 8;
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x - y) * 5;
        }
        return z;
    }
    public static void main(String[] args) {

        int a1 = 4;
        int b1 = 5;
        int c1;
        Methods obj=new Methods();


        c1= logic(a1,b1);
        if (a1 < b1) {
            c1 = a1 + b1;
        } else {
            c1 = (a1 - b1);
        }

        System.out.println(c1);
    }
}




