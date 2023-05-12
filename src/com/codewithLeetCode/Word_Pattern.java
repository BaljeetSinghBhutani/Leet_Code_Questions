package com.codewithLeetCode;

import java.util.HashMap;

public class Word_Pattern {
    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Boolean> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch1 = pattern.charAt(i);
            String s2 = words[i];

            if (map1.containsKey(ch1)) {
                String str = map1.get(ch1);
                if (!str.equals(words[i])) {
                    return false;
                }

            } else {
                if (map2.containsKey(words[i])) {
                    return false;
                } else {
                    map1.put(ch1, s2);
                    map2.put(s2, true);
                }

            }

        }
            return true;


    }
    public static void main(String[] args) {
        String s = "dog cat cat dog";
        String pattern  = "abba";

        boolean b = wordPattern(pattern, s);
        System.out.println(b);

    }
}
