package com.codewithLeetCode;

import java.util.Scanner;

public class Flipping_an_Image {

    public int[]  reverse(int arr[]){
        int i = 0;
        int j = arr.length-1;
        while(i<=j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
            return arr;
    }

    public int[]  flip(int arr[]){
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i] == 0){
                arr[i] =  1;
            }
            else {
                arr[i] =  0;
            }
        }
return arr;
    }

    public int[][] flipAndInvertImage(int[][] image) {

        int arr[][]  = new int[image.length][image.length];
        for (int i = 0; i< image.length; i++)
        {
          arr[i]  =  reverse(image[i]);
          arr[i] = flip(arr[i]);
        }


        return arr;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int arr[][]  = new int[3][3];
for(int i =0; i<arr.length; i++)
{
    for(int j =0; j< arr.length; j++)
    {
        arr[i][j] =  sc.nextInt();
    }
}

    }
}
