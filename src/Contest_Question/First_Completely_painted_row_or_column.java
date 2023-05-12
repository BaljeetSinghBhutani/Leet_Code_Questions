package Contest_Question;

import java.util.HashMap;

public class First_Completely_painted_row_or_column {


    public int firstCompleteIndex(int[] arr, int[][] mat) {
int ans  = 0;

        HashMap<Integer, Boolean> map =  new HashMap<>();
        for(int i  =0; i<mat.length; i++ )
        {
            for(int j=0; j<mat[i].length; j++)
            {
                map.put(mat[i][j], false);
            }
        }

        for(int i  =0; i<arr.length; i++)
        {
              int num  = arr[i];
//            search in the matrix

            map.put(arr[i], true);

//            check in the matrix for any particular row or column

            if(checkMatrix(map, mat))
            {
                ans  = arr[i];
                return ans;
            }

        }
return -1;
    }

    private boolean checkMatrix(HashMap<Integer, Boolean> map, int[][] mat) {

//        check for rows are true or not

        for(int i=0; i<mat.length; i++)
        {
           int arr[] =  mat[i];
//           int count = 0;
           for(int j = 0; j<arr.length; j++)
           {
               if(!map.get(arr[j]))
               {
                   return false;
               }
           }
        }


//        check for the column
int i1 = 0;
        for(int j=0; j<mat.length; j++)
        {
            i1  = 0;
           int arr[] = new int [mat.length];
           for(int i =0; i<arr.length; i++)
            {
                arr[i]  = mat[i1][j];
                i1++;

            }
           for(int i=0; i<arr.length; i++)
           {
               if(!map.get(arr[i]))
               {
                   return false;
               }
           }

        }
        return true;
    }

    public static void main(String[] args) {

    }
}
