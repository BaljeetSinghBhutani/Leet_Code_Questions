package com.codewithLeetCode;

public class Determine_Whether_Martix_can_be_obtained_by_rotation {
    public static int [] [] rotation(int [] [] arr){


        int j = arr.length-1;
         int nums[] [] = new int[arr.length][arr.length];

         for(int k =0; k<arr.length && j>=0; k++) {
             int target[] = arr[j];

             for(int b = 0; b<nums.length; b++)
             {
                 nums[b][k] =  target[b];
             }
             j--;
         }

         return nums;
    }


    public static boolean check(int [] [] arr, int target[] []){

for(int i  =0; i<arr.length; i++)
{
    for(int j  =0 ; j<arr.length; j++)
    {
        if(arr[i][j]!=target[i][j])
        {
            return false;
        }
    }
}
return true;
    }



    public static boolean findRotation(int[][] mat, int[][] target) {
boolean c = check(mat, target);
    if(c){
        return c;
    }

        int count  =0;
        int arr[][] =  mat;
        while(count<3){
          arr =  rotation(arr);

            boolean b = check(arr, target);

            if(b){
                return b;
            }

            count++;
        }

        return false;

    }
    public static void main(String[] args) {
int mat1[] [] = {{0, 0},
        {0, 1},

};
int mat2[] [] = {{0, 0},
        {1, 0},

};
       boolean b = (findRotation(mat1, mat2));
        System.out.println(b);
    }
}
