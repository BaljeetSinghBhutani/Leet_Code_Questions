package com.codewithLeetCode;

public class Rotate_Image {
    public static void rotate(int[][] matrix) {
//Step - 1 Transpose of the given matrix
int k  = matrix.length;
        for(int i =0; i<matrix.length; i++)
        {
            for(int j =i; j<k ; j++)
            {
//swap
                int temp  =  matrix[i][j];
                matrix[i][j] =  matrix[j][i];
                matrix[j][i] =  temp;


            }
//            k--;
        }

//        Step - 2 swap the elements cols wise

        for(int i =0; i<matrix.length; i++)
        {
            int j =0;
            int j1 =  matrix[i].length-1;

            while(j<=j1)
            {
int temp = matrix[i][j];
matrix[i][j] = matrix[i][j1];
matrix[i][j1] =  temp;
j++;
j1--;
            }
        }



    }

    public static void main(String[] args) {
int arr[][] = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    rotate(arr);
    for(int i  =0; i<arr.length; i++)
    {
        for(int j =0; j<arr[i].length; j++)
        {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }

    }
}
