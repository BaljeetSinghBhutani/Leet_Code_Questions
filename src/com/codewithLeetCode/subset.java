package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class subset {

    public static List<List<Integer>> subsets1(int[] nums) {

        //Method -2

        List<List<Integer>> list = new ArrayList();
        generateSubsets(0, nums, new ArrayList<>(), list);


        return list;

    }

    private static void generateSubsets(int index, int[] nums, List<Integer> curr, List<List<Integer>> list) {
        list.add(new ArrayList<>(curr));
        for (int i = index; i < nums.length; i++) {
            curr.add(nums[i]);
            generateSubsets(i + 1, nums, curr, list);
            curr.add(curr.size() - 1);

        }


    }



//Method -1 Iterative Approach
//        List<List<Integer>> list  = new ArrayList<>();
//     list.add(new ArrayList<>());
//        for (Integer num: nums) {
//            int n = list.size();
//
//            for(int i =0; i<n; i++)
//            {
//                List<Integer> res =  list.get(i);
//                res.add(num);
//                list.add(res);
//
//            }
//
//        }
//        return list;

//    }

 

    public static void main(String[] args) {
int nums[] = {0};
List<List<Integer>> list  = subsets1(nums);
        System.out.println(list);
    }
}
