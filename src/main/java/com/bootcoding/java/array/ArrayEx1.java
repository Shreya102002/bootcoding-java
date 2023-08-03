package com.bootcoding.java.array;

public class ArrayEx1 {
    public static void main(String[] args) {


        int a[] = {2, 3, 4, 6, 7};
        int[] b = new int[5];
        int i;
        // Even number in array
        for (i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                //  if(a[i]%2 != 0){
                //      System.out.print(a[i] + " ");
                // }
            }
        }

            System.out.println();

            for (int j = a.length - 1; j >= 0; j--) {
                System.out.print(a[j] + " ");
            }

        }
    }

