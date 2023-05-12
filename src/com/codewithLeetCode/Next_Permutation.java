package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Next_Permutation {
    public static void nextPermutation(int[] nums) {
//step -1
//        a[i]<a[i+1](Traverse from the back)
        int index1 = -1;
        for(int i = nums.length-1; i>=0; i--)
        {
            if(i>=0 && i+1 < nums.length &&  nums[i]<nums[i+1] )
            {
                index1 = i;
                break;
            }
        }


//step-2
//     a[index]>a[index1]   (again traverse from the back)
        if(index1>=0){
        int index  =0 ;
        for(int i  = nums.length-1; i>=0; i--)
        {
            if(i>=0 && nums[i]>nums[index1])
            {
                index =  i;
                break;
            }
        }




//        step -3  swap

            int temp  = nums[index];
           nums[index] = nums[index1];
           nums[index1] = temp;



    }
//        step - 4 reverse from index1 + 1 index

        if(index1+1 < nums.length)
        {
       int i  =  nums.length-1;
       int j  = index1+1;

       while(i>=j){
//           swap
           int temp  =  nums[i];
           nums[i]  = nums[j];
           nums[j] =  temp;
           i--;
           j++;

       }

       }

    }

    public static void main(String[] args) {
int nums[] =  {1, 3, 2};
nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
