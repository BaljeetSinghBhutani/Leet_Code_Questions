package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum_LeetCode_Second_Method {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
           if(i!=0 && nums[i]==nums[i-1]) {
               continue;
           }
            for (int j = i + 1; j < nums.length-2; j++) {
                if(j!=i+1 && nums[j]==nums[j-1]) {
                    continue;
                }
                int si = j + 1;
                int ei = nums.length - 1;
                while (si < ei) {
                    long  sum = (long)nums[i] + nums[j] + nums[si] + nums[ei];
                    if (sum > target) {
                        ei--;
                    } else if (sum < target) {
                        si++;
                    } else {
                        res.add(new ArrayList(Arrays.asList(nums[i], nums[j], nums[si], nums[ei])));
                        si++;
                        ei--;

                        while(si<ei && nums[si] ==nums[si-1])
                        {
                            si++;
                        }
                        while(si<ei && nums[ei] ==nums[ei + 1])
                        {
                            ei--;
                        }
                    }
                }
            }


        }
        return res;
    }
    public static void main(String[] args) {

    }
}
