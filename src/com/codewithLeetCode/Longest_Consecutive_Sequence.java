package com.codewithLeetCode;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Longest_Consecutive_Sequence {
    public static int longestConsecutive(int[] nums) {
//        Method -2
        int length = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            map.put(nums[i], true);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - 1)) {
                map.put(nums[i], false);
            } else if(map.get(nums[i])==true) {
                int j = 0;
                int count = 0;
                while (map.containsKey(nums[i] + j)) {
                    count++;
                    j++;
                }
                if (count > length) {
                    length = count;
                }
            }
        }
return length;
    }







//        Method -1
//        int length  = 0;
//        HashMap<Integer, Boolean> map = new HashMap<>();
//
//        for(int i =0; i<nums.length;  i++) {
//            map.put(nums[i], true);
//        }
//
//        for(int i =0; i<nums.length; i++){
//            if(map.containsKey(nums[i]-1))
//            {
//                map.put(nums[i], false);
//            }
//        }
//
//        for(int i =0; i<nums.length; i++)
//        {
//            if(map.get(nums[i])){
//                ArrayList<Integer>  list  = new ArrayList<>();
//                list.add(nums[i]);
//                int i1 = 1;
//                while(map.containsKey(nums[i]+i1)){
//                    list.add(nums[i]+11);
//                    i1++;
//                }
//                if(length<list.size()){
//                    length = list.size();
//                }
//            }
//        }
//
//        return length;



    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        int a = longestConsecutive(nums);
        System.out.println(a);

    }


}
