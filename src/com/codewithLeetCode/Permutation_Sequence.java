package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutation_Sequence {


//Method -2
public  String getPermutation(int n, int k) {
int factorial = 1;
List<Integer> number  = new ArrayList<>();
for(int i = 1; i<n; i++)
{
      number.add(i);
      factorial*=factorial;
}

number.add(n);
k = k-1;

String ans = "";
while (true)
{

    ans+=number.get(k/factorial);
    number.remove(k/factorial);
    if(number.size()==0)
    {
        break;
    }
    k = k%factorial;
    factorial = factorial/number.size();

}


return ans;



}



    //Method -1 TLE
//    public  String getPermutation(int n, int k) {
//
//
//        int num = 0;
//        int nums[] = new int[n];
//        for (int i = 1; i <= n; i++) {
//            num += num * 10 + i;
//            nums[i - 1] = i;
//        }
//
//
//        List<List<Integer>> list = permute(nums);
//
//
//        List<Integer> ls = list.get(k - 1);
//
//        String ans = "";
//
//        for (int i = 0; i < ls.size(); i++) {
//            ans += ls.get(i);
//        }
//
//
//        return ans;
//
//
//    }
//
//    private  List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> list = new ArrayList<>();
//        boolean visited[] = new boolean[nums.length];
//        List<Integer> ans = new ArrayList<>();
//        permuataion(list, ans, visited, nums);
//        return list;
//    }
//
//    private void permuataion(List<List<Integer>> list, List<Integer> ans, boolean[] visited, int[] nums) {
//        if (ans.size() == nums.length) {
//            list.add(new ArrayList<>(ans));
//            return;
//        }
//
//
//        for (int i =0; i<nums.length; i++)
//        {
//            if(!visited[i]) {
//                visited[i] = true;
//                ans.add(nums[i]);
//          permuataion(list, ans, visited, nums);
//
//                visited[i] = false;
//                ans.remove(ans.size()-1);
//            }
//        }
//
//    }



    public static void main(String[] args) {


    }
}

