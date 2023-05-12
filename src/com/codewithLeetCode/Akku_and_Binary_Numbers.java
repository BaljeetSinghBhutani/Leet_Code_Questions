package com.codewithLeetCode;
import java.lang.*;
public class Akku_and_Binary_Numbers{
    void precompute(){

    }
    long solve(long l, long r){
int count  = 0;
        for(long i = l; i<=r; i++)
        {
            long countsetBit = Integer.bitCount((int) i);
            if(countsetBit==3)
            {
                count++;
            }

        }
return count;
    }

    public static void main(String[] args) {

    }
}
