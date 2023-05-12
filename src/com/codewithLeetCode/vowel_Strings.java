package com.codewithLeetCode;

public class vowel_Strings {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int ans[] = new int[queries.length];
        int index = 0;
for(int i =0; i<queries.length; i++){
int arr[]= queries[i];

//Array of Strings is given
    String s = "";
    int count = 0;
    for(int k =0; k<words.length; k++){
        s = words[k];

        int j = 0;
        int l=  s.length()-1;
        if(s.charAt(j)=='a'||s.charAt(j)=='e' || s.charAt(j)=='o'||s.charAt(i)=='u')
        {
            if(s.charAt(l)=='a'||s.charAt(l)=='e' || s.charAt(l)=='o'||s.charAt(l)=='u'){
                count++;
            }
        }
    }
    ans[index] =  count;
    index++;



}


return ans;
    }
        public static void main(String[] args) {

    }
}
