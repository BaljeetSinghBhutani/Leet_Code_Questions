package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Duplicates_in_an_Array {
    public List<Integer> findDuplicates(int[] nums) {

        ArrayList<Integer> list= new ArrayList<>();

        int i =0;
        while(i<nums.length)
        {

            int value = nums[i]-1;
            if(nums[value]!=nums[i])
            {
                int temp =  nums[i];
                nums[i] = nums[value];
                nums[value]= temp;
            }
            else{
                i++;
            }

        }
        for(int i1 =0; i1<nums.length; i1++)
        {
            if(nums[i1]!=i1+1)
            {
                list.add(nums[i1]);
            }
        }


return list;
    }



    public static void main(String[] args) {

    }
}
