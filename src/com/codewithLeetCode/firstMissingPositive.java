package com.codewithLeetCode;

class firstMissingPositive{
    public int firstMissingPositive(int[] nums) {
        int i  =0;
        while(i<nums.length)
        {
            int value  =  nums[i]-1;
            if(value<nums.length && nums[i]>0 &&nums[i]!=nums[value])
            {
//                swap
                int temp = nums[i];
                nums[i]= nums[value];
                nums[value]= temp;
            }
            else{
                i++;
            }
        }
        for(int i1= 0; i1< nums.length; i1++)
        {
            if(nums[i1]!=i1+1)
            {
                return i1+1;
            }
        }
        return -1;
    }
}