package com.codewithLeetCode;

import javax.imageio.ImageTranscoder;
import java.util.HashMap;
import java.util.Set;

public class Maximum_Population_Year {
    public int maximumPopulation(int[][] logs) {


//         Method - 1
       int year[] = new int[101];
       int max = Integer.MIN_VALUE;
       int  y  = 0;

       for(int i =0; i<logs.length;i++)
       {
           for(int j =logs[i][0]; j<logs[i][1]; j++)
           {
               year[j- 1950]++;
           }
       }
        for(int i = 0; i<year.length;i++)
        {
            if(max>year[i])
            {
                max = year[i];
                y = i + 1950;
            }
        }
        return y;
        }


    public static void main(String[] args) {

    }
}
