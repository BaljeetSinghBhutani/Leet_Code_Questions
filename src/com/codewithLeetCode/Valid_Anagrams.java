package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Valid_Anagrams {
    public boolean isAnagram(String s, String t) {

char a[] = s.toCharArray();
char b[] =  t.toCharArray();

List<Character> list1 = new ArrayList<>();
for(int i =0;i<a.length; i++)
{
    list1.add(a[i]);
}
List<Character> list2 = new ArrayList<>();

        for(int i =0;i<b.length; i++)
        {
            list2.add(b[i]);
        }

        Collections.sort(list1);
        Collections.sort(list2);

if(list1.size()!=list2.size())
{
    return false;
}
for(int i =0; i<list1.size(); i++)
{
    if(list1.get(i)!=list2.get(i))
    {
        return false;
    }
}
return true;



    }
    public static void main(String[] args) {

    }
}
