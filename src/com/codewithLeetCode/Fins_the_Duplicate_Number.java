package com.codewithLeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Fins_the_Duplicate_Number {
    public static int findDuplicate(int[] nums) {

//        Method  -3
        int a  = nums[0];
        for(int i=1; i< nums.length; i++)
        {
             a  = nums[i]^a;

        }
        return a;
    }







//        Method - 2
//
//        Arrays.sort(nums);
//        for(int i =0; i<nums.length-1; i++)
//        {
//            if(nums[i]==nums[i+1])
//            {
//                return nums[i];
//            }
//        }
//
//

//        Method  - 1

//        HashMap<Integer, Integer> map =new HashMap<>();
//        for(int i =0; i<nums.length; i++)
//        {
//            if(map.containsKey(nums[i]))
//            {
//                return nums[i];
//            }
//            else{
//                map.put(nums[i], 1);
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {
        int nums [] = {1, 2, 3, 2, 4};
int a = findDuplicate(nums);
        System.out.println(a);
    }
}
