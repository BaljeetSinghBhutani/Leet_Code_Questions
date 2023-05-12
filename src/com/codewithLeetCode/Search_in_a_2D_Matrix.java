package com.codewithLeetCode;

public class Search_in_a_2D_Matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int arr[] = new int[matrix.length * matrix[0].length];
        int k  =0 ;
        for(int i =0; i< matrix.length; i++)
        {
            for(int j =0; j< matrix[0].length;i++)
            {
               if(matrix[i][j]==target)
               {
                   return true;
               }
            }
        }

//          Binary Seach ink
return false;        
    }
    public static void main(String[] args) {

    }
}
