package com.codewithLeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Median_of_two_sorted_arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//Method -2

        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0;
        int high = n1;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = (n1 + n2 + 1) / 2;

            int left1 = cut1 == 0 ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int left2 = cut2 == 0 ? Integer.MIN_VALUE : nums2[cut2 - 1];

            int right1 = cut1 == 0 ? Integer.MAX_VALUE : nums1[cut1];
            int right2 = cut2 == 0 ? Integer.MAX_VALUE : nums2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(left2, left1) + Math.min(right1, right2)) / 2d;

                } else {
                    return Math.max(left2, left1);
                }
            } else if (left1 > right2) {

                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }
return 0.0;
    }















// Method -1
//        int arr[] = new int[nums1.length + nums2.length];
//
//        int i = 0;
//        for(;i<nums1.length;i++){
//            arr[i] = nums1[i];
//        }
//
//        for(int k = 0; k<nums2.length; k++){
//
//            arr[i] = nums2[k];
//            i++;
//        }
//        Arrays.sort(arr);
//        if(arr.length%2!=0)
//        {
//            int si = 0;
//            int ei = arr.length-1;
//            int mid = (si + ei)/2;
//            double d = arr[mid];
//            return d;
//        }
//        int si = 0;
//        int ei = arr.length-1;
//        int mid = (si + ei)/2;
//        double  d =  (arr[mid] + arr[mid+1])/2d;
//        return d;

//    }

    public static void main(String[] args) {

    }
}
