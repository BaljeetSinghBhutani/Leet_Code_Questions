package com.codewithLeetCode;

public class Cells_with_odd_value_in_a_Matrix {
    public static int oddCells(int m, int n, int[][] indices) {

int arr[][] = new int[m][n];
int count  = 0;
for(int i =0; i<indices.length; i++)
{
    int arr1[] = new int[indices[i].length];
    arr1 =  indices[i];
    int a  = arr1[0];
    int b = arr1[1];

    for(int j =0; j<arr[a].length; j++)
    {
   arr[a][j]  = arr[a][j] +1;
    }

    for(int k = 0; k<arr.length; k++){
        arr[k][b]=  arr[k][b]+ 1;
    }


}

        for(int  i = 0; i< m; i++){
            for(int j =0; j<n; j++)
            {
                if(arr[i][j]%2!=0)
                {
                    count++;
                }
            }
        }

return count;
    }
    public static void main(String[] args) {
int m  =  1;
int n  = 1;

int arr[][] =  {
        {0, 0},
        {0, 0}
};
int a  =oddCells(m, n, arr);
        System.out.println(a);
    }
}
