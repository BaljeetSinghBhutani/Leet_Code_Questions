package com.codewithLeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Repeat_and_missing_number{
    public static int[] repeatedNumber(final int[] arr) {

//        Method -2
        int ans[] =  new int[2];
        int xor  = 0;
//        for(int val: arr){
//            xor^=val;
//        }
        for(int i =  1; i<=arr.length; i++)
        {
            xor = xor^i ^arr[i-1];
        }

        int rmsb  =  xor & - xor;

        int x = 0;
        int y = 0;
        for(int val: arr){
            if((rmsb & val) ==0)
            {
                x^=val;
            }
            else{
                y^=val;
            }
        }

        for(int val:  arr){
            if(x ==val){
                ans[0] = x;
                break;
            }
            else{
                ans[0] =  y;
                break;
            }
        }

        if(ans[0]==x){
            ans[1] =y;
        }
        else{
            ans[1] = x;
        }
        return ans;

    }
// Method -1

//        int arr[]  = new int[2];
//        HashMap<Integer, Integer> map  = new HashMap<>();
//        Arrays.sort(A);
//        for(int i =0; i<A.length; i++){
//            if(A[i] != i +1){
//                arr[1] = i+1;
//            }
//            if(map.containsKey(A[i]))
//            {
//                arr[0] =  A[i];
//            }
//            else{
//                map.put(A[i], 1);
//            }
//
//        }
//        return arr;

//    }

    public static void main(String[] args) {
int arr[] =  {3, 1,2, 5, 3};
int ans [] = repeatedNumber(arr);
        System.out.println(ans[0]+ " " +  ans[1]);
    }
}
