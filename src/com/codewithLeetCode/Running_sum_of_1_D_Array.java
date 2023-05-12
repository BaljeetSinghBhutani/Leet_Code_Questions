package com.codewithLeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Running_sum_of_1_D_Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[]  = new int[size];
        int sum = 0;


        System.out.println("Enter the elements in the array: ");
        for(int i = 0; i <arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("******** Running Sum *******");
        for(int i = 0; i < arr.length; i++){


             for(int j =i; j<=i; j++){
                 sum = arr[j] + sum ;
             }
               arr[i] = sum;
            }
        System.out.println(Arrays.toString(arr));
    }
}
