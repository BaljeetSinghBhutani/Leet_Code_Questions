package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class four_Sum {

    public static void createRes(  List<List<Integer>> res ,   List<List<Integer>> smallans, int val){
for(List<Integer> sa: smallans)
{
    sa.add(0, val);
    res.add(sa);
}
    }

    //    Two sum time Complexity is o(n)
    public static List<List<Integer>> TwoSum(int[] nums, int target, int si, int ei) {
      List<List<Integer>> res = new ArrayList<>();
while (si<ei)
{
    int sum = nums[si] + nums[ei];
    if(sum>target)ei--;
    else if (sum<target)si++;
    else{
        res.add(new ArrayList(Arrays.asList(nums[si], nums[ei])));
        si++;
        ei--;

        while(si<ei && nums[si]==nums[si-1])
        {
            si++;

        }
        while(si<ei && nums[ei]==nums[ei+1])
        {
            ei--;

        }
    }

}
return res;
    }

//    Three sum time Complexity is o(n^2)
    public static  List<List<Integer>> ThreeSum(int[] nums, int target, int si, int ei) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i = si; i<=ei; i++)
        {
            if(i!=si && nums[i]==nums[i-1])
             continue;
            List<List<Integer>> smallans = TwoSum(nums, target - nums[i], i + 1, ei);
            createRes(res, smallans, nums[i]);

        }
return res;

    }

//    Four sum Time Complexity o(n^3)
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
//        HashMap<Integer, Integer> map  = new HashMap<>(5);
//        for(int i =0; i<nums.length; i++)
//        {
//            if(map.containsKey(nums[i]))
//            {
//                map.put(nums[i], map.get(nums[i]+1));
//            }
//            else {
//                map.put(nums[i], 1);
//            }
//        }
//        if(map.containsKey(nums[0]) && map.get(nums[0])== nums.length){
//            return res;
//        }


        int si = 0;
        int ei  = nums.length-1;
        for(int i = si; i<=ei; i++)
        {
            if(i!=si && nums[i]==nums[i-1])
                continue;
            List<List<Integer>> smallans = ThreeSum(nums, target - nums[i], i + 1, ei);
            createRes(res, smallans, nums[i]);

        }
        return res;

    }
    public static void main(String[] args) {
        int nums [] =  {2, 2, 2, 2};


List<List<Integer>> list  = fourSum(nums, 8);
for(int i =0; i< list.size(); i++)
{
   for(int j =0;j<list.get(i).size(); j++)
   {
       System.out.print(list.get(i).get(j));
   }
    System.out.println(" ");
}
    }
}
