package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Word_Break_II {
    public List<String> wordBreak(String s, List<String> wordDict) {

        List<String> ans = new ArrayList<>();
        String res = "";
        totalWordBreak(ans, s, wordDict, res);
                
                return ans;
        
    }

    private void totalWordBreak(List<String> ans, String s, List<String> wordDict, String res) {
        if(s.length()==0)
        {
//            ans.add(new String(res));

            ans.add(res);
            return;
        }


        for(int i= 0; i<s.length();i++)
        {
            String left =  s.substring(0, i+1);
            if(wordDict.contains(left)){
                String right =s.substring(i+1);
                        totalWordBreak(ans , right , wordDict , res+ left + " ");
            }


        }
    }

    public static void main(String[] args) {
        
    }
}
