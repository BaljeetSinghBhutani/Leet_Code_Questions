package com.codewithLeetCode;

public class Count_Inversion {
    static long merge(long  arr[], long l, long m, long r)
    {
        long mid = (l + r)/2;
        long i = l;
        long j  = mid +1;
long count_Inversion =0;


        long ans[] = new long [(int) (r-l+1)];
        long k = 0;

        while(i<=mid && j<=r){
            if(arr[(int) i]<=arr[(int) j]){
                ans[(int) k] =  arr[(int) i];
                i++;
                k++;
            }
            else {
                ans[(int) k] =  arr[(int) j];
                j++;
                k++;
                count_Inversion =  count_Inversion  +  mid-i+1;
            }

        }

        while(i<=mid){
            ans[(int) k] = arr[(int) i];
            k++;
            i++;

        }
        while(j<=r){
            ans[(int) k] = arr[(int) j];
            k++;
            j++;

        }

        for(int i1  =0; i1<ans.length; i1++)
        {
            arr[(int) (l + i1)] =  ans[i1];
        }

        return count_Inversion;

    }

    static long mergeSort(long arr[], long l, long r)
    {
        long count_Inversion  =0;
        if(l>=r){
            return count_Inversion;
        }
        long  mid = (l + r)/2;
        count_Inversion+= mergeSort(arr, l, mid); // left
        count_Inversion+= mergeSort(arr, mid+1, r); // right
        count_Inversion+=merge(arr, l, mid, r);

        return count_Inversion;
    }

    static long inversionCount(long arr[], long N) {

              return  mergeSort(arr, 0, arr.length-1);
    }

    public static void main(String[] args) {
        long arr[] = {2, 4, 1, 3, 5};

        long a  =inversionCount(arr, arr.length);
        System.out.println(a);
    }

}
