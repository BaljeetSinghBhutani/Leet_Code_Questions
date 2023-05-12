package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
int target = 0;
        List<List<Integer>> list = new ArrayList<>();

        for(int i =0; i<nums.length; i++){
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int si  =  i+1;
            int ei  = nums.length-1;

            while(si<ei)
            {
                if(nums[i] + nums[si] + nums[ei]== 0){

                    list.add(new ArrayList(Arrays.asList(nums[i], nums[si], nums[ei])));
                    si++;
                    ei--;

                    while(si<ei &&  nums[si]==nums[si-1])
                    {
                        si++;
                    }while(si<ei &&  nums[ei]==nums[ei+1])
                    {
                        ei--;
                    }

                }

                else if (nums[i] + nums[si] + nums[ei]>0)
                {
                    ei--;
                }

                else{
                    si++;
                }
            }
        }

return list;
    }
}
