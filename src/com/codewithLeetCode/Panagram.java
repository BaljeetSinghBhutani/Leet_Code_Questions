package com.codewithLeetCode;

import java.util.Scanner;

public class Panagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = new String[26];
        System.out.println(s.length());

        for(int i =0; i<s.length(); i++) {
            int a = (int)s.charAt(i);
            if(a<97 && a>122 && s.length()<26 || s.length()>26){
            System.out.println("False");
        }
        }


        {
            System.out.println(true);
        }



//        if(a<97 && a>122){
//            System.out.println("False");
//        }
//
//        }

//        System.out.println("True");



    }
}
