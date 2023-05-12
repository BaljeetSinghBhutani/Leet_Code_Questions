package com.codewithLeetCode;

public class Matrix_Daigonal_Sum {
    public static int diagonalSum(int[][] mat) {

        int length = mat.length;
        int sum = 0;
        if (length % 2 != 0) {
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][i];
            }
            int k = mat.length - 1;

            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][k];
                k--;

            }
            int mid = (0 + mat.length) / 2;
            sum = sum - mat[mid][mid];
        } else {
            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][i];

            }
            int k = mat.length - 1;

            for (int i = 0; i < mat.length; i++) {
                sum += mat[i][k];
                k--;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
        int mat[] []  = {
                {1, 1,1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1,1 }
        };

        System.out.println(diagonalSum(mat));

    }
}
