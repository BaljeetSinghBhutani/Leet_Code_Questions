package com.codewithLeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Shuffle_the_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the half size of the Array : ");
        int size = sc.nextInt();
        int arr[] = new int[ 2 * size];
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        int x = arr.length-1;

        System.out.print("Enter the elements in the Array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] =  sc.nextInt();
        }
        for(int i = 0; i<size; i++){
            arr1[i] = arr[i];
       }

        for( int i=0;i<size; i++) {
            arr2[i] = arr[i];
        }



        System.out.println(Arrays.toString(arr));
    }
}

//    int[] arr= new int[nums.length];
//    int k=0;
//        for (int i=0; i<n;i++){
//        arr[k]=nums[i];
//        arr[++k]=nums[i+n];
//        k++;
//        }