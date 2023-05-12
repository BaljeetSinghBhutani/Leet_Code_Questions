package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Max_Sum_of_a_Pair_with_equal_sum_of_digits {
    public static int maximumSum(int[] nums) {

        HashMap<Integer, ArrayList<Integer>> map  = new HashMap<>();
        Arrays.sort(nums);
        for(int i =0; i<nums.length; i++)
        {
            int sod  =  SumOfDigits(nums[i]);

            if(map.containsKey(sod))
            {
                ArrayList<Integer> set  = map.get(sod);
                set.add(nums[i]);
                map.put(sod, set);
            }
            else{
                ArrayList<Integer> list  = new ArrayList<>();
                list.add(nums[i]);
                map.put(sod, list);
            }
        }
        int max  = -1;

        for (Integer  itr : map.keySet()) {

            if(map.get(itr).size()>=2)
            {
                ArrayList<Integer>  set  = map.get(itr);
               int a  =  set.get(set.size()-1);
               int b  =  set.get(set.size()-2);
               if(a+b>max)
               {
                   max  = a+b;
               }
            }
        }
        return max;


    }

    private static int SumOfDigits(int num) {
        int ans  = 0;

        while (num>0) {
            ans += num % 10;
            num = num / 10;
        }

        return ans;
    }

    public static void main(String[] args) {
int nums [] = {18,43,36,13,7};
int a  = maximumSum(nums);
        System.out.println(a);

    }
}
