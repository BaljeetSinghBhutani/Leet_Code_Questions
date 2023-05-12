package com.codewithLeetCode;

import java.util.ArrayList;

public class Create_Target_Array_in_the_Given_Order {
    public int[] createTargetArray(int[] nums, int[] index) {

int target [] = new int[index.length];

ArrayList<Integer> list = new ArrayList<>();

for(int k =0; k< index.length; k++)
{
//    int ansindex = index[k];
    list.add(index[k], nums[k]);

}
for(int i=0; i<list.size(); i++){
    target[i] = list.get(i);
}

        return target;
    }




    public static void main(String[] args) {

    }
}
