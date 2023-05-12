package com.codewithLeetCode;

import java.util.Scanner;

public class Richest_customer_wealth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of the Array: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of the Array: ");
        int cols = sc.nextInt();
        int arr[] [] = new int[rows][cols];
        int max = 0;

        System.out.println("Enter the elements in the Array: ");
        for(int i = 0; i< arr.length; i++)
        {
            for(int j = 0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }


           for(int i = 0; i< arr.length; i++)
        {
            int sum = 0;

            for(int j = 0; j<cols; j++){
                sum = arr[i][j] + sum;


             }

            if(max<sum)
            {
                max = sum;
            }
        }
        System.out.println(max);
        }


    }

