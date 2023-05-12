package com.codewithLeetCode;

import java.util.Stack;

public class StockSpanner {

    class Pair{
        int data;
        int index;
    }
    Stack<Pair> stack = new Stack<>();
    int ind  = 0;

    public StockSpanner() {
        Pair p =  new Pair();
        p.data =  Integer.MAX_VALUE;
        p.index = -1;
        stack.push(p);

    }

    public int next(int price) {
while(stack.peek().data<=price)
{
    stack.pop();
}
int ans = ind-stack.peek().index;
Pair p = new Pair();
p.data=price;
p.index = ind++;
stack.push(p);

return ans;
    }
}
