package com.codewithLeetCode;

import java.util.ArrayList;

public class Reorder_List {
 ListNode head;
    ListNode tail;
 int size;


    public  void insertFirst(int val)
    {
        ListNode newNode  = new ListNode(val);

        newNode.next = head;
        head  = newNode;
        if(tail==null) {
            tail = head;
        }

        size++;
    }

    public void insertLast(int val)
    {
        ListNode newNode  = new ListNode(val);

        if(tail==null){
            insertFirst(val);
        }
        else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }

    }

    public  void display(){
        ListNode temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

    }


public void reorder(){
        reorderList(head);
}
    public ListNode get(int index) {
        ListNode node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void reorderList(ListNode head) {
    int i =0;
    int j = size-1;
    ListNode ans =  new ListNode();
    ListNode temp = ans;
    while (i<=j){
        ListNode left  = get(i);
        ans.next = left;
        ans = ans.next;
        ListNode right = get(j);
        ans.next = right;
         i++;
         j--;
    }
    head = temp.next;

    }


}
