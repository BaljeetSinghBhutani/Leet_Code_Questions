package com.codewithLeetCode;

import java.util.Arrays;

public class Merge_sorted_array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {

        } else {
            int i = 0;
            int j = 0;

            while (i < m && j < n) {
                if (nums1[i] <= nums2[j]) {
                    i++;

                } else {
//swap
                    int temp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = temp;
//                    Arrays.sort(nums1);
                    Arrays.sort(nums2);
                    i++;
                }

            }
            j = 0;
            while (i < nums1.length) {
                nums1[i] = nums2[j];
                j++;
                i++;
            }

        }
    }

    public static void main(String[] args) {
        int num1 [] = {4, 5, 6, 0,0, 0};
        int num2[] = {1, 2, 3};

        merge(num1, 3, num2, 3);
        System.out.println(Arrays.toString(num1));
    }
}
