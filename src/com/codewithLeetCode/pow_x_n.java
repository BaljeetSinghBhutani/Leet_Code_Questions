package com.codewithLeetCode;

public class pow_x_n {
    public  static double myPow(double x, int n) {
        return Pow(x, n);
    }

    public static double Pow(double x, long n) {
//        Method -2 - TimeComplexity(O(log n))

        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        if(n<0) {
            return Pow(1/x, -n);
        }

        double result  = Pow(x *x, n/2);
        if(n%2==1){
            result =  result*x;
        }
        return result;


//         Method -1
//        return Math.pow(x, n);
    }
    public static void main(String[] args) {
//myPow(2, 5);
myPow(2, 4);
//myPow(2, -2);
    }
}
