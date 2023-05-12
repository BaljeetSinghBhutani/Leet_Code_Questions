package com.codewithLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Can_Make_Arithmetic_Progression_from_Sequence {
    public boolean canMakeArithmeticProgression(int[] arr) {

        //Method -1
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashMap<Integer, Integer> map  =  new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        int d = (max - min) / (arr.length - 1);
        int a =  min + d;
        int j  = 0;
while (j<arr.length) {
    a =  min +j*d;

    if (!map.containsKey(a)) {
        return false;
    }
    else{
        map.put(a, map.get(a)-1);
    }
    j++;

}

        for (Integer itr: map.keySet() ){
            if(map.get(itr)>0)
            {
                return false;
            }
        }


        return true;

    }



 //Method -2 - Brute Force
//        Arrays.sort(arr);
//        int i =2;
//        int diff = arr[i] - arr[i-1];
//        for(;i<arr.length;i++)
//        {
//         int diff2 = arr[i] - arr[i-1];
//         if(diff!=diff2)
//         {
//             return false;
//         }
//
//        }
//
//        return true;
//    }
    public static void main(String[] args) {

    }
}
