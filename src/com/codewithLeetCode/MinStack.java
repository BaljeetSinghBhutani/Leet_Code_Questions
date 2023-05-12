package com.codewithLeetCode;

import java.util.Stack;

public class MinStack {
    Stack<Long > stack =  new Stack<>();
    long min;


    public MinStack() {



    }

    public void push(int val) {
        Long value =  Long.valueOf(val);
        if(stack.isEmpty()){
            min = val;
            stack.push(value);
        }
        else if(value>=min){
           stack.push(value);
        }
        else{

            stack.push( value + value - min);
            min =  val;
        }
    }

    public void pop() {
 Long value  = stack.pop();


 if(value<min) {

     min = (2 * min) - value;
 }


    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        Long value  = stack.peek();
         if(stack.peek()>=min){
            return value.intValue();
        }
        else{
           return (int) min;
        }
    }


    public int getMin() {
        if(stack.isEmpty()){
            return -1;
        }
        return (int) min;
    }
    public static void main(String[] args) {

    }
}

//     Stack<Long> stack = new Stack<>();
//    Long mini;
//
//    public MinStack()
//    {
//        mini = Long.MAX_VALUE;
//    }
//
//    public void push(int val)
//    {
//        Long value = Long.valueOf(val);
//        if(stack.isEmpty())
//        {
//            mini =  value;
//            stack.push(value);
//        }
//        else
//        {
//            if(value < mini)
//            {
//                stack.push(2 * value - mini);
//                mini = value;
//            }
//            else
//            {
//                stack.push(value);
//            }
//        }
//    }
//
//    public void pop()
//    {
//        if(stack.isEmpty())
//        {
//            return;
//        }
//
//        Long value = stack.pop();
//        if(value < mini)
//        {
//            mini = 2 * mini - value;
//        }
//
//    }
//
//    public int top()
//    {
//        Long value = stack.peek();
//        if(value < mini)
//        {
//            return mini.intValue();
//        }
//        return value.intValue();
//    }
//
//    public int getMin()
//    {
//        return mini.intValue();
//    }