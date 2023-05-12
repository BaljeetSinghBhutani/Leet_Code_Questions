package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {

    public static int lengthOfLongestSubstring(String str) {
//        Method - failed
        HashMap<Character, Integer> map  = new HashMap<>();
       if(str.equals(" "))
       {
           return 1;
       }

       int i = -1;
       int j = -1;
       int size  =0;

       while(true){
           boolean flag1 = false;
           boolean flag2 = false;

           while(i<str.length()-1) {
               flag1 = true;
               i++;

               char ch = str.charAt(i);
               map.put(ch, map.getOrDefault(ch, 0) + 1);

               int len  = i-j;

               if (map.get(ch) == 2) {
                   break;
               }
               else{
                   if(len>size){
                       size = len;
                   }
               }
           }

               while(j<i){
                   flag2 = true;
                   j++;

                   char ch =  str.charAt(j);
                   map.put(ch, map.get(ch)-1);

                 if(map.get(ch)==1)
                 {
                     break;
               }
           }

               if(flag1 == false && flag2 == false){
                   break;
               }

       }
       return size;
    }
    public static void main(String[] args) {
String s  = "ababcdede";
int a = lengthOfLongestSubstring(s);
        System.out.println(a);
//        System.out.println(s.length());
    }
}
