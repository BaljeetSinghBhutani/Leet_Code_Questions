package com.codewithLeetCode;

import java.util.HashMap;

public class HappyNumber {
    public static boolean isHappy(int n) {

//Method -2
int slow = n;
int fast  = n;

        do{
            slow = square(slow);
            fast = square(square(fast));

            if(slow==1 ||  fast == 1){
                return true;
            }
        }while(fast!=slow);
        return false;
    }

    private static int square(int n){
        int sum  =0;
        while (n>0){
            int rem = n%10;
            sum+=rem*rem;
            n /=10;

        }
        return sum;
    }



//Method -1

//        HashMap<Integer, Integer> map  = new HashMap<>();
//        while (n>=2){
//            int x = n;
//            int sum = 0;
//
//            while(x>0){
//                int y = x%10;
//                sum+=y*y;
//                x = x/10;
//
//            }
//            if(map.size()==0) {
//                map.put(n, 1);
//            }
//            else if (map.containsKey(n)) {
//                return false;
//            }
//            else{
//                map.put(n, 1);
//            }
//            n= sum;
//        }
//        return true;


    public static void main(String[] args) {
boolean b = isHappy(19);
        System.out.println(b);
    }
}
