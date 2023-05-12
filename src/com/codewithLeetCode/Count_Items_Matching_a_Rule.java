package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Count_Items_Matching_a_Rule {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count  =0 ;
if(ruleKey.equals("type")){
//    search in the first Index of the  List Item of the array
    for(int i =0; i<items.size(); i++)
    {
     String s = items.get(i).get(0);
     if(s.equals(ruleValue))
        count++;
    }
}

if(ruleKey.equals("color"))
{
//     search in the second Index of the list Item of the array
    for(int i =0; i<items.size(); i++)
    {
        String s = items.get(i).get(1);
        if(s.equals(ruleValue))
            count++;
    }

}
if(ruleKey.equals("name"))
{
//     search in the third Index of the list Item of the array
    for(int i =0; i<items.size(); i++)
    {
        String s = items.get(i).get(2);
        if(s.equals(ruleValue))
            count++;
    }

}
return count;
    }
    public static void main(String[] args) {




    }
}
