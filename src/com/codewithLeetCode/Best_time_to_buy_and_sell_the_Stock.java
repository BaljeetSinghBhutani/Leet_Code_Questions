package com.codewithLeetCode;

public class Best_time_to_buy_and_sell_the_Stock {
    public int maxProfit(int[] prices) {
        int ans  = 0;
int minSofar  = Integer.MAX_VALUE;
int maxprofit  = 0;


        for(int i  = 0; i<prices.length;i++)
        {
            if(prices[i]<minSofar)
            {
                minSofar = prices[i];

            }

            int profit =  prices[i] -  minSofar;
            if(profit>maxprofit)
            {
                maxprofit = profit;
            }
        }


ans = maxprofit;

        return ans;
    }

    public static void main(String[] args) {

    }
}
