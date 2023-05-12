package com.codewithLeetCode;

import java.util.Stack;

public class Next_Greater_Element_ii {
    public int[] nextGreaterElements(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        for(int i = nums.length-2; i>=0; i--)
        {
            if(stack.isEmpty())
            {
                stack.push(nums[i]);
            }
            else if(stack.peek()<=nums[i])
            {
                while(!stack.isEmpty() && stack.peek()<=nums[i])
                {
                    stack.pop();
                }
                stack.push(nums[i]);
            }
            else{
                stack.push(nums[i]);
            }

        }

        int ans [] = new int[nums.length];
        int k  =  ans.length-1;
        for(int i =  nums.length; i>=0; i--)
        {
            if(stack.isEmpty()){
                ans[k] =  -1;
                k--;
                stack.push(nums[i]);
            }
            else if(stack.peek()<=nums[i])
            {
                while(!stack.isEmpty() && stack.peek()<=nums[i])
                {
                    stack.pop();
                }

                if(stack.isEmpty())
                {
                    ans[k] =  -1;
                    k--;
                    stack.push(nums[i]);
                }
                else{
                    ans[k] =  stack.peek();
                    k--;
                    stack.push(nums[i]);
                }
            }
            else{
                ans[k] =  stack.peek();
                k--;
                stack.push(nums[i]);
            }

        }



return ans;



    }
    public static void main(String[] args) {

    }
}
