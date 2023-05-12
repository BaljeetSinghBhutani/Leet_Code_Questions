package com.codewithLeetCode;

public class Reverse_Words_in_a_String {
    public static String reverseWords(String s) {


        int i  = s.length()-1;
        String ans  = "";

        while(i>=0)
        {
            while(i>=0 && s.charAt(i)==' ')
            {
                i--;
            }
            int j = i;
            while(i>=0 &&s.charAt(i)!=' ')
            {
                i--;
            }
          if(ans.isEmpty())
          {
            ans+=s.substring(i+1, j+1);
          }
          else{
             ans+=' ';
             ans+=s.substring(i+1, j+1);
          }
        }
           return ans;
        }


    public static void main(String[] args) {
String sr  = "The sky is blue";
String ans = reverseWords(sr);
        System.out.println(ans);
    }
}
