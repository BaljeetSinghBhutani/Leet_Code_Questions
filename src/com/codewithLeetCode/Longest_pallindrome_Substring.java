package com.codewithLeetCode;

public class Longest_pallindrome_Substring {
    public static String longestPalindrome(String s) {
        boolean dp[][] = new boolean[s.length()][s.length()];

        for (int g =0; g<s.length();g++)
        {
            for(int i = 0, j = g; j<s.length(); i++, j++)
            {
                if(g==0)
                {
                    dp[i][j] = true;
                } else if (g==1) {
                    dp[i][j] =  s.charAt(i)==s.charAt(j);
                }
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1])
                    {
                        dp[i][j]= true;
                    }
                }

            }
        }
String ans = "";
        for(int g = s.length()-1; g>=0; g--)
        {
            for(int i = 0, j =  g; j<s.length(); i++, j++)
            {
                if(dp[i][j]==true)
                {
                    ans+=s.substring(i, j+1);
                    return ans;
                }
            }
        }
        return ans+=s.charAt(0);
    }

    public static void main(String[] args) {
String str ="ccc";
String asn  =  longestPalindrome(str);
        System.out.println(asn);

    }
}
