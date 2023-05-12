package com.codewithLeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayfromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int input [] = new int[size];
        System.out.print("Enter the input in the Array: ");
        for(int i = 0; i<input.length ; i++){
            if(input[i]<0 || input[i]>input.length-1)
            {
                return;
//                No Permutaion of Array
            }
            else{
                input[i] = sc.nextInt();
            }
        }
        System.out.println("Your Original Array is: ");
        System.out.println(Arrays.toString(input));

        int output[] = new int[size];
        for(int i = 0; i <output.length; i++){
            output[i] = input[input[i]];
        }
        System.out.println("Your array after Permutation");
        System.out.println(Arrays.toString(output));
    }
}
