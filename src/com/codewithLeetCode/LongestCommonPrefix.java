package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        String ans ="";


  char[] arr1 =  strs[0].toCharArray();
  char[] arr2 =  strs[strs.length-1].toCharArray();

        int i =0;
        int j =0;
        while(i< arr1.length && j< arr2.length)
        {
            if(arr1[i]==arr2[j])
            {
                ans+=arr1[i];
                i++;
                j++;
            }
            else{
                break;
            }
        }



        return ans;


    }
    public static void main(String[] args) {

    }
}
