package com.bootcoding.java.Example;

public class EvenElementsArray {
    public static void main(String[] args) {
        int a[] = {11, 23, 25, 26, 28, 29, 30, 40};
        int[] Newarray = new int[a.length];
        for (int k = 0; k < a.length; k++) {
            if (a[k] % 2==0){
                Newarray[k] = a[k];
                System.out.println(Newarray[k]);

            }
        }
    }
}
