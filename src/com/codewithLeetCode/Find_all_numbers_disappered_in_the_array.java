package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Find_all_numbers_disappered_in_the_array {
    public  static List<Integer> findDisappearedNumbers(int[] nums) {
   List<Integer> list= new ArrayList<>();
        int i  =0;
        while(i<nums.length)
        {
            int value = nums[i]-1;
            if(nums[value]!=nums[i])
            {
//                swap
                int temp = nums[i];
                nums[i]= nums[value];
                nums[value] = temp;
            }else{
                i++;
            }
        }
        for(int i1=0; i1< nums.length; i1++)
        {
            if(nums[i1]!=i1+1)
            {
                list.add(i1 +1);
            }
        }
        return list;

    }
    public static void main(String[] args) {
int arr[] = {4 ,3, 2, 7, 8, 2, 3, 1};
List<Integer> list = findDisappearedNumbers(arr);
        System.out.println(list);

    }
}
