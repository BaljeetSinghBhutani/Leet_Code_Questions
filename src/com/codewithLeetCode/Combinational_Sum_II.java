package com.codewithLeetCode;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class Combinational_Sum_II {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();

        CombineSum(0,candidates, target, list, new ArrayList<>());

        return list;

    }

    private  static void CombineSum(int index, int[] candidates, int target, List<List<Integer>> list, ArrayList<Integer> dc) {

        if(target==0){
            list.add(new ArrayList<>(dc));
            return;
        }


        for(int i =index; i<candidates.length; i++){
            if(i>index && candidates[i]==candidates[i-1])continue;
            if(target<candidates[i]){
                break;
            }
            dc.add(candidates[i]);
            CombineSum(i+1, candidates, target-candidates[i], list, dc);
            dc.remove(dc.size()-1);

        }

    }

    public static void main(String[] args) {
int candidates [] =  {2,5,2,1,2};
int target = 5;

List<List<Integer>>  list =  combinationSum2(candidates, target);
        System.out.println(list);

    }
}
