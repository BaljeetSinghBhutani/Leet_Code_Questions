package com.codewithLeetCode;

import java.io.BufferedReader;

public class count_and_say {
    public static String countAndSay(int n) {

        if(n==1){
            return "1";
        }
        String s =  countAndSay(n-1);
StringBuilder str  = new StringBuilder();


//        String str  = "";

        int frequency = 0;

          int i =0;
            while(i<s.length())
                {
                    frequency++;
                    if(i+1 == s.length() || s.charAt(i)!=s.charAt(i+1))
                    {
//                        str = str + frequency + s.charAt(i);
                      str.append(frequency).append(s.charAt(i));
                        frequency = 0;
                    }
                    i++;
                }
return str.toString();

    }
    public static void main(String[] args) {
String  s  = countAndSay(4);
        System.out.println(s);
    }
}
