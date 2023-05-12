package com.codewithLeetCode;

import java.util.Arrays;

public class Merge_Sort {
    static void merge(int arr[], int l, int m, int r)
    {
        int mid = (l + r)/2;
int i = l;
int j  = mid +1;


int ans[] = new int [r-l+1];
int k = 0;

while(i<=mid && j<=r){
    if(arr[i]<=arr[j]){
        ans[k] =  arr[i];
        i++;
        k++;
    }
    else {
        ans[k] =  arr[j];
        j++;
        k++;
    }

}

while(i<=mid){
    ans[k] = arr[i];
    k++;
    i++;

}
while(j<=r){
    ans[k] = arr[j];
    k++;
    j++;

}

for(int i1  =0; i1<ans.length; i1++)
{
    arr[l + i1] =  ans[i1];
}

    }
   static void mergeSort(int arr[], int l, int r)
    {
if(l>=r){
    return;
}
        int mid = (l + r)/2;
        mergeSort(arr, l, mid); // left
        mergeSort(arr, mid+1, r); // right
        merge(arr, l, mid, r);



    }

    public static void main(String[] args) {
        int arr[] =  {3, 2, 1};
        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

}
