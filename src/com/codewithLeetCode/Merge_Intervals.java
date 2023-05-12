package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Merge_Intervals {

    static class Pair implements Comparable<Pair>{
        int st;
        int et;

        public Pair(int st, int et) {
            this.st = st;
            this.et = et;
        }

        @Override
//        this>other - return -+ve
//        this = other return - 0;
//        this < other - return -ve
        public int compareTo(Pair other) {
if(this.st!=other.st)
{
    return this.st - other.st;
}
else{
    return this.et - other.et;
}
        }
    }
    public static int[][] merge(int[][] arr) {
Pair [] pairs = new Pair[arr.length];
for(int i =0; i< arr.length; i++)
{
    pairs[i] = new  Pair(arr[i][0], arr[i][1]);

}
Arrays.sort(pairs);

Stack<Pair> stack = new Stack<>();
for(int i =0; i< pairs.length; i++)
{
    if(i==0){
        stack.push(pairs[i]);
    }
    else{
        Pair top = stack.peek();
        if(pairs[i].st >top.et)
        {
            stack.push(pairs[i]);
        }
        else{
            top.et = Math.max(top.et, pairs[i].et);

        }
    }
}

int ans[][] = new int[stack.size()][2];
int i =ans.length-1;

while(!stack.isEmpty())
{
    Pair p = stack.pop();
    ans[i][0] = p.st;
    ans[i][1] = p.et;
i--;
}

return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {{1, 3},
                {2, 6}};

     int ans [][] =   merge(arr);
     for(int i =0; i<ans.length;i++){
         for(int j =0; j<ans[i].length; j++)
         {
             System.out.print(ans[i][j] + " ");
         }
         System.out.println(" ");
     }
    }

}
