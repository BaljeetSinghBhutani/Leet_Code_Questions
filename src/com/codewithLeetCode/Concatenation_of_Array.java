package com.codewithLeetCode;

import java.util.Arrays;
import java.util.Scanner;
public class Concatenation_of_Array {
    public static void main(String[] args) {


                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the array: ");
                int size = sc.nextInt();
                int arr[] = new int[size];

                System.out.println("Enter the elemnts in the array");
                for(int i = 0; i < arr.length; i++){
                    arr[i] = sc.nextInt();
                }

                int n = arr.length;
                int arr1[] = new int[2*n];

                for(int i = 0; i < arr.length; i++){
                    arr1[i] = arr[i];
                    arr1[i+n]= arr[i];

                }

                System.out.println("The elements after concatenation are: ");
                System.out.println(Arrays.toString(arr1));

            }
        }

