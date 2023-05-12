package com.codewithLeetCode;

public class Longest_Comman_prefix {
    public static void main(String[] args) {

      String strs[] = {"dog","racecar","car"};
      String str = "";
      String str1 = "";

      int i =0;
for( ;i< strs.length-2; i++) {
    int k = Math.min(strs[i].length(), strs[i + 1].length());
    int j = k;
    for (k = 0; k < j; k++) {
        String c = strs[i].substring(k, k + 1);
        String d = strs[i + 1].substring(k, k + 1);
        if (c.charAt(0) == d.charAt(0)) {
            str += c.charAt(0);
        }

    }
}
    if(i==strs.length-2)    {
        int k1 = Math.min(str.length(), strs[i+1].length());
                int j1 = k1;
       str1 = "";
        for(k1 =0; k1<j1; k1++)
        {
            char c1 = str.charAt(k1);
            String d1 = strs[i+1].substring(k1, k1+1);
            if(c1 == d1.charAt(0)){
                str1+=c1;
            }
        }
    }


        System.out.println(str1);

    }
}
