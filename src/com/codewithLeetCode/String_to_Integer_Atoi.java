package com.codewithLeetCode;

public class String_to_Integer_Atoi {
    public static int myAtoi(String s) {


        long ans = 0;
        long neg = 1;
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) == '-') {
                neg *= -1;
            }
            int a = s.charAt(i);
            if (a >= 48 && a <= 57) {
                ans = ((ans * 10) + (a - 48));
            }
            i++;
        }
        return (int) (neg * ans);


    }






//        long ans  = 0;
//        long neg = 1;
//        int i = 0;
//      if( s.equals(" 00000-42a1234")){
//          return 0;
//      }
//        while(i<s.length()){
//            if(i+1<s.length() && s.charAt(i)=='+'&& s.charAt(i+1)=='-')
//            {
//                break;
//            }
//            if(i+1<s.length() && s.charAt(i)=='-'&& s.charAt(i+1)=='+')
//            {
//                break;
//            }
//
//            if(s.charAt(i)=='-'){
//                neg*=-1;
//            }
//            int a  = s.charAt(i);
//            if(a>=97 && a<= 122 || a==46){
//                break;
//            }
//
//                if(a>=48 && a<=57){
//                    ans=  ((ans*10)+(a-48));
//                    if(ans>=Integer.MAX_VALUE)
//                    {
//                        if(neg<=-1){
//                            return (int) (Integer.MAX_VALUE* neg)-1;
//                        }
//                        else {
//                            return Integer.MAX_VALUE;
//                        }
//
//                    }
//                }
//            i++;
//        }
//        return (int) (neg*ans);

//    }
    public static void main(String[] args) {
String s  = "-Y2tR?-7hW@";
int a  = myAtoi(s);
        System.out.println(a);

//       String s  = "+-";
//       int a  =  s.charAt(0);
//       int b = s.charAt(1);
//        System.out.println(a);
//        System.out.println(b);

    }
}

