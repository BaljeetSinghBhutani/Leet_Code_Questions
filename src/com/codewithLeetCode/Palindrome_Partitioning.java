package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public List<List<String>> partition(String s) {

        List<List<String>> list = new ArrayList<>();
        List<String> res = new ArrayList<>();

        pallindromepartion(0,s,  list, res);

        return list;

    }

    private void pallindromepartion(int index, String s, List<List<String>> list, List<String> res) {
        if(index==s.length()){
            list.add(new ArrayList<>(res));
            return;
        }


        for(int i =index; i<s.length(); i++)
        {
            if(pallindrome(index, i, s)){
                res.add(s.substring(index, i+1));

                pallindromepartion(i+1, s, list, res);
                res.remove(res.size()-1);

            }
        }
    }

    private boolean pallindrome(int index, int i, String s) {

       int start =  index;
       int end = i;
       while(start<=end){
           if(s.charAt(start)!=s.charAt(end)){
               return false;
           }
           start++;
           end--;
       }
       return true;
    }

    public static void main(String[] args) {

    }
}
