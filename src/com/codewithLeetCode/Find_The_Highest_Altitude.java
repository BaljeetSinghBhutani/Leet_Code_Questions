package com.codewithLeetCode;

import java.util.Arrays;

public class Find_The_Highest_Altitude {
    public  static int largestAltitude(int[] gain) {
int max  = Integer.MIN_VALUE;
    int arr[]  = new int[gain.length+1];
    arr[0] =  0;
    arr[1]  = gain[0];

    for(int i =2; i<arr.length; i++)
    {
     arr[i] =  gain[i-1] + arr[i-1];
     if(arr[i]>max){
         max = arr[i];
     }
    }

    if(arr[0]>max){
        max = arr[0];
    }
    if(arr[1]>max){
        max = arr[1];
    }
//        System.out.println(Arrays.toString(arr));
    return max;
}
    public static void main(String[] args) {
int arr[] = {-4, -3, -2, -1, 4, 3, 2};
int a  =largestAltitude(arr);
        System.out.println(a);
    }
}

