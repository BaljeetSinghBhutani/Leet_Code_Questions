package com.codewithLeetCode;

public class pickgifts {
    public  static long pickGifts(int[] gifts, int k) {

    int l  =0;
    int max = 0;
    int index = -1;
    while(l<k) {
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] >= max) {
                max = gifts[i];
                index = i;
            }

        }

        int giftsleft = (int) Math.floor(Math.sqrt(max));
        gifts[index] = giftsleft;
max = 0;
l++;
    }

    long sum  = 0;
    for(int m = 0; m<gifts.length;m++)
    {
        sum+=gifts[m];
    }
    return sum;
    }
    public static void main(String[] args) {
        int gifts[] = {1,1,1,1};
long s  =pickGifts(gifts, 4);
        System.out.println(s);
    }
}
