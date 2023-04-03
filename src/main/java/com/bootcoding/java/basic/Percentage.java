package com.bootcoding.java.basic;

public class Percentage {
    public static void main(String[] args) {
        int n1 = 75;
        int n2 = 62;
        int n3 = 37;
        double avg = 0.0;
        double per = 0.0;
        int sum = n1 + n2 + n3;
        //calculateAverageandPercentage();
        avg = n1 + n2 + n3 / 3;

        //  CalculateAverageandPercentage();

        avg = sum / 3.0;
        per = sum / 300.00 + 100.00;
        System.out.println("Print avg" + avg);
        System.out.println("Print per" + per);
    }
}


