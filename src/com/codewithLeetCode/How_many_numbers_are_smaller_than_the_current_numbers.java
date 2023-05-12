package com.codewithLeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class How_many_numbers_are_smaller_than_the_current_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];


        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;


                }

            }
            arr1[i] = count;

        }
        System.out.println(Arrays.toString(arr1));
    }
}


