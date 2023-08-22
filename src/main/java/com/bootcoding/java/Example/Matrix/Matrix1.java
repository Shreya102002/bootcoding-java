package com.bootcoding.java.Example.Matrix;

public class Matrix1 {
    public static void main(String[] args) {
   int [][] matrix =new int [3] [3];
        matrix [0][0] =1;
        matrix [0][1] =0;
        matrix [0][2] =1;
        matrix [1][0] =0;
        matrix [1][1] =0;
        matrix [1][2] =1;
        matrix [2][0] =1;
        matrix [2][1] =1;
        matrix [2][2] =0;

        for (int i=0;i< matrix.length;i ++){
            for(int j=0;j<matrix.length;j++){
               // if( matrix [i] [j] ==0){
                //  matrix [i] [j]= 1;
                    matrix [i][j]= matrix [j][i];
               // }
                System.out.print( matrix [j] [i] +" ");

            }
            System.out.println();
        }
    }


}
