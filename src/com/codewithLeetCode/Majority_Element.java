package com.codewithLeetCode;

import java.util.HashMap;

public class Majority_Element {
    public int majorityElement(int[] nums) {
//        Method  - 2

// Moorves Voting Algorithm
        int i = 0;
        int count  = 0;
        int element  = 0;


        while(i<nums.length){

            if(count ==0){
                element  = nums[i];
            }
            if(element ==nums[i]){
                count++;
            }
            else{
                count--;
            }

            i++;
        }
        return element;




//        Method -1
//        int n  = nums.length;
//        HashMap<Integer ,Integer> map = new HashMap<>();
//        for(int i =0; i<nums.length; i++)
//        {
//            if(map.containsKey(nums[i]))
//            {
//                map.put(nums[i], map.get(nums[i])+ 1);
//                if(map.get(nums[i]) > n/2){
//                    return nums[i];
//                }
//            }
//            else{
//                map.put(nums[i], 1);
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {

    }
}
