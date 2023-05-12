package com.codewithLeetCode;

public class Compare_Version_Numbers {
    public int compareVersion(String version1, String version2) {

        int i =  0;
        int j   =0;
        while(i<version1.length() &&  j<version2.length()){
            int n1 =  0;
            int n2 = 0;

            while(i<version1.length() && version1.charAt(i) != '.')
            {
                n1 =  n1 * 10 + (version1.charAt(i)- '0');
            }
            while(j<version2.length() && version2.charAt(j) != '.')
            {
                n2 =  n2 * 10 + (version2.charAt(j)- '0');
            }

            if(n1>n2)
            {
                return 1;
            }
            else if(n2>n1){
                return -1;
            }
            i++;
            j++;

        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
