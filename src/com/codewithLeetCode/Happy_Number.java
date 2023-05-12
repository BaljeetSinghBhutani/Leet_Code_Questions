package com.codewithLeetCode;

import java.util.HashMap;

public class Happy_Number {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        while(n!=1){

            n =  squaresofsumofNumbers(n);
if(map.containsKey(n)){
    return false;

}
else {
    map.put(n, 1);
}

        }
return true;

    }

    private int squaresofsumofNumbers(int n) {
        int squaresum = 0;
        while(n >0){
            int mod = n %10;
            n=  n/10;
            squaresum  =  (mod * mod) + squaresum;

        }

        return squaresum;
    }

    public static void main(String[] args) {

    }
}
