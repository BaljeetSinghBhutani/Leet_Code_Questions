package com.codewithLeetCode;

import java.util.HashMap;

public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {

//         Method -2


        int k = 0;
        int i =0;
        nums[k] = nums[i];

        for(i = 1; i<nums.length; i++)
        {
            if(nums[i]!=nums[k]){
                k++;
                nums[k] = nums[i];

            }

        }

        return k +1;
//         Method -1

//        int k =0;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i =0; i< nums.length; i++)
//        {
//            if(map.containsKey(nums[i]))
//            {
//                map.put(nums[i], map.get(nums[i])+ 1);
//
//            }
//            else {
//                nums[k]=  nums[i];
//                map.put(nums[i], 1);
//                k++;
//
//            }
//        }
//        nums = new int[map.size()];
//        for(int i =0; i<map.size(); i++){
//
//        }
//return map.size();
    }


    public static void main(String[] args) {
int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 3 , 4};
        System.out.println(removeDuplicates(arr));
    }

}
