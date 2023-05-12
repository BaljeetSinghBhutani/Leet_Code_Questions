package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;








public class Four_Sum_LeetCode {
//    Create Function


    public static void createRes(List<List<Integer>> ans, List<List<Integer>> smallans, int val)
    {
        for (List<Integer> sa: smallans) {
            sa.add(0, val);
            ans.add(sa);
        }
    }


//    Two Sum
    public  static List<List<Integer>> twoSum(int nums[], int target, int Si, int Ei)
    {
        List<List<Integer>> list = new ArrayList<>();
        while(Si<Ei)
        {
            int sum  = nums[Si]+ nums[Ei];
            if(sum>target){
                Ei--;
            }
            else if(sum<target)
            {
                Si++;
            }
            else {
                list.add(new ArrayList(Arrays.asList(nums[Si], nums[Ei])));
                Si++;
                Ei--;

                while(Si < Ei && nums[Si]==nums[Si-1]) Si++;
                while(Si < Ei && nums[Ei]==nums[Ei+1]) Ei--;
            }
        }
        return list;
    }



// Three Sum
    public  static List<List<Integer>> ThreeSum(int nums[],int target, int si, int ei){

        List<List<Integer>> list  = new ArrayList<>();
        for(int i =  si; i<=ei; i++)
        {
            if(i!=si && nums[i]==nums[i-1])
                continue;

            List<List<Integer>> smalllist = twoSum(nums , target-nums[i],i+1, ei);


                createRes(list, smalllist, nums[i]);



        }

        return list;

    }

//    Four Sum
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);


        int si  = 0;
        int ei =  nums.length-1;
        List<List<Integer>> list  = new ArrayList<>();
        for(int i =  si; i<=ei; i++)
        {
            if(i!=si && nums[i]==nums[i-1])
                continue;

            List<List<Integer>> smalllist = ThreeSum(nums , target-nums[i],i+1, ei);
            createRes(list, smalllist, nums[i]);


        }

        return list;

    }
}
