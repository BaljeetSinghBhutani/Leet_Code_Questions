package com.codewithLeetCode;

import java.util.HashMap;

public class Check_if_a_Sentence_is_a_Panagram_or_not {

    public static boolean checkIfPangram(String sentence) {
// Method -2


        if (sentence.length() < 26) {
            return false;
        }
        String alphas = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphas.length(); i++) {
            if (sentence.indexOf(alphas.charAt(i)) == -1) {
                return false;
            }
        }
        return true;

    }

//        Method -1
//        HashMap<Character, Integer> map = new HashMap<>();
//        int count = 0;
//        for(int i=0; i<sentence.length(); i++) {
//            if (map.containsKey(sentence.charAt(i))) {
//              map.put(sentence.charAt(i), map.get(sentence.charAt(i)) +1);
//            } else {
//                map.put(sentence.charAt(i), 1);
//                count++;
//            }
//        }
//            if(count==26){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }


    public static void main(String[] args) {

String str = "leetcode";
boolean b = checkIfPangram(str);
        System.out.println(b);
    }
}
