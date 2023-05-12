package com.codewithLeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Two_Sum {


    public  static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer>  map = new HashMap<>();
        for(int i =0;i<nums.length; i++)
        {
            if(map.containsKey(target- nums[i])){
                int arr[] = new int [2];
                arr[0] =  i;
                arr[1] =  map.get(target-nums[i]);
                return arr;
        }
        else{
            map.put(nums[i], i);
        }
        }
int arr[] = {-1, -1};
        return arr;
    }

    public static void main(String[] args) {
int arr[]  = { 3,2, 4};
int target = 6;
int num[]= twoSum(arr, target);

        System.out.println(Arrays.toString(num));
    }
}
