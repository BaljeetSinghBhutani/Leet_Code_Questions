package com.codewithLeetCode;

import java.util.Arrays;

public class Plus_One {
    public static int[] plusOne(int[] digits) {

        //        Method -2


        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int arr[] = new int[digits.length + 1];
        arr[0] = 1;

        return arr;
    }
//        Method -1
//long sum =0;
//for(int i =0; i<digits.length; i++)
//{
//    sum = sum*10 + digits[i];
//}
//
//sum = sum+1;
//long result = sum;
//int k =0;
////int l =0;
//
//while(sum!=0)
//{
// sum = sum/10;
// k++;
//}
//int arr[] = new int[k];
//sum = result;
//
//while (sum!=0){
////    int j = sum;
//    long m = sum%10;
//
//    arr[k-1] =(int ) m;
//    k--;
//    sum = sum/10;
//
//
//}
//return arr;


//
//    }
    public static void main(String[] args) {



    }
}
