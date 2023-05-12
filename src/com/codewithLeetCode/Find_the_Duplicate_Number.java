package com.codewithLeetCode;

public class Find_the_Duplicate_Number {
    public int findDuplicate(int[] nums) {

//        Method -2
        int i =0;
        while(i<nums.length)
        {
            if(nums[i]!=i+1)
            {
                int value = nums[i]-1;
                if(nums[i]!=nums[value])
                {
//                    swap
                    int temp  = nums[i];
                    nums[i] =  nums[value];
                    nums[value] = temp;
                }
                else{
                    return nums[i];
                }
            }
            else {
                i++;
            }
        }



return -1;

    }
//        Method - 1
//           int i =0;
//           while(i<nums.length)
//           {
//               int val = nums[i]-1;
//
//               if(nums[i]<nums.length && nums[i]!=nums[val])
//               {
////                   swap
//                   int temp =  nums[i];
//                   nums[i] = nums[val];
//                   nums[val] =  temp;
//               }
//               else{
//                   i++;
//               }
//           }
//
//
//
//for(int i1 =0; i1<nums.length; i1++)
//{
//    if(nums[i1]!=1+1)
//    {
//        return nums[i1];
//    }
//}
//return 0;
//    }




    public static void main(String[] args) {

    }
}
