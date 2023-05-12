package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
//         Method -2
        List<Integer> list  = new ArrayList<>();

//         Using Boyer's Moorve Voting Algorithm
        int count1  = 0;
        int count2  =  0;
        int num1  = Integer.MIN_VALUE;
        int num2 = Integer.MIN_VALUE;

        for(int i =0; i<nums.length; i++){

            if(nums[i]==num1){
                count1++;
            }

            else if(nums[i]==num2){
                count2++;
            }
            else if(count1==0){
                num1 = nums[i];
                count1 = 1;
            }
            else if(count2 ==0){
                num2  = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }

        }


//         Frequency calculate of both num1 and num2

        int num1count = 0;
        int num2count  =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]==num1){
                num1count++;
            }

            if(nums[i]==num2){
                num2count++;
            }
        }

        if(num1count>nums.length/3){
            list.add(num1);
        }
        if(num2count>nums.length/3){
            list.add(num2);
        }

        return list;


//         Method -1
//         List<Integer>  list = new ArrayList<>();
// int n =  nums.length;
//         HashMap<Integer, Integer>  map = new HashMap<>();
//         for(int i =0; i<nums.length; i++)
//         {
//             if(map.containsKey(nums[i]))
//             {
//                 map.put(nums[i], map.get(nums[i]) +1);
//             }
//             else{
//                 map.put(nums[i], 1);
//             }
//         }


//         for (Integer itr: map.keySet()) {
//          int a  =  map.get(itr);
//          if(a>n/3){
//              list.add(itr);
//          }
//         }
//         return list;

    }

    public static void main(String[] args) {


    }

}
