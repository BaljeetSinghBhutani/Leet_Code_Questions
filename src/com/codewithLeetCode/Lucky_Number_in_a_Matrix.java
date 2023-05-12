package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Lucky_Number_in_a_Matrix {

    public  static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int colslength  = matrix.length;
        for(int i = 0; i<matrix.length; i++)
        {
            int arr1[] = matrix[i];
            int index  =0;
            int min = Integer.MAX_VALUE;
            int k = 0;
         while(k<arr1.length)
         {
             if(arr1[k]<min){
                 min = arr1[k];
                 index =k;
             }
             k++;
         }
            int j = 0;
         int max = Integer.MIN_VALUE;
         while(j<colslength ){
            if(matrix[j][index]>max){
                max = matrix[j][index];
            }
            j++;
         }
         if(max==min){
          list.add(max);
//          return list;
         }
        }
return list;
    }
    public static void main(String[] args) {
int arr[][] = {{7, 8},
        {1, 2},


};

List<Integer> list  = luckyNumbers(arr);
for(int i =0;  i< list.size(); i++)
{
int a = (list.get(i));
    System.out.println(a);
}
    }
}
