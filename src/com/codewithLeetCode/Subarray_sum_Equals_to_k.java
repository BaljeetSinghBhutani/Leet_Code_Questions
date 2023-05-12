package com.codewithLeetCode;

import java.util.HashMap;

public class Subarray_sum_Equals_to_k {
    public static  int subarraySum(int[] nums, int k) {

        int sum  = 0;
        int frequency  = 1;
        HashMap<Integer, Integer>  map = new HashMap<>();
        map.put(sum, frequency);
        int count = 0;


        for(int i =0; i<nums.length; i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
//                map.put(sum, map.get(sum)+1);
            }
           if(map.containsKey(sum))
           {
               map.put(sum, map.get(sum)+1);
           }
           else{
               map.put(sum, 1);
           }
        }
        return count;
    }
    public static void main(String[] args) {
//int nums [] ={1, 2,  3};
//int a  =subarraySum(nums, 3);
//        System.out.println(a);
        System.out.println(4 ^ 6);
    }
}
