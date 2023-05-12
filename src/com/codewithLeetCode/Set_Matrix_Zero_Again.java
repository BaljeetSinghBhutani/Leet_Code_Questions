package com.codewithLeetCode;


public class Set_Matrix_Zero_Again {
    public static void setZeroes(int[][] matrix) {
//        Method -2

//check whether in first cols 0 is present or not
        boolean a = false;
        for (int j = 0; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                a = true;
            }
        }


//check whether in first rows 0 is present or not

        boolean b = false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[i][0] == 0) {
                b = true;
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for (int i = 1; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < matrix[0].length; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < matrix.length; i++) {

                    matrix[i][j] = 0;
                }
            }
        }


        if (a) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        if (b) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }


//    Method - 1
//int arr[][] = new int [matrix.length][matrix[0].length];
//for(int i = 0; i< arr.length ; i++)
//{
//    for(int j  =0; j<arr[0].length; j++)
//    {
//arr[i][j] = matrix[i][j];
//    }
//}
//
//for(int i =0; i<matrix.length; i++)
//{
//    for(int j =0; j<matrix[0].length; j++)
//    {
//if(matrix[i][j]==0)
//{
//  int row =0;
//  int cols  = 0;
//
////  for entire  row to be set up as zero
//    while(row<= matrix.length)
//    {
//        arr[row][j] = 0;
//        row++;
//    }
////    for entire cols to be set up as zero
//    while(cols<=matrix[0].length)
//    {
//        arr[i][cols] =  0;
//        cols++;
//    }
//}
//    }
//}
//        for(int i = 0; i< arr.length ; i++)
//        {
//            for(int j  =0; j<arr[0].length; j++)
//            {
//           matrix[i][j] =  arr[i][j];
//            }
//        }
//
//    }
    }
    public static void main(String[] args) {
int matrix[][]  ={
        {0, 1, 2 ,0},
        {3, 4, 5, 2},
        {1, 3, 1, 5}
};
setZeroes(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}