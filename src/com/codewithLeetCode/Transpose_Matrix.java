package com.codewithLeetCode;

public class Transpose_Matrix {
    public static int[][] transpose(int[][] matrix) {
int rowl = matrix.length;
int col1 = matrix[0].length;

int arr[][] = new int[col1][rowl];
int  k  = 0;
for(int i=0; i< matrix.length; i++)
{
    int tranfer[] = matrix[i];

    for(int j =0; j<arr.length; j++)
    {
        arr[j][k] = tranfer[j];
    }
    k++;
}
return arr;

    }
    public static void main(String[] args) {
int arr[][] = {

        {1, 2, 3},
        {4, 5, 6},

};
 int mat [][] = transpose(arr);
 for(int i =0; i<mat.length; i++)
 {
     for(int j =0; j<mat[i].length;j++)
     {
         System.out.print(mat[i][j] + " ");
     }
     System.out.println();
 }

    }
}
