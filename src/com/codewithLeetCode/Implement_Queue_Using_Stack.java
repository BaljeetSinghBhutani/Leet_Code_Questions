package com.codewithLeetCode;

import java.util.Stack;

public class Implement_Queue_Using_Stack {
    class MyQueue {
        Stack<Integer> stack =  new Stack<>();
        Stack<Integer> helperStack = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            if (stack.isEmpty()) {
                stack.push(x);
            } else {
                while (!stack.isEmpty()) {
                    helperStack.push(stack.pop());

                }
                stack.push(x);
                while (!helperStack.isEmpty()) {
                    stack.push(helperStack.pop());
                }

            }
        }
        public int pop() {
return stack.pop();
        }

        public int peek() {
return stack.peek();
        }

        public boolean empty() {
return stack.isEmpty();
        }
    }
    public static void main(String[] args) {

    }
}
