package com.codewithLeetCode;

public class Spiral_Matrix_II {
    public static int[][] generateMatrix(int n) {
int matrix[][] = new int[n][n];

        int top = 0;
        int down = matrix.length-1;
int k =1;
        int left = 0;
        int right = matrix[0].length-1;

// direction pointer
        int dir = 0;

        while(top<=down &&  left<=right){
            if (dir == 0) {

                for(int i =left; i<=right; i++)
                {
                    matrix[top][i]=k;
                    k++;
                }

                top++;
            }   else if (dir == 1) {

                for(int i =top; i<=down; i++)
                {
                    matrix[i][right]=k;
                    k++;
                }
                right--;


            }   else if (dir == 2) {

                for(int i =right; i>=left; i--)
                {
                    matrix[down][i]=k;
                    k++;
                }
                down--;
            }   else if (dir == 3) {

                for(int i = down; i>=top; i--)
                {
                    matrix[i][left]=k;
                    k++;
                }
                left++;
            }
            dir = (dir+1)%4;
        }
return matrix;
}
    public static void main(String[] args) {
int arr[][]= generateMatrix(3);
for(int i =0; i<arr.length; i++)
{
    for(int j =0; j<arr[0].length; j++)
    {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
    }
}
