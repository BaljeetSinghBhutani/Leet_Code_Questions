package com.codewithLeetCode;

public class Reshape_the_Matrix {
    public  static int[][] matrixReshape(int[][] mat, int r, int c) {

        int length  =  mat.length * mat[0].length;
        if(length!=(r*c)){
            return mat;
        }
   int arr[][] = new int[r][c];
        int i1  =0;
        int j1  =0;
        for(int i =0; i< mat.length; i++)
        {for(int j = 0; j<mat[i].length;j++)
            {
             if(j1>=arr[i1].length)
             {
                 i1++;
                 j1 = 0;
             }

             arr[i1][j1] = mat[i][j];
             j1++;

            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int mat  [][] = {{1, 2},
                {3, 4}
        };


        int r = 1;
        int c  = 4;
int arr[] [] = matrixReshape(mat, r, c);

for(int i  =0; i< arr.length; i++)
{
    for(int j =0; j<arr[i].length; j++)
    {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

    }
}
