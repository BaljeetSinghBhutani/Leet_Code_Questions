//package com.codewithLeetCode;
//
//public class Single_Element_in_a_sorted_Array {
//    public int singleNonDuplicate(int[] nums) {
//return singleNonDuplicate(nums, 0, nums.length-1);
//
//    }
//    public int singleNonDuplicate(int[] nums,int start, int end) {
//
//        int mid = (start + end)/2;
//        if(mid +1 <nums.length && mid-1 >=0 || nums[mid]!=nums[mid+1] ||  nums[mid]!= nums[mid-1])
//        {
//            return nums[mid];
//        }
//
//     int left  =  singleNonDuplicate(nums, start, mid);
//
//     int right  = singleNonDuplicate(nums, mid+1, end) ;
//
//    }
//
//
//}
