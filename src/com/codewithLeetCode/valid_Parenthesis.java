package com.codewithLeetCode;


import java.util.Stack;

public class valid_Parenthesis {
    public static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }

            if (stack.isEmpty()) {
                if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                    return false;
                }
            }
            if (!stack.isEmpty()) {
                if (s.charAt(i) == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
            if (!stack.isEmpty()) {
                if (s.charAt(i) == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }


            if (!stack.isEmpty()) {
                if (s.charAt(i) == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }


        }
        if (stack.empty()) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
String s = "(}";
        boolean b = isValid(s);
        System.out.println(b);

    }
}
