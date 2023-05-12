package com.codewithLeetCode;

public class Single_Number_III {
    public int[] singleNumber(int[] nums) {
        int xxory  = 0;
        for(int val:nums){
            xxory^=val;

        }

        int rmsb  = xxory & -xxory;

        int x  =0;
        int y  =0;
        for(int val: nums){
   if((val & rmsb) ==0 ){
                x^=val;
            }
            else{
                y^= val;
            }
        }

        int arr[] = new int[2];
        if(x>=y){
            arr[0]  = y;
            arr[1]  = x;
        }
        else{
            arr[0] = x;
            arr[1] = y;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
