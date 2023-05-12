package com.codewithLeetCode;

import java.util.HashMap;

public class Degree_of_an_Array {
    public static int findShortestSubArray(int[] nums) {

        int ans  =0;
        //Element vs Start Index
        HashMap<Integer, Integer> map1  = new HashMap<>();

        for(int i =0; i<nums.length; i++)
        {
            if(!map1.containsKey(nums[i])){
                map1.put(nums[i], i);
            }
        }


        //Element vs frequency
        HashMap<Integer, Integer> map2  = new HashMap<>();
        int si  =  0;
        int ei = 0;
        int length = Integer.MAX_VALUE;
        int freq = 0;

        for(int i= 0; i<nums.length;i++)
        {
            map2.put(nums[i], map2.getOrDefault(nums[i], 0)+1);

            int prefreq = map2.get(nums[i]);
            if(prefreq>freq)
            {
                si = map1.get(nums[i]);
                ei = i;
                length = ei-  si +1;
                freq = prefreq;

            }

            else if(prefreq==freq)
            {
                int dumsi =  map1.get(nums[i]);
                 int dumlen = i - dumsi +1;
                 if(dumlen<length)
                 {
                     si = dumsi;
                     ei = i;
                     length =dumlen;
                 }
            }

        }
ans  = length;

        return ans;
    }
    public static void main(String[] args) {
int nums [] = {1,2,2,3,1};
int ans  =  findShortestSubArray(nums);
        System.out.println(ans);
    }
}
