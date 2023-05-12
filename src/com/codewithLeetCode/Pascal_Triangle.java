package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {
    public static List<List<Integer>> generate(int numRows) {
        if(numRows<=0)
        {
            return null;
        }
        List<List<Integer>>  list = new ArrayList<>();
        if(numRows == 1) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list.add(list1);
            return list;
        }
        if(numRows == 2)
        {
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(1);
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(1);
            list.add(list2);
            list.add(list1);
            return list;
        }
        else{
//    Generate a 2D matrix
//    int arr[][] = new int[numRows][];

            ArrayList<Integer> list1  = new ArrayList<>();
            list1.add(1);
            list.add(0,list1);
            ArrayList<Integer> list2  = new ArrayList<>();
            list2.add(1);
            list2.add(1);
            list.add(1, list2);


// arr[0][0] =  1;
// arr[1][0] =  1; arr[1][1] =1;


            for(int  i =2; i<numRows; i++)
            {
                ArrayList<Integer> list3  = new ArrayList<>(i +1);
                list3.add(0, 1);

                for(int j = 1; j <i; j++)
                {

                    List<Integer> getlist  = list.get(i-1);
                    list3.add(j, getlist.get(j-1) + getlist.get(j));
                }
                list3.add(i, 1);
                list.add(list3);
                list3 =  null;
            }


        }
        return list;

    }



    public static void main(String[] args) {
        List<List<Integer>>  list =   generate(5);
        System.out.println(list);
    }
}