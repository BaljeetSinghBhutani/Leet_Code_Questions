package com.codewithLeetCode;

public class Buy_and_sell_the_Stock {
    public int maxProfit(int[] prices) {
        int lsf =  Integer.MAX_VALUE;
        int op  = 0;
        int pist  = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i]<lsf){
                lsf  =  prices[i];

            }

            pist =  prices[i]-lsf;
            if(pist>op){
                op = pist;
            }
        }
        return op;
    }

    public static void main(String[] args) {

    }
}


