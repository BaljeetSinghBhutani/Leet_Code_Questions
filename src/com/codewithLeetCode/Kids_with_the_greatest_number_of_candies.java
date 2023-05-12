package com.codewithLeetCode;

import java.util.Arrays;

public class Kids_with_the_greatest_number_of_candies {
    public static void main(String[] args) {
        int arr [] = { 12, 1, 12};
        int extra_candies = 10;
        boolean arr1[] =  new boolean[arr.length];
        int max = -1000;

        for(int i =0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i =0; i<arr.length; i++)
            if( arr[i]+ extra_candies>=max){
                arr1[i] = true;
            }
        else{
            arr1[i] = false;


            }
        System.out.println(Arrays.toString(arr1));
     }
}
