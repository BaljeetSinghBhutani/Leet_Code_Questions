package com.codewithLeetCode;

public class Reverse_Integer {
    public static int reverse(int x) {
        long ans  =0;
        int q = x;
        if(x<0){
            x = -1 * x;
        }
        while(x>0){
            int y = x%10;
            x = x/10;
            ans  = ans*10 +y;
        }
        if(ans>=Integer.MAX_VALUE || ans<=Integer.MIN_VALUE){
            return 0;
        }
        else if(q<0){
            return (int) (-1 * ans);
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        int a = reverse(1534236469);
        System.out.println(a);
    }
}
