package com.codewithLeetCode;

import java.util.Scanner;

public class Number_of_good_pairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter the elemnts of the array: ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();

        }
        int good_pairs = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    good_pairs++;
                }
            }

        }
        System.out.println(good_pairs);
    }
}
