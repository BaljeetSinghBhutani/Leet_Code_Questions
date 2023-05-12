package com.codewithLeetCode;

public class Max_ConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxcount =0;
        for(int  i  =0; i<nums.length; i++)
        {
            if(nums[i]==1){
                count++;
            }
            else{
                if(maxcount<count)
                {
                    maxcount = count;

                }
                count  =0;

            }
        }
        if(count>maxcount){
            return count;
        }
        return maxcount;
}
    public static void main(String[] args) {
int a = findMaxConsecutiveOnes(new int []{1, 0});
        System.out.println(a);

    }
}
