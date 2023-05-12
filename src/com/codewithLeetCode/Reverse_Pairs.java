package com.codewithLeetCode;

public class Reverse_Pairs {
    static int merge(int arr[], int l, int m, int r)
    {

        int count  =0;
        int mid = (l + r)/2;
        int i = l;
        int j  = mid +1;

//        Looking for nums[i]>2 * nums[j] and i<j
        int startIndex  = l;

        int middle  = (l + r)/2;
        int endIndex  = middle +1;

      for(int i1 = startIndex; i1<=middle; i1++)
      {
          while(endIndex<=r && arr[i1]> 2 * (long)arr[endIndex])
          {
              endIndex++;
          }
          count  =  count  + endIndex - (middle + 1);
        }

//        End of this

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

        return count;
    }
    static int mergeSort(int arr[], int l, int r)
    {
        int count  =0;
        if(l>=r){
            return count;
        }
        int mid = (l + r)/2;
        count +=mergeSort(arr, l, mid); // left
        count +=mergeSort(arr, mid+1, r); // right
        count +=merge(arr, l, mid, r);


return count;
    }

    public static int reversePairs(int[] nums) {
//        Method -2

       return mergeSort(nums, 0, nums.length-1);

    }

//        Method -1
//        int count  = 0;
//for(long i =0; i<nums.length;i++)
//{
//    for(long j =0; j<nums.length; j++)
//    {
//        if((long)nums[(int) i]> (long) 2 * nums[(int) j] && i<j)
//            count++;
//    }
//}
//return count;



    public static void main(String[] args) {
int nums[] ={1, 2, 3, 2, 3, 1};
int a  =reversePairs(nums);
        System.out.println(a);


    }


}
