package com.codewithLeetCode;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Implement_Stack_Using_Queues {
//    Method -1  Using only one Queue

    class MyStack {

Queue<Integer> queue = new LinkedList<>();
        public MyStack() {
//
        }

        public void push(int x) {
            queue.add(x);
            for(int i  =1; i< queue.size(); i++)
            {
                queue.add(queue.remove());
            }

        }

        public int pop() {
            return queue.remove();

        }


        public int top() {
return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }

    }



//    Method -2 - Two Queue used
//    class MyStack {
//        Queue<Integer> queue = new ArrayDeque<>();
//        Queue<Integer> helperqueue = new ArrayDeque<>();
//        public MyStack() {
//
//        }
//
//        public void push(int x) {
//            if(queue.isEmpty())
//            {
//                queue.add(x);
//
//            }
//            else {
//                while(!queue.isEmpty()){
//                    helperqueue.add(queue.remove());
//                }
//                queue.add(x);
//
//                while(!helperqueue.isEmpty())
//                {
//                    queue.add(helperqueue.remove());
//                }
//            }
//
//        }
//
//        public int pop() {
// return queue.remove();
//        }
//
//        public int top() {
//return queue.peek();
//        }
//
//        public boolean empty() {
//return queue.isEmpty();
//        }
//    }
    public static void main(String[] args) {

    }
}
