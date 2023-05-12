package com.codewithLeetCode;

import java.util.Arrays;

public class Missing_Number {
    public int missingNumber(int[] nums) {

//        Method -2

        int i = 0;
        int dummy = Integer.MAX_VALUE;

        while(i<nums.length)
        {
            int value =  nums[i];
            if(value==nums.length)
            {
                i++;
            }
            else if (nums[value]!=nums[i])
            {
//                swap

                int temp = nums[i];
                nums[i] = nums[value];
                nums[value]=  temp;

            }
            else{
                i++;
            }
        }



        for(int i1  =0; i1<nums.length; i1++)
        {
            if(nums[i1]!=i1)
            {
                return i1;
            }
        }


return nums.length;


    }










//        Method -1

//        Arrays.sort(nums);
//        for(int i=0; i<nums.length; i++)
//        {
//            if(nums[i]!=i){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static void main(String[] args) {



    }
}
