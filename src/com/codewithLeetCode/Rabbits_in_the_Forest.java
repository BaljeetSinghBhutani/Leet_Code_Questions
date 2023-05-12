package com.codewithLeetCode;

import java.util.HashMap;

public class Rabbits_in_the_Forest {
    public int numRabbits(int[] answers) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int val: answers) {
            map.put(val, map.getOrDefault(val, 0)+1);
        }
           int ans = 0;
        for (int key: map.keySet()) {
            int gs =  key+1;
            int reportees  = map.get(key);
             int ng  = (int) Math.ceil((reportees *1.0)/gs*1.0);
            int res = ng * gs;
ans+=res;
        }
        return ans;

    }
    public static void main(String[] args) {

    }
}
