package com.codewithLeetCode;

public class Roman_to_Integer {
    public static void main(String[] args) {

        String s = "MCMXCIV";


int sum =0;
int result =0;

int i =0;
        for(; i<s.length()-1; i++) {

            if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                sum = -1;
            } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                sum = -1;
            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                sum = -10;
            } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                sum = -10;
            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                sum = -100;
            } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                sum = -100;
            } else if (s.charAt(i) == 'I') {
                sum = 1;
            } else if (s.charAt(i) == 'V') {
                sum = 5;
            } else if (s.charAt(i) == 'X') {
                sum = 10;
            } else if (s.charAt(i) == 'L') {
                sum = 50;
            } else if (s.charAt(i) == 'C') {
                sum = 100;
            } else if (s.charAt(i) == 'D') {
                sum = 500;
            } else if (s.charAt(i) == 'M') {
                sum = 1000;
            }

            result = sum + result;
        }

            if(i == s.length()-1){
                if (s.charAt(i)== 'I'){
                    sum =1;
                }
                else if(s.charAt(i)== 'V'){
                    sum =5;
                } else if(s.charAt(i)== 'X'){
                    sum =10;
                }else if(s.charAt(i)== 'L'){
                    sum =50;
                } else if(s.charAt(i)== 'C'){
                    sum =100;
                } else if(s.charAt(i)== 'D'){
                    sum =500;
                } else if(s.charAt(i)== 'M'){
                    sum =1000;
                }
                result = sum + result;
            }



        System.out.println(result);
    }
}
