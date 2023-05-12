package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    //Method -2
    public List<List<Integer>> permute(int[] nums) {


       List<List<Integer>> ans  =  new ArrayList<>();
       List<Integer>  ls = new ArrayList<>();
       permutation(ans, ls, nums, 0);



return ans;
    }

    private void permutation(List<List<Integer>> ans, List<Integer> ls, int[] nums, int index) {
        if(index==nums.length)
        {
            for(int i =0; i<nums.length; i++){
                ls.add(nums[i]);
            }

            ans.add(new ArrayList<>(ls));
            return;
        }


        for(int i = index; i<nums.length; i++)
        {
            swap(i, index, nums);
            permutation(ans,ls, nums, index+1);
            swap(i, index, nums);
        }
    }

private void swap(int i, int index, int arr[]){
        int temp =  arr[i];
        arr[i] =  arr[index];
        arr[index] = temp;
}
}










    // Method -1
//    public List<List<Integer>> permute(int[] nums) {
//
//        List<List<Integer>>  ans = new ArrayList<>();
//        List<Integer> ls =  new ArrayList<>();
//        boolean visited[] =  new boolean[nums.length];
//        permutation(ans, ls, visited, nums);
//        return ans;
//    }
//
//    private void permutation(List<List<Integer>> ans, List<Integer> ls, boolean[] visited, int[] nums ) {
//        if(ls.size()==nums.length)
//        {
//            ans.add(new ArrayList<>(ls));
//            return;
//        }
//
//        for(int i =0; i<nums.length; i++)
//        {
//            if(!visited[i])
//            {
//                visited[i] =  true;
//                ls.add(nums[i]);
//                permutation(ans, ls, visited, nums);
//                ls.remove(ls.size()-1);
//                visited[i] = false;
//            }
//        }
//
//    }
//}
