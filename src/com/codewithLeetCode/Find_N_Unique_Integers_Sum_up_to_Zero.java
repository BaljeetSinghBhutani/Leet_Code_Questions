package com.codewithLeetCode;

import java.util.Arrays;

public class Find_N_Unique_Integers_Sum_up_to_Zero {
    public static int[] sumZero(int n) {
int arr[] = new int[n];

if (n%2==0){
int mid  =  (n-1)/2;
    int a  = mid ;
    int b =  mid +1;
    int x = 1;
    int y  =1;

    while(a>=0){
        arr[a] =  -(x);
        x++;
        a--;
    }
    while (b<arr.length){
        arr[b] =  y;
        y++;

        b++;
    }





}


else{
int mid = (n-1)/2;
int a  = mid -1;
int b =  mid +1;
int x = 1;
int y  =1;

while(a>=0){
    arr[a] =  -(x);
    x++;
    a--;
}
while (b<arr.length){
  arr[b] =  y;
  y++;

    b++;
  }

}

return arr;
    }
    public static void main(String[] args) {
int n = 4;
        System.out.println(Arrays.toString(sumZero(n)));

    }
}
