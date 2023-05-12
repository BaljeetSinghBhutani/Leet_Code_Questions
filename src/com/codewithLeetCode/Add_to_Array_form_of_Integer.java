package com.codewithLeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_form_of_Integer {
//     Method -2

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> list = new ArrayList<>();
        int i = num.length;
        int n = i - 1;
        while (n >= 0 || k > 0) {
            if (n >= 0) {
                list.add((num[n] + k) % 10);
                k = (num[n] + k )/10;
            }
            else {
                list.add(k % 10);
                k = k / 10;
            }
            n--;
        }

 Collections.reverse(list);
        return list;
    }



//     Method -1 will fail as constraint will not satisfy
//    public static List<Integer> addToArrayForm(int[] num, int k) {
//       long sum = 0;
//       int  count = 0;
////sum = num[0];
//        for (int i = 0; i < num.length; i++) {
//            sum = num[i] + (sum * 10);
//            count++;
//        }
//        sum = sum + k;
//        System.out.println(sum);
//
//        List<Integer> total = new ArrayList<>(count);
//
//     while(sum>0){
//            long l = sum%10;
//            sum =sum/10;
// total.add((int)l);
//        }
//     Collections.reverse(total);
//     return total;
//
//    }



    public static void main(String[] args) {
int arr[] = {2, 7, 4};
int k = 181;
List<Integer>  list = addToArrayForm(arr, k);
        System.out.println(list);


    }
}
