package com.codewithLeetCode;

public class main {
    public static void main(String[] args) {
        Reorder_List rl = new Reorder_List();
        rl.insertLast(1);
        rl.insertLast(2);
        rl.insertLast(3);
        rl.insertLast(4);

        rl.reorder();
        rl.display();
    }
}
