package com.bootcoding.java.Example;

public class Evennumberscount {
    public int findnumbers(int[]nums){
        int count =0;
        for (int i=0;i<nums.length;i++){
            while(nums[i]>=0){
                nums[i]=nums[i]/10;
                count++;
            }
        }
        return count++;
    }
}
