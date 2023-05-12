package com.codewithLeetCode;

import java.util.HashMap;

public class Subarray_sum_divisible_by_k {
    public static int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
int sum = 0;
int count  = 0;
map.put(0, 1);
for(int i = 0; i<nums.length;i++)
        {
            sum+=nums[i];

            int rem  = sum%k;
        if(rem<0)
        {
            rem  = rem + k;
        }
            if(map.containsKey(rem))
            {
                count+=map.get(rem);
                map.put(rem, map.get(rem)+1);
            }
            else{
                map.put(rem, 1);
            }
        }
return count;
    }

    public static void main(String[] args) {
        int nums[] =  {2, -2, 2, -4};
        int  a = subarraysDivByK(nums, 6);
        System.out.println(a);
//        System.out.println(-1%2);

    }
}
