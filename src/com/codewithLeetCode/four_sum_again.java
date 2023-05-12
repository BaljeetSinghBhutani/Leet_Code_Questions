package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;



public class four_sum_again {
    public static void createRes(ArrayList<ArrayList<Integer>> ans, ArrayList<ArrayList<Integer>> smallans, int val)
    {
        for (ArrayList<Integer> sa: smallans) {
            sa.add(0, val);
            ans.add(sa);
        }



    }
      public  static ArrayList<ArrayList<Integer>> twoSum(int nums[], int target, int Si, int Ei)
      {
          ArrayList<ArrayList<Integer>> list = new ArrayList<>();
          while(Si<Ei)
          {
              int sum  = nums[Si]+ nums[Ei];
              if(sum>target){
                  Ei--;
              }
              else if(sum<target)
              {
                  Si++;
              }
              else {
                  list.add(new ArrayList(Arrays.asList(nums[Si], nums[Ei])));
                  Si++;
                  Ei--;

                  while(Si < Ei && nums[Si]==nums[Si-1]) Si++;
                  while(Si < Ei && nums[Ei]==nums[Ei+1]) Ei--;
              }
          }
          return list;
      }


      public  static ArrayList<ArrayList<Integer>> ThreeSum(int nums[],int target, int si, int ei){

          ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
          for(int i =  si; i<=ei; i++)
          {
              if(i!=si && nums[i]==nums[i-1])
                  continue;

              ArrayList<ArrayList<Integer>> smalllist = twoSum(nums , target-nums[i],i+1, ei);
              createRes(list, smalllist, nums[i]);


          }

          return list;

      }

   public  static ArrayList<ArrayList<Integer>> FourSum(int nums[], int target){
Arrays.sort(nums);
int si  = 0;
int ei =  nums.length-1;
          ArrayList<ArrayList<Integer>> list  = new ArrayList<>();
          for(int i =  si; i<=ei; i++)
          {
              if(i!=si && nums[i]==nums[i-1])
                  continue;

              ArrayList<ArrayList<Integer>> smalllist = ThreeSum(nums , target-nums[i],i+1, ei);
              createRes(list, smalllist, nums[i]);


          }

          return list;

      }

}
