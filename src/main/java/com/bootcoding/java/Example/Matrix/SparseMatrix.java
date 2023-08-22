package com.bootcoding.java.Example.Matrix;

public class SparseMatrix {
    public static void main(String[] args) {
        int zerocount = 0;
        int nonzerocount=0;

        int [][] matrix =new int [3] [3];
        matrix [0][0] =1;
        matrix [0][1] =0;
        matrix [0][2] =0;
        matrix [1][0] =0;
        matrix [1][1] =0;
        matrix [1][2] =1;
        matrix [2][0] =0;
        matrix [2][1] =1;
        matrix [2][2] =0;

        for (int i=0;i< matrix.length;i ++){
            for(int j=0;j<matrix.length;j++){
                 if( matrix [i] [j] ==0){
                  zerocount++;
                 }
                 else{
                     nonzerocount++;
                 }
        }
    }
        if (zerocount > nonzerocount) {
            System.out.println("this is asparse matrix");
        }
        else{
            System.out.println("It is not Sparse Matrix");
        }
    }

    }

