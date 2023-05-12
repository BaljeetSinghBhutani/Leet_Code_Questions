package com.codewithLeetCode;

public class Minimum_Cost_to_move_Chips_to_the_same_position {
    public int minCostToMoveChips(int[] position) {
        int even = 0;
        int odd = 0;

        for(int  i =0; i<position.length; i++){
            if(position[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }

        return Math.min(even, odd);
    }
    public static void main(String[] args) {

    }
}
