package com.codewithLeetCode;

import java.io.LineNumberInputStream;

public class RemoveNthNodefromtheEndoftheLinkedList {
    public ListNode removeNthFromEnd(ListNode head, int k) {
//        Method - 2
        if(head==null) {
            return null;
        }
       ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast  = dummy;
        ListNode slow  = dummy;

       for(int i =0; i<k; i++)
       {
           fast  = fast.next;
       }
       if(fast.next==null)
       {
         return dummy.next.next;
       }

       while(fast.next!=null)
       {
           fast = fast.next;
           slow = slow.next;
       }

       slow.next  = slow.next.next;

       return dummy.next;

//        Method - 1

//if(head==null )
//{
//    return null;
//}
//if(head.next==null && k==1)
//{
//    return null;
//}
//
////Length of the Linked List
//        int length  = 0;
//ListNode temp = head;
//while(temp!=null)
//{
//    length++;
//    temp = temp.next;
//
//}
//if(length == k)
//{
//    head = head.next;
//    return head;
//}
//        ListNode ans  = head;
//for(int i =0; i<length - k-1; i++)
//{
//    ans  = ans.next;
//
//}
//if(ans.next !=null)
//{
//    ListNode t1 = ans.next.next;
// ans.next = t1;
//}
//else {
//    ans.next = null;
//}
//return head;
    }
}
