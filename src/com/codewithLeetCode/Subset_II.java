package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_II {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> list  = new ArrayList<>();

        subsetDup(0, nums, new ArrayList<>(), list );
        return list;

    }

    private void subsetDup(int index, int[] nums, ArrayList<Integer> res, List<List<Integer>> list) {
        list.add(new ArrayList<>(res));

        for(int i =index; i<nums.length; i++)
        {
            if(i<index && nums[i]==nums[i-1])
               continue;

                res.add(nums[i]);
                subsetDup(i + 1, nums, res, list);
                res.remove(res.size() - 1);

        }

    }

    public static void main(String[] args) {

    }
}
