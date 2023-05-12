package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinational_Sum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
List<List<Integer>> list = new ArrayList<>();
int index = 0;

CombineSum(index, candidates, target, list, new ArrayList<Integer>());
return list;


    }

    private void CombineSum(int index, int[] candidates, int target, List<List<Integer>> list, ArrayList<Integer> dc) {

        if (index == candidates.length) {
            if (target == 0) {
                list.add(new ArrayList<>(dc));
            }
            return;
        }

        if (candidates[index] <= target) {
            dc.add(candidates[index]);
            CombineSum(index, candidates, target - candidates[index], list, dc);
            dc.remove(dc.size()-1);
        }

      CombineSum(index+1, candidates, target, list, dc);
    }





    public static void main(String[] args) {

    }
}
